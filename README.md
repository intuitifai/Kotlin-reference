#                                                       KOTLIN

This file is a Simple Kotlin files for reference .

This repository will help the user to get familiar with basic stucture of kotlin.<br>
You can use the following link to refer the kotlin programming language:

    https://developer.android.com/kotlin/index.html #developers community.
    https://kotlinlang.org/ # official website

# What is kotlin :
Kotlin is a statically typed programming language that runs on the Java virtual machine and also can be compiled to JavaScript source code or use the LLVM compiler infrastructure.

# Stable release :

    Kotlin 1.2.30 / March 1, 2018; 16 days ago
# Official developers

    Developer: JetBrains and open source contributors
# Typing discipline: 
    
     static, inferred
     
# Filename extensions:
    
      kt,.kts
      
# Syntax
## Functional Programming Style

Kotlin relaxes Java's restriction of only allowing Static Methods and variables inside of a class body. Instead, Kotlin allow definition of static Objects and Functions at the top-level of the Package body without needing a redundant class level; similar to languages such as C or Pascal. For backwards compatibility with Java, Kotlin adds a special attribute to a Kotlin package body that specifies a Java class name for nesting toplevel static functions and variables when the Kotlin package is viewed from a Java project. (ie. @file:JvmName("JavaClassName")).

# Main entry point
As in C and C++, the entry point to a Kotlin program is a function named "main", which is passed an array containing any command line arguments. Perl and Unix/Linux shell script-style string interpolation is supported. Type inference is also supported.

## sample code snipet
  
    // Hello, world! example
      fun main(args: Array<String>) {
      val scope = "world"
      println("Hello, $scope!")
      }
      

# How to run Kotlin programme

## Running from Intellij
If in Intellij (if it is your IDE) you can right click on the main() function and select Run, it will create a runtime configuration for you and show the fully qualified class name that will be used. You can always use that if you are unsure of the name of the generated class.

## Running from Gradle
You can also use the Gradle Application plugin to run a process from Gradle, or to create a runnable system that includes a zip/tgz of your JAR and all of its dependencies, and a startup script. Using the example class above, you would add this to your build.gradle:

    apply plugin: 'application'

    mainClassName = 'com.my.stuff.AppKt'

    // optional:  add one string per argument you want as the default JVM args
    applicationDefaultJvmArgs = ["-Xms512m", "-Xmx1g"] 
    And then from the command-line use:

    // run the program
    gradle run

    // debug the program
      gradle run --debug-jvm

    // create a distribution (distTar, distZip, installDist, ...)
      gradle distTar
    
## Running Directly from Java Command-line
If you have a runnable JAR, and assuming KOTLIN_LIB points to a directory where Kotlin runtime library files reside:

    java -cp $KOTLIN_LIB/kotlin-stdlib.jar:MyApp.jar com.my.stuff.AppKt
See the  documentation  about other JAR files you might need. A slight variation if you have a runnable JAR (with the manifest pointing at com.my.stuff.AppKt as the main class):

    java -cp $KOTLIN_LIB/kotlin-stdlib.jar -jar MyApp.jar
## Running using the Kotlin command-line tool
If you install Kotlin tools via Homebrew or other package manager. (on Mac OS X brew update ; brew install kotlin) Then it is very simple to run:

    kotlin -cp MyApp.jar com.my.stuff.AppKt
This command adds the stdlib to the classpath provided, then runs the class. You may need to add additional Kotlin libraries as mentioned in the section above "Running from Java."

Creating runnable JAR with the Kotlin compiler
This is not very common since most people use other build tools, but the Kotlin compiler can create a runnable Jar that solves this for you (see http://kotlinlang.org/docs/tutorials/command-line.html) when it bundles the runtime and your code together. Although this isn't as common when using tools such as Maven and Gradle, or IDE builds. Then run using the normal Java:

    java -jar MyApp.jar
    
    
# Sample output
if you have sucessfully compiled the  the program you should get the output like below :

    Helo World!
