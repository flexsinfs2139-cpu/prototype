# Senior Flutter Developer Roadmap

**Level:** Intermediate → Senior/Lead
**Duration:** 24 Weeks
**Weekly Commitment:** 3–5 Hours
**Target Platforms:** Android, iOS, Web
**Learning Approach:** Practical implementation, production-grade engineering, and continuous testing.

---

## 1. Learning Objectives

By completing this roadmap, the goal is to develop competency in:

- [ ] Advanced Dart programming and asynchronous programming.
- [ ] Flutter framework internals and rendering.
- [ ] Riverpod state management and dependency injection.
- [ ] Feature-first architecture and Clean Architecture.
- [ ] REST API integration using Dio and Retrofit.
- [ ] Production-grade testing.
- [ ] Authentication and application security.
- [ ] Local persistence and offline support.
- [ ] Navigation and deep linking.
- [ ] Material 3 and custom design systems.
- [ ] Advanced performance engineering.
- [ ] Android, iOS, and Web platform considerations.
- [ ] CI/CD and automated code quality.
- [ ] Logging, monitoring, and crash reporting.
- [ ] Scalable codebase design and engineering practices.

---

# 2. Recommended Technology Stack

## Core Development

- [ ] Flutter SDK
- [ ] Dart
- [ ] Android Studio
- [ ] VS Code
- [ ] Flutter DevTools

## Architecture

- [ ] Feature-first architecture
- [ ] Clean Architecture
- [ ] Repository Pattern
- [ ] Dependency Inversion
- [ ] Separation of Concerns

## State Management and Dependency Injection

- [ ] Riverpod
- [ ] flutter_riverpod
- [ ] riverpod_annotation
- [ ] riverpod_generator
- [ ] Provider overrides for testing

## Networking and API Integration

- [ ] Dio
- [ ] Retrofit
- [ ] retrofit_generator
- [ ] json_serializable
- [ ] json_annotation

## Data and Local Persistence

- [ ] Drift
- [ ] SQLite
- [ ] shared_preferences
- [ ] flutter_secure_storage

## Navigation

- [ ] go_router
- [ ] Nested navigation
- [ ] Deep linking
- [ ] Authentication redirects

## UI and Design System

- [ ] Material 3
- [ ] Custom ThemeData
- [ ] ThemeExtension
- [ ] Design tokens
- [ ] Responsive layouts
- [ ] Adaptive layouts
- [ ] Accessibility

## Forms and Validation

- [ ] Flutter Form
- [ ] TextFormField
- [ ] Custom validators
- [ ] Reusable form components

## Testing

- [ ] flutter_test
- [ ] Unit testing
- [ ] Widget testing
- [ ] Integration testing
- [ ] Mocktail
- [ ] Golden testing where useful
- [ ] Test coverage analysis

## Code Quality and Code Generation

- [ ] flutter_lints
- [ ] Strict Dart analysis
- [ ] dart format
- [ ] build_runner
- [ ] Dependency auditing

## Performance Engineering

- [ ] Flutter DevTools
- [ ] Performance profiling
- [ ] CPU profiling
- [ ] Memory profiling
- [ ] Frame rendering analysis
- [ ] Isolates
- [ ] Image optimization
- [ ] Startup optimization

## CI/CD and Monitoring

- [ ] GitHub Actions
- [ ] Automated testing
- [ ] Pull request quality gates
- [ ] Structured logging
- [ ] Sentry or Firebase Crashlytics
- [ ] Performance monitoring

---

# 3. Detailed 24-Week Roadmap

# Phase 1: Dart and Flutter Foundations

**Duration:** Weeks 1–4
**Objective:** Strengthen Dart fundamentals and understand Flutter's underlying behavior.

## Week 1: Advanced Dart Fundamentals

### Dart Language

- [ ] Review null safety and sound type system.
- [ ] Understand generics and generic constraints.
- [ ] Understand extension methods.
- [ ] Understand records and patterns.
- [ ] Understand sealed classes.
- [ ] Understand mixins and extensions.
- [ ] Practice immutable data structures.
- [ ] Understand exception handling.
- [ ] Understand Dart type inference.

### Asynchronous Programming

- [ ] Understand Future and async/await.
- [ ] Understand Stream and StreamSubscription.
- [ ] Understand broadcast streams.
- [ ] Understand Stream transformations.
- [ ] Understand error propagation.
- [ ] Understand cancellation and resource cleanup.
- [ ] Understand event loop and microtasks.
- [ ] Practice concurrent asynchronous operations.

### Practical Tasks

- [ ] Build a reusable Result type.
- [ ] Implement typed application errors.
- [ ] Create a small asynchronous data-processing module.
- [ ] Write unit tests for the module.

**Deliverable:** Strong Dart fundamentals and testable asynchronous code.

## Week 2: Flutter Fundamentals and Internals

### Widget System

- [ ] Understand StatelessWidget and StatefulWidget.
- [ ] Understand Widget, Element, and RenderObject.
- [ ] Understand widget lifecycle.
- [ ] Understand BuildContext.
- [ ] Understand keys and their use cases.
- [ ] Understand inherited widgets.
- [ ] Understand widget composition.

### Rendering and Layout

- [ ] Understand Flutter's rendering pipeline.
- [ ] Understand constraints and sizing.
- [ ] Understand layout and paint phases.
- [ ] Understand layout invalidation.
- [ ] Understand repaint boundaries.
- [ ] Understand widget rebuilds.
- [ ] Understand const constructors.

### Practical Tasks

- [ ] Build reusable custom widgets.
- [ ] Experiment with GlobalKey and ValueKey.
- [ ] Create custom layouts using LayoutBuilder.
- [ ] Investigate rebuild behavior.
- [ ] Inspect widget and render trees using DevTools.

**Deliverable:** Understanding of Flutter's widget and rendering architecture.

## Week 3: Riverpod State Management

### Riverpod Fundamentals

- [ ] Understand ProviderContainer.
- [ ] Understand Provider.
- [ ] Understand NotifierProvider.
- [ ] Understand AsyncNotifierProvider.
- [ ] Understand provider dependencies.
- [ ] Understand provider lifecycle.
- [ ] Understand auto-dispose.
- [ ] Understand provider overrides.
- [ ] Understand immutable state.
- [ ] Understand asynchronous state transitions.

### Advanced State Management

- [ ] Separate UI state from business logic.
- [ ] Implement loading, success, and error states.
- [ ] Implement form state management.
- [ ] Implement pagination state.
- [ ] Implement dependent providers.
- [ ] Understand family providers.
- [ ] Understand select and selective rebuilds.
- [ ] Understand state invalidation and refresh.

### Practical Tasks

- [ ] Implement a counter using Riverpod.
- [ ] Implement a task-list provider.
- [ ] Implement asynchronous API state.
- [ ] Implement provider overrides in tests.
- [ ] Test loading, error, and success scenarios.

**Deliverable:** A reusable and testable Riverpod state-management foundation.

## Week 4: Material 3 and Custom Design System

### Flutter UI

- [ ] Understand Material 3.
- [ ] Understand ThemeData.
- [ ] Implement light and dark themes.
- [ ] Understand ColorScheme.
- [ ] Implement typography tokens.
- [ ] Implement spacing tokens.
- [ ] Implement reusable buttons.
- [ ] Implement reusable input components.
- [ ] Implement reusable cards.
- [ ] Implement ThemeExtension.

### Responsive and Adaptive UI

- [ ] Understand MediaQuery.
- [ ] Understand LayoutBuilder.
- [ ] Implement responsive layouts.
- [ ] Implement adaptive navigation.
- [ ] Handle mobile and desktop/web breakpoints.
- [ ] Understand safe areas.
- [ ] Test different viewport sizes.

### Practical Tasks

- [ ] Create a custom design system.
- [ ] Build reusable UI components.
- [ ] Implement a responsive dashboard.
- [ ] Implement theme switching.
- [ ] Test UI at mobile, tablet, and desktop widths.

