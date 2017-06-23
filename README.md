[![Build Status](https://travis-ci.org/k-tamura/easybuggy.svg?branch=master)](https://travis-ci.org/k-tamura/easybuggy)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

EasyBuggy
=

EasyBuggy is a broken web application in order to understand behavior of bugs and vulnerabilities, for example, [memory leak, deadlock, JVM crash, SQL injection and so on](https://github.com/k-tamura/easybuggy/wiki).

![logo](https://github.com/k-tamura/easybuggy/blob/master/src/main/webapp/images/easybuggy.png)

Quick Start
-

    $ mvn clean install exec:exec

( or ``` java -jar easybuggy.jar ``` or deploy ROOT.war on your servlet container with [the JVM options](https://github.com/k-tamura/easybuggy/blob/master/pom.xml#L204). )
( or ``` cd docker && make up ``` to boot via docker )

Access to

    http://localhost:8080

#### To stop:

  Use <kbd>CTRL</kbd>+<kbd>C</kbd>

    
For more detail
-
   
See [the wiki page](https://github.com/k-tamura/easybuggy/wiki).

