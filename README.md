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

git clone https://github.com/praveenrk30004/Kaplan-Automation
cd KaplanAssignment

2️. Run with Maven

mvn test -Dtest=runners.OrderedTestSuite

3. Using IntelliJ IDEA / Eclipse
If you are using an IDE like IntelliJ or Eclipse:

Open the project in your IDE.
Navigate to src/test/java/runners/OrderedTestSuite.java 
Right-click on the file.
Select Run as > JUnit Test

4. View Reports

After test execution, open the following file in your browser:

target/cucumber-reports.html