**Deliverable:** Reusable Material 3-based design system.

---

# Phase 2: Architecture and Backend Integration

**Duration:** Weeks 5–8
**Objective:** Build maintainable applications with production-grade REST API integration.

## Week 5: Feature-First and Clean Architecture

### Architecture Fundamentals

- [ ] Understand Clean Architecture.
- [ ] Understand dependency inversion.
- [ ] Understand separation of concerns.
- [ ] Understand repository pattern.
- [ ] Understand domain entities.
- [ ] Understand data models.
- [ ] Understand use cases.
- [ ] Understand dependency boundaries.

### Project Structure

- [ ] Create app layer.
- [ ] Create core layer.
- [ ] Create feature modules.
- [ ] Separate presentation, domain, and data.
- [ ] Establish naming conventions.
- [ ] Define import boundaries.
- [ ] Establish shared component conventions.

### Practical Tasks

- [ ] Create authentication feature structure.
- [ ] Create dashboard feature structure.
- [ ] Create repository contracts.
- [ ] Implement one simple use case.
- [ ] Write architecture documentation.

**Deliverable:** Feature-first Clean Architecture project foundation.

## Week 6: Networking with Dio and Retrofit

### Dio

- [ ] Understand Dio configuration.
- [ ] Configure base URLs.
- [ ] Configure request timeouts.
- [ ] Implement request interceptors.
- [ ] Implement response interceptors.
- [ ] Implement error interceptors.
- [ ] Handle HTTP status codes.
- [ ] Implement request cancellation.
- [ ] Configure environment-specific endpoints.

### Retrofit

- [ ] Understand Retrofit annotations.
- [ ] Generate typed API clients.
- [ ] Understand request and response models.
- [ ] Implement JSON serialization.
- [ ] Handle nullable API fields.
- [ ] Handle API response inconsistencies.
- [ ] Understand generated code management.

### Practical Tasks

- [ ] Create a centralized Dio client.
- [ ] Create Retrofit API services.
- [ ] Implement typed API models.
- [ ] Integrate a REST API.
- [ ] Handle network errors.
- [ ] Test API services.

**Deliverable:** Reusable typed REST networking layer.

## Week 7: Repository Pattern and API State

### Repository Implementation

- [ ] Implement repository interfaces.
- [ ] Implement repository classes.
- [ ] Separate remote data sources.
- [ ] Implement DTO-to-domain mapping.
- [ ] Standardize application errors.
- [ ] Implement pagination.
- [ ] Implement filtering and sorting.
- [ ] Implement request cancellation.
- [ ] Understand retry policies.
- [ ] Prevent duplicate requests where appropriate.

### Practical Tasks

- [ ] Build a task repository.
- [ ] Integrate repository with Riverpod.
- [ ] Implement paginated task listing.
- [ ] Implement search and filters.
- [ ] Implement pull-to-refresh.
- [ ] Handle empty and error states.

**Deliverable:** Complete API-driven feature using Clean Architecture.

## Week 8: Navigation and Dependency Injection

### go_router

- [ ] Configure go_router.
- [ ] Implement named routes.
- [ ] Implement nested navigation.
- [ ] Implement route parameters.
- [ ] Implement query parameters.
- [ ] Implement authentication redirects.
- [ ] Implement deep links.
- [ ] Understand browser URL behavior.
- [ ] Test navigation and back-stack behavior.

### Dependency Injection

- [ ] Understand Riverpod as a dependency injection mechanism.
- [ ] Register repositories through providers.
- [ ] Inject API clients through providers.
- [ ] Implement provider overrides.
- [ ] Understand dependency lifecycle.
- [ ] Avoid unnecessary global service locators.

### Practical Tasks

- [ ] Implement application routing.
- [ ] Implement protected routes.
- [ ] Implement login/logout navigation.
- [ ] Test deep links.
- [ ] Test web refresh and navigation.

**Deliverable:** Navigation and dependency management foundation.

---

# Phase 3: Production-Grade Testing

**Duration:** Weeks 9–12
**Objective:** Build reliable applications with meaningful automated test coverage.

## Week 9: Unit Testing

- [ ] Understand test structure.
- [ ] Understand arrange-act-assert.
- [ ] Understand test isolation.
- [ ] Test domain entities.
- [ ] Test use cases.
- [ ] Test business rules.
- [ ] Test repository implementations.
- [ ] Test DTO mapping.
- [ ] Test error handling.
- [ ] Understand fakes and mocks.

### Practical Tasks

- [ ] Write unit tests for authentication logic.
- [ ] Write unit tests for repositories.
- [ ] Test success scenarios.
- [ ] Test failure scenarios.
- [ ] Test invalid data.
- [ ] Use Mocktail where appropriate.

**Deliverable:** Reliable domain and data-layer unit tests.

## Week 10: Widget Testing

- [ ] Understand WidgetTester.
- [ ] Understand testWidgets.
- [ ] Test widget rendering.
- [ ] Test user interactions.
- [ ] Test form validation.
- [ ] Test navigation.
- [ ] Test loading indicators.
- [ ] Test empty states.
- [ ] Test error states.
- [ ] Override Riverpod providers in tests.

### Practical Tasks

- [ ] Test login screen.
- [ ] Test registration screen.
- [ ] Test dashboard.
- [ ] Test task list.
- [ ] Test task creation form.
- [ ] Test responsive UI behavior.

**Deliverable:** Reliable widget-level test suite.

## Week 11: Integration Testing

- [ ] Understand integration_test.
- [ ] Configure integration testing.
- [ ] Understand test environments.
- [ ] Test complete authentication flow.
- [ ] Test navigation flows.
- [ ] Test API-driven features.
- [ ] Test local persistence.
- [ ] Test application lifecycle.
- [ ] Test important platform-specific behaviors.

### Practical Tasks

- [ ] Test login and logout.
- [ ] Test task creation.
- [ ] Test task updates.
- [ ] Test task deletion.
- [ ] Test application restart.
- [ ] Test critical flows on Android and Web.
- [ ] Add representative iOS integration coverage.

**Deliverable:** End-to-end coverage for critical application workflows.

## Week 12: Advanced Testing Practices

- [ ] Understand golden testing.
- [ ] Understand screenshot-based regression testing.
- [ ] Test network failures.
- [ ] Test request timeouts.
- [ ] Test duplicate submissions.
- [ ] Test session expiration.
- [ ] Test concurrency-sensitive behavior.
- [ ] Analyze test coverage.
- [ ] Identify untested business rules.
- [ ] Establish test naming conventions.

**Deliverable:** Production-grade testing strategy.

---

# Phase 4: Persistence, Offline Support and Security

**Duration:** Weeks 13–16
**Objective:** Build reliable applications that handle local data, network failures, and authentication safely.

## Week 13: Local Persistence with Drift

- [ ] Understand SQLite fundamentals.
- [ ] Understand relational database design.
- [ ] Understand Drift architecture.
- [ ] Define database tables.
- [ ] Implement database queries.
- [ ] Understand transactions.
- [ ] Implement schema migrations.
- [ ] Understand indexes.
- [ ] Understand reactive queries.
- [ ] Evaluate web database support and persistence limitations.

### Practical Tasks

- [ ] Create a local task database.
- [ ] Implement CRUD operations.
- [ ] Implement filtering.
- [ ] Implement sorting.
- [ ] Implement database tests.
- [ ] Test schema migrations.

**Deliverable:** Local persistence layer.

## Week 14: Caching and Offline Support

- [ ] Understand cache invalidation.
- [ ] Understand cache expiration.
- [ ] Implement cached reads.
- [ ] Implement stale-data indicators.
- [ ] Handle offline states.
- [ ] Handle connectivity recovery.
- [ ] Understand synchronization.
- [ ] Prevent duplicate synchronization.
- [ ] Handle failed writes appropriately.
- [ ] Understand conflict-resolution strategies.

### Practical Tasks

