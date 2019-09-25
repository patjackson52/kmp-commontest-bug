# kmp-commontest-bug
Reproducer of bug with kotlin MPP - Test do not find references in commonMain

```sh
./gradlew jvmTest
```
results in:

```sh
> Task :mock:compileTestKotlinJvm FAILED
e: /Users/patrick.jackson/workspace2/android/mock/src/test/kotlin/com/joyable/mock/test/WireMockAdminTest.kt: (3, 25): Unresolved reference: WireMockAdminGateway
e: /Users/patrick.jackson/workspace2/android/mock/src/test/kotlin/com/joyable/mock/test/WireMockAdminTest.kt: (9, 28): Unresolved reference: WireMockAdminGateway
e: /Users/patrick.jackson/workspace2/android/mock/src/test/kotlin/com/joyable/mock/test/WireMockAdminTest.kt: (13, 40): Unresolved reference: WireMockMapping
e: /Users/patrick.jackson/workspace2/android/mock/src/test/kotlin/com/joyable/mock/test/WireMockAdminTest.kt: (14, 40): Unresolved reference: Request
e: /Users/patrick.jackson/workspace2/android/mock/src/test/kotlin/com/joyable/mock/test/WireMockAdminTest.kt: (18, 41): Unresolved reference: Response

FAILURE: Build failed with an exception.
```

Classes in `mock/commonMain` should be available in `mock/test`.
