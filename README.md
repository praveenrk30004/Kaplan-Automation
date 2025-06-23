TECH STACK

Java 22
- Selenium 4.21
- Cucumber
- Maven
- JUnit
- ChromeDriver 137
- POM Design Pattern

PREREQUISITES

Java JDK 17 or later
Maven 3.6+
Chrome browser (latest)

HOW TO RUN THE TESTS

1️. Clone the Repository

git clone <your-repo-link>
cd <project-folder>

2️. Run with Maven

mvn test -Dtest=runners.OrderedTestSuite

3️. View Reports

After test execution, open the following file in your browser:

target/cucumber-reports.html
