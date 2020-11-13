# CS445 Homework 1
Nihan Abaci, Spring 2020

## How to run the TestCreature class

```bash
git clone https://github.com/nihanabaci/CS445_hw1.git
cd CS445_hw1/src
javac TestCreature.java
java TestCreature
```
## How to run the Junit Tests

This requires installation of junit.jar and hamcrest-core.jar

Install junit.jar [here](https://search.maven.org/remotecontent?filepath=junit/junit/4.13/junit-4.13.jar)

Intall hamcrest-core.jar [here](https://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar)

Make sure junit.jar and hamcrest-core.jar are placed inside the src file

Then run these commands:

```bash
javac -cp junit-4.13.jar:. TestCases.java
java -cp junit-4.13.jar:hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore TestCases
```