- [ ] Implement cached task listing.
- [ ] Display cached data during network failure.
- [ ] Refresh data when connectivity returns.
- [ ] Handle stale data.
- [ ] Test offline scenarios.

**Deliverable:** Reliable cached-data experience.

## Week 15: Authentication and Application Security

### Authentication

- [ ] Understand JWT authentication.
- [ ] Understand access tokens.
- [ ] Understand refresh tokens.
- [ ] Implement login.
- [ ] Implement logout.
- [ ] Implement token refresh.
- [ ] Prevent concurrent refresh requests.
- [ ] Handle expired sessions.
- [ ] Handle revoked sessions.
- [ ] Implement authenticated Dio requests.

### Security

- [ ] Understand Android Keystore.
- [ ] Understand iOS Keychain.
- [ ] Understand secure storage limitations.
- [ ] Understand browser cookie security.
- [ ] Understand HttpOnly and SameSite cookies.
- [ ] Understand CORS and CSRF.
- [ ] Avoid storing secrets in application code.
- [ ] Avoid logging credentials and tokens.
- [ ] Validate deep links and redirect destinations.
- [ ] Review platform-specific security configuration.

**Deliverable:** Production-ready authentication architecture.

## Week 16: Session and Security Testing

- [ ] Test token expiration.
- [ ] Test refresh-token rotation.
- [ ] Test refresh failures.
- [ ] Test logout cleanup.
- [ ] Test simultaneous unauthorized requests.
- [ ] Test protected routes.
- [ ] Test web session behavior.
- [ ] Test secure-storage failures.
- [ ] Review dependency vulnerabilities.
- [ ] Document authentication decisions.

**Deliverable:** Tested authentication and session management.

---

# Phase 5: Advanced Performance Engineering

**Duration:** Weeks 17–20
**Objective:** Diagnose and improve application performance across mobile and web.

## Week 17: Flutter Rendering Performance

- [ ] Understand frame rendering.
- [ ] Understand 60 Hz and high-refresh-rate displays.
- [ ] Understand frame budgets.
- [ ] Identify UI jank.
- [ ] Understand build and layout costs.
- [ ] Analyze unnecessary rebuilds.
- [ ] Understand repaint boundaries.
- [ ] Optimize list rendering.
- [ ] Understand lazy loading.
- [ ] Use Flutter DevTools Performance view.

### Practical Tasks

- [ ] Profile a complex dashboard.
- [ ] Identify unnecessary rebuilds.
- [ ] Optimize expensive widgets.
- [ ] Profile large lists.
- [ ] Record before-and-after measurements.

**Deliverable:** Performance analysis report.

## Week 18: Memory and CPU Optimization

- [ ] Understand Dart memory management.
- [ ] Understand garbage collection.
- [ ] Investigate memory leaks.
- [ ] Understand object retention.
- [ ] Understand isolate architecture.
- [ ] Implement compute for appropriate CPU-intensive tasks.
- [ ] Optimize image decoding.
- [ ] Optimize image caching.
- [ ] Investigate application startup time.
- [ ] Profile CPU usage.

**Deliverable:** Optimized application memory and CPU behavior.

## Week 19: Web Performance and Platform Engineering

- [ ] Understand Flutter Web rendering.
- [ ] Understand browser rendering constraints.
- [ ] Understand web application startup.
- [ ] Profile browser performance.
- [ ] Optimize large web lists.
- [ ] Understand browser storage limitations.
- [ ] Test browser refresh.
- [ ] Test deep linking.
- [ ] Test responsive breakpoints.
- [ ] Evaluate accessibility and keyboard navigation.

**Deliverable:** Responsive and performant Flutter Web experience.

## Week 20: Performance Benchmarking

- [ ] Define measurable performance targets.
- [ ] Establish baseline measurements.
- [ ] Profile representative screens.
- [ ] Identify actual bottlenecks.
- [ ] Optimize expensive operations.
- [ ] Measure frame performance.
- [ ] Measure startup performance.
- [ ] Measure memory usage.
- [ ] Compare before-and-after results.
- [ ] Document optimization decisions.

