# Generating an Email using Factory Method

This application will generate emails for different customer types.


# How to compile the project
1. Use Apache Maven to compile and run this project. 
2. Install Apache Maven (https://maven.apache.org/)  on your system. 
3. Download the zip file from blackboard and extract the file into a directory.
4. Type "cd" into the exact folder the file was extracted from.
5. Type "cd met-cs665-assignment-3-deanguyen-master".

The outcome of the successful build should state "BUILD SUCCESS".

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


#
# How to run the Main Program

This is used to test the Delivery Request being sent. Use the following code below:

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```



# Run the JUnit test to verify the methods work.

This is used to verify the methods are working as intended. Use the following code:

```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

The intent of the TestEMailGenerator.java class is to do the following:
1.	Verify each customer type object can be created.
2.	Check that the unique header, main context and footer are created.
3.	Verify only 1 instance of the EmailFactory is created.

# Using Spotbugs to find bugs in your project 

To find bugs in the project, use the following command 

```bash
mvn clean compile spotbugs:check
```

For further details, use:
```bash
"mvn findbugs:gui"
```

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```
