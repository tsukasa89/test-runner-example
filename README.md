# test-runner-example

The property file in src/test/resources is not recognized and the test fails.

https://github.com/microsoft/vscode-java-test/issues/1311

## Environment:
- OS: Windows10
- VS Code: v1.60.2
- JDK: v11
- Java Test Runner Extension: v0.32.0

## Repro steps:
1. git clone : https://github.com/tsukasa89/test-runner-example
2. Open test-runner-example with VSCode

### VSCode Test run:
Click "Run All Tests"

Result:

The test "test resource properties value" failed.

### Gradle Test run:
```
.\gradlew clean test
```
Result:

All tests succeed.