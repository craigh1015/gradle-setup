# Sample Gradle Java build

**This is a simple Hello World java project with minimal gradle build.**

## FEATURES

- Unit tests (JUnit 4)
- Code coverage (JACOCO)
- Version passed in on command line
- Executable Uber JAR creation
- Dependency updates

## USAGE

```bash
# Clean test and build with coverage report
gradle -Pversion=0.1.4 clean build jacocoTestReport

# Run the executable JAR
java -jar build/libs/gradle-setup-0.1.4-all.jar

# Check for updated dependencies
gradle dependencyUpdates
```