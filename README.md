The repo is to set up a Geb Project with Gradle
Geb Project is set up with Page Object Model pattern
All application pages and objects of the respective pages are in their respective pages under the /src/test/groovy/com.tgt.example/pages folders
All spec files (test files) are located in /src/test/groovy/com.tgt.example/spec folders
All specs for the overall framework are located in the GebConfig.groovy
build.gradle contains the gradle specific parameters
pom.xml contains the maven specific parameters (mavenized build)
README.md - Basic information about the repo

Note - All dependent libraries are not updated in git repo, need to be downloaded via gradle route

Basic steps to get the framework working:

1. Clone the repo
2. Import project as "Gradle project"
3. Map Java/Groocy sdk, gradle parameters and IDE specific configurations
4. Download the jdbc driver for postgresql
5. Run spec files, individually and not as gradle build

Note : Gradle and Maven builds are not yet completely set up, this repo is not ready to be run as gradle/maven projects
