Task 1
============
`Task 1` folder contains test suite for Monefy Android application.

Task 2
=============
Using Rest-Assured library, I've written automated test cases for REST API endpoints. These test cases primarily focusses on correct functionality of endpoints.


Setup Instructions
----------------------

1. Download and install [Eclipse IDE for Java](https://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/indigo)
2. Make sure the Bestbuy API playground server is running
4. Import  Java project in Eclipse:
	- File->Import->Existing Projects into Workspace 
	- Choose `QA-N26` folder
5. Download Rest-Assured Jars `rest-assured-3.0.6-dist.zip` from [here](https://github.com/rest-assured/rest-assured/wiki/Downloads)
6. Unzip the file downloaded in step 5. Further, unzip `*-deps.zip` file inside it.
7. Add above jars into your project's build path: 
	Right click on Project -> Properties->Java Build Path->Add External Jars
	Choose `rest-assured-*.jar` and all the jars inside `*-deps` folder.
	
Run Automated Tests from Eclipse
----------------------
Right click on the project folder -> Run As -> JUnit Test

## API tests for https://petstore3.swagger.io/
find example tests for Pet store swagger api.

Tool & Technologies used:

- Test automation framework: TestNG
- Reporting: TestNG Report
- API client/testing framework: rest-assured
- Build tool: Maven
- Java 1.8+

In order to run the tests execute below maven command:
- Prerequisite: maven should be configured properly
- download the code from git and build it using maven in an IDE. or simply unzip the code folder and run the mvn command in command prompt after navigating to the folder where POM is placed.
- if the parameters are not passed in maven command, default will be used.


mvn clean compile test "-Dbase_url=https://petstore3.swagger.io/ "-DendPoint=/v3/pet"

upon execution, target folder will be generated and report will be available in 
```target/surefire-reports/Pet Store API tests/index.html```
&
```target/surefire-reports/Pet Store API tests/emailable-report.html```



