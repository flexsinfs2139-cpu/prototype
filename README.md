# Prototype

A Flutter project configured with automated artifact export and release versioning.

## Overview

- **Application ID / Package:** `com.prototype`
- **Flutter SDK:** `>=3.13.4`

## Features & Build Automation

### Automated Release Renaming & Export
When building release APKs or App Bundles, a custom Gradle task automatically copies and renames the output artifact to the root `releases/` directory.

- **Naming Convention:**
  ```
  <applicationId>_v<versionName>+<versionCode>_<yyyyMMdd_HHmmss>.<apk|aab>
  ```
- **Example Output:**
  ```
  releases/com.prototype_v1.0.0+1_20261027_154940.apk
  ```
- **Benefits:**
  - Persists safely outside the `build/` folder (won't be deleted by `flutter clean`).
  - Supports split ABIs and build variant suffixes (e.g. `-debug`, `-profile`, `-arm64-v8a`).

## Getting Started

### Prerequisites
- [Flutter SDK](https://docs.flutter.dev/get-started/install) installed and configured.
- Android SDK & Java 17.

### Running the App
```bash
# Get dependencies
flutter pub get

# Run on connected device / emulator
flutter run
```

### Building Releases

```bash
# Build release APK
flutter build apk --release

# Build release App Bundle (AAB for Play Store)
flutter build appbundle --release
```

Renamed builds will automatically be generated inside the project's root `releases/` directory.
