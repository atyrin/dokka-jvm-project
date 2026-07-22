# Repository Agent Guide

## Project purpose

This repository is a demo and test project for the Dokka documentation engine
for Kotlin. It is not a production application. The source tree contains small,
focused cases used to verify how Dokka renders and resolves Kotlin and Java
language features, KDoc, external references, visibility and suppression rules,
samples, custom styling, versioned documentation, and Dokka plugins.

When changing or adding a case, keep it focused and make the behavior being
tested clear from the source and its KDoc. When adding a feature example,
always include KDoc explaining why the particular fixture was added and which
Dokka rendering or resolution behavior it exercises. Prefer adding a minimal
fixture over changing unrelated examples.

## Repository layout

- `src/main/kotlin` and `src/main/java` contain the documentation fixtures.
- `src/test` contains test-only fixtures and resources.
- `dokka-test-plugin` is an included build containing a Dokka test plugin and
  related external-document processing examples.
- `documentation/version` contains previously generated documentation for
  comparison and version navigation.
- `templates`, `css`, and related root assets customize the generated HTML.
- `build.gradle.kts`, `settings.gradle.kts`, and
  `gradle/libs.versions.toml` configure Dokka, Kotlin, samples, links, and
  output generation.
- `readme.md` contains the short, user-facing workflow.

## Working rules

- Do not downgrade the Kotlin version to fix a problem. Diagnose compatibility
  or configuration issues while keeping the requested Kotlin version.
- Preserve the intent of existing fixtures. Changes to generated output should
  be accompanied by the source or configuration change that explains them.
- Treat generated documentation as test evidence. When comparing Dokka output
  trees, filter known generated noise first, then classify remaining changes as
  rendering, links/resolution, markup, navigation/runtime, or versioning
  changes.
- Keep changes scoped to the case under test. Avoid broad refactors or edits to
  unrelated fixtures.

## Verification

Generate documentation with:

```bash
./gradlew dokkaGenerate --console=plain
```

Do not perform checks other than documentation generation.
Do not verify the result in a browser.