**Deliverable:** Performance benchmark report.

---

# Phase 6: Code Quality, CI/CD and Senior Engineering

**Duration:** Weeks 21–24
**Objective:** Establish engineering standards and production-readiness practices.

## Week 21: Code Quality and Static Analysis

- [ ] Configure flutter_lints or an agreed stricter lint set.
- [ ] Enable strict Dart analysis where practical.
- [ ] Configure formatting rules.
- [ ] Establish naming conventions.
- [ ] Establish file organization conventions.
- [ ] Review dependency management.
- [ ] Audit third-party packages.
- [ ] Establish generated-code conventions.
- [ ] Review code duplication.
- [ ] Document coding standards.

**Deliverable:** Consistent code-quality standards.

## Week 22: CI/CD with GitHub Actions

- [ ] Understand GitHub Actions.
- [ ] Configure workflow files.
- [ ] Run dart format checks.
- [ ] Run flutter analyze.
- [ ] Run unit tests.
- [ ] Run widget tests.
- [ ] Configure integration test execution where practical.
- [ ] Establish pull-request checks.
- [ ] Configure branch protection.
- [ ] Understand build environments.
- [ ] Configure Android build validation.
- [ ] Configure iOS build validation on macOS runners.
- [ ] Configure Web build validation.

**Deliverable:** Automated Flutter CI pipeline.

## Week 23: Observability and Monitoring

- [ ] Understand structured logging.
- [ ] Implement centralized logging.
- [ ] Understand crash reporting.
- [ ] Integrate Sentry or Firebase Crashlytics as appropriate.
- [ ] Capture application errors.
- [ ] Capture relevant diagnostic context.
- [ ] Implement environment-aware logging.
- [ ] Understand performance monitoring.
- [ ] Review privacy implications.
- [ ] Avoid logging sensitive information.
- [ ] Establish production debugging practices.

**Deliverable:** Application diagnostics and crash reporting.

## Week 24: Architecture Review and Final Assessment

### Architecture Review

- [ ] Review project structure.
- [ ] Review feature boundaries.
- [ ] Review dependency direction.
- [ ] Review repository contracts.
- [ ] Review state-management implementation.
- [ ] Review error-handling strategy.
- [ ] Review persistence strategy.
- [ ] Review authentication architecture.
- [ ] Review navigation architecture.
- [ ] Identify architectural duplication.

### Production Readiness

- [ ] Run complete test suite.
- [ ] Run static analysis.
- [ ] Review security configuration.
- [ ] Review application performance.
- [ ] Verify Android behavior.
- [ ] Verify iOS behavior.
- [ ] Verify Web behavior.
- [ ] Review accessibility.
- [ ] Review application logging.
- [ ] Document known limitations.

### Engineering Documentation

- [ ] Create architecture documentation.
- [ ] Create setup documentation.
- [ ] Document environment configuration.
- [ ] Document API integration.
- [ ] Document testing strategy.
- [ ] Document CI workflows.
- [ ] Document major architectural decisions.
- [ ] Create a technical debt register.

**Deliverable:** A production-style Flutter application with documented engineering standards.

---

# 4. Recommended Project Structure

Start with a single application repository. Introduce separate Dart packages only when module boundaries and reuse justify them.

```text
lib/
├── app/
│   ├── app.dart
│   ├── router/
│   └── theme/
│
├── core/
│   ├── network/
│   ├── errors/
│   ├── storage/
│   ├── logging/
│   ├── constants/
│   └── design_system/
│
├── features/
│   ├── authentication/
│   │   ├── presentation/
│   │   │   ├── screens/
│   │   │   ├── widgets/
│   │   │   └── providers/
│   │   ├── domain/
│   │   │   ├── entities/
│   │   │   ├── repositories/
│   │   │   └── use_cases/
│   │   └── data/
│   │       ├── models/
│   │       ├── data_sources/
│   │       └── repositories/
│   │
│   └── dashboard/
│       ├── presentation/
│       ├── domain/
│       └── data/
│
└── main.dart
```

