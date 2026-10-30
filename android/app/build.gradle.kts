import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

plugins {
    id("com.android.application")
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.prototype"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = flutter.ndkVersion

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    defaultConfig {
        // TODO: Specify your own unique Application ID (https://developer.android.com/studio/build/application-id.html).
        applicationId = "com.prototype"
        // You can update the following values to match your application needs.
        // For more information, see: https://flutter.dev/to/review-gradle-config.
        minSdk = flutter.minSdkVersion
        targetSdk = flutter.targetSdkVersion
        // Uses the version code from pubspec.yaml. When using split APKs, 1000 * ABI_VERSION
        // is added automatically by Flutter. (https://developer.android.com/studio/build/configure-apk-splits#configure-APK-versions)
        // You can force using the value of versionCode by specifying the `-P force-version-code-ignoring-abi=true`
        // flag during build.
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    buildTypes {
        release {
            // TODO: Add your own signing config for the release build.
            // Signing with the debug keys for now, so `flutter run --release` works.
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17
    }
}

flutter {
    source = "../.."
}

// After each APK/AAB build, copies the output under the name
// <applicationId>_<versionName>_<versionCode>_<yyyyMMdd_HHmmss>.<apk|aab>
// (debug/profile builds get a -debug/-profile suffix, split ABIs keep theirs).
// Copies to the root project's `releases/` folder so it persists across `flutter clean`.
// Flutter's tool expects the original app-<type>.<ext> names in build/, so those files are kept.
listOf("debug", "profile", "release").forEach { buildType ->
    val variant = buildType.replaceFirstChar { it.uppercase() }
    val appId = android.defaultConfig.applicationId
    val versionName = android.defaultConfig.versionName
    val versionCode = android.defaultConfig.versionCode
    val baseName = "${appId}_v${versionName}+${versionCode}"

    // (gradle task to hook, extension, AGP output dir)
    listOf(
        listOf("assemble$variant", "apk", "outputs/apk/$buildType"),
        listOf("bundle$variant", "aab", "outputs/bundle/$buildType"),
    ).forEach { (hookTask, ext, srcPath) ->
        val srcDir = layout.buildDirectory.dir(srcPath)
        val releaseDir = rootProject.rootDir.resolve("../releases")

        val copyNamed = tasks.register("copyNamed$variant${ext.replaceFirstChar { it.uppercase() }}") {
            doLast {
                val stamp = LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"))
                // Only pick up AGP's own app-*.<ext> outputs, not previously named copies.
                val files = srcDir.get().asFile.listFiles { file ->
                    file.extension == ext && file.name.startsWith("app-")
                } ?: return@doLast

                if (!releaseDir.exists()) {
                    releaseDir.mkdirs()
                }

                for (file in files) {
                    // "app-arm64-v8a-release.apk" -> "arm64-v8a"; "app-release.aab" -> "".
                    val abi = file.nameWithoutExtension.removePrefix("app-")
                        .removeSuffix(buildType).trimEnd('-')
                    val suffix = listOfNotNull(
                        abi.ifEmpty { null },
                        buildType.takeIf { it != "release" },
                    ).joinToString("") { "-$it" }
                    val target = releaseDir.resolve("${baseName}_$stamp$suffix.$ext")
                    file.copyTo(target, overwrite = true)
                    println("Named ${ext.uppercase()}: ${target.absolutePath}")
                }
            }
        }

        tasks.matching { it.name == hookTask }.configureEach {
            finalizedBy(copyNamed)
        }
    }
}

