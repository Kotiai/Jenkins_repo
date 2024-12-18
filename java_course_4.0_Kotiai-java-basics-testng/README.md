# intro-to-testng-hw
This is a homework for the TestNG

## TestNG assignment
1. Checkout branch `java-basics-testng`
2. Add dependency 'org.testng:testng:7.9.0' to build.gradle
3. Create a simple test with setup and teardown methods. Each method has to output its name to console
4. Create a test class named 'TestClassOne' with several test groups

   4.1. Create several groups of tests

   4.2 Group precondition and teardown methods, excluding one of them from test execution

5. Create another test class 'TestClassTwo' with 2 parametrised test methods

   5.1 The first method has to accept parameters from testng.xml

   5.2 The second method has to accept parameters from a dataprovider

6. Create third test class named 'TestClassThree' where test methods are executed from the bottom to the top using priorities
7. Push your solution to GitHub
8. Submit homework

   8.1 Run tests in 'TestClassOne', 'TestClassTwo', 'TestClassThree' (e.g. in test class put your cursor on its definition, right click and choose Run)

   8.2 Take screenshots of the results

   8.3 Upload screenshots to Learn (add the link to your GitHub project in the comments)

## Unit testing
There are number of different ways to run your unit tests, e.g.:
* In test class put your cursor on its definition, right click and choose `Run ...`
* Right click on a little green triangle near the class definition and choose `Run ...`
* In test class put your cursor on its definition and press `Ctrl+Shift+F10` (`Control+Shift+R`)
* Once you executed your test you could re-run it again by pressing `Shift+F10` (`Control+R`)
* from command line ```./gradlew clean test```