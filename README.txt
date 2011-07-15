Geb Example Project
===================

This is the Geb example project as demonstrated at UberConf 2011. To run the tests in this project,
you need to have a JDK and Firefox installed. See the Geb documentation on how to run tests with other browsers.
              
Running Tests with Gradle
------------------------

To run tests with Gradle, type:

> ./gradlew clean test (Windows: gradlew.bat clean test)

All dependencies (including Gradle) will be downloaded automatically.

To view the generated JUnit reports, open build/reports/tests/index.html. HTML and screenshots for all visited pages are saved to build/reports/geb.

Running Tests with IDEA 9/10
---------------------------- 

> ./gradlew cleanIdea idea (Windows: gradlew.bat cleanIdea idea)

Open the generated IDEA project

Open Project Settings and make sure the correct JDK is selected

Run src/test/groovy/ContactUsFormSpec.groovy as you would run a JUnit test

Running Tests with Eclipse 3.5/3.6/3.7
--------------------------------------

Install the Groovy Eclipse plugin (see http://groovy.codehaus.org/Eclipse+Plugin)

> ./gradlew cleanEclipse eclipse (Windows: gradlew.bat cleanEclipse eclipse)

Open the generated Eclipse project

Open Preferences and enable these settings:
Groovy->Use monospace font for JUnit
Groovy->Compiler->Groovy Script Folders->Enable Script Folder support

Run src/test/groovy/ContactUsFormSpec.groovy as you would run a JUnit test

If you have problems running the tests, open the "Error Log" view (Window->Show View->Error Log) and check if there are any problems reported for the Groovy Eclipse plugin.

Further Help
------------

If you have any problems or questions, please contact one the following mailing lists. We'd love to hear from you!

Geb http://xircles.codehaus.org/projects/geb/lists
Spock http://forum.spockframework.org
Groovy Eclipse plugin http://groovy-eclipse-plugin.42567.n3.nabble.com/