---

# 5. Engineering Standards

Apply these standards throughout the roadmap.

## Code Quality

- [ ] Keep business logic outside widgets.
- [ ] Avoid unnecessary abstractions.
- [ ] Prefer immutable state.
- [ ] Use meaningful naming.
- [ ] Avoid oversized widgets and providers.
- [ ] Handle asynchronous failures explicitly.
- [ ] Keep dependencies injectable.
- [ ] Avoid circular dependencies.

## Testing

- [ ] Test business-critical logic.
- [ ] Test repository behavior.
- [ ] Test asynchronous states.
- [ ] Test network failures.
- [ ] Test authentication flows.
- [ ] Test important user journeys.
- [ ] Keep tests deterministic.
- [ ] Avoid depending on live external APIs in unit tests.

## Performance

- [ ] Profile before optimizing.
- [ ] Avoid unnecessary widget rebuilds.
- [ ] Use lazy rendering for large collections.
- [ ] Dispose resources correctly.
- [ ] Avoid blocking the UI isolate.
- [ ] Optimize images and expensive computations.
- [ ] Measure actual performance improvements.

## Security

- [ ] Never hardcode secrets.
- [ ] Avoid logging sensitive information.
- [ ] Protect authentication sessions.
- [ ] Handle token refresh safely.
- [ ] Validate untrusted inputs.
- [ ] Review third-party dependencies.
- [ ] Apply platform-specific security controls.

---

# 6. Weekly Progress Tracking

Use this checklist to track the roadmap.

- [ ] Phase 1: Dart and Flutter Foundations
- [ ] Phase 2: Architecture and Backend Integration
- [ ] Phase 3: Production-Grade Testing
- [ ] Phase 4: Persistence, Offline Support and Security
- [ ] Phase 5: Advanced Performance Engineering
- [ ] Phase 6: Code Quality, CI/CD and Senior Engineering

## Completion Criteria

The roadmap should not be considered complete merely because all topics have been studied.

You should be able to:

- [ ] Design a Flutter application architecture independently.
- [ ] Explain why you chose Riverpod and how dependencies flow.
- [ ] Build maintainable REST API integrations.
- [ ] Implement reliable authentication and session management.
- [ ] Write meaningful unit, widget, and integration tests.
- [ ] Diagnose and fix real performance issues.
- [ ] Build responsive applications for Android, iOS, and Web.
- [ ] Establish CI quality gates.
- [ ] Review architecture and identify technical debt.
- [ ] Explain engineering trade-offs and justify technical decisions.

---

# 7. Learning Resources

Use official documentation as the primary reference.

| Topic | Resource |
|---|---|
| Dart | https://dart.dev/language |
| Flutter | https://docs.flutter.dev/ |
| Flutter Architecture | https://docs.flutter.dev/app-architecture |
| Flutter Testing | https://docs.flutter.dev/testing |
| Flutter Performance | https://docs.flutter.dev/perf |
| Flutter DevTools | https://docs.flutter.dev/tools/devtools |
| Riverpod | https://riverpod.dev/ |
| Dio | https://pub.dev/packages/dio |
| Retrofit | https://pub.dev/packages/retrofit |
| go_router | https://pub.dev/packages/go_router |
| Drift | https://drift.simonbinder.eu/ |
| GitHub Actions | https://docs.github.com/actions |

---

# 8. Execution Rules

1. Follow the phases in order.
2. Do not move to the next phase without completing the current phase's deliverables.
3. Build practical features instead of writing isolated demonstration code.
4. Write tests alongside implementation.
5. Document important architecture decisions.
6. Review performance using measurements.
7. Revisit previous concepts when implementation exposes gaps.
8. Prioritize understanding over package memorization.
9. Keep dependencies minimal and justified.
10. Treat every feature as production code.

**Final Goal:** Become a Flutter engineer capable of independently designing, implementing, testing, profiling, securing, and maintaining scalable cross-platform applications at senior/lead engineering standards.
