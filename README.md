# Assignment 3 - Generating an Email using Factory Method

This application will generate emails for different customer types.

How the application is implemented is based on the following Design Principles: 
  1.	Flexibility: The Factory Method implemented in this design allows for flexibility. The factory method "separates product construction code" from the "product that actually uses this" (Refactoring Guru, n.d.). What this means is that subclasses can be responsible for "creating the instance of the class" at runtime (Javatpoint, n.d.). 

  2. Understandability: The classes and methods are named clearly. For example, the "EMailFactory" class indicates that it is a "Factory" class. In addition, the "generateEmail" method clearly indicates an email will be generated based on the Customer Type parameter.

  3. Duplicate code is avoided by using inheritance relationships. For example, the Customer parent class allows for subclasses such as "VIP" to inherit it's attributes and methods. For example, if the "getCustomerType" method is called, the program is written to accurately get the right customer type attribute. Inside the VIP subclass, the "getCustomerType" method is pre-written to set the attribute to "VIP" so that when the method is called, it will accurately retrieve it.

  4. Reusability: The implementation allows for reusability through the factory method. The "generateEmail" method can not only "create new objects" but "reuse exisitng objects as well" (Refactoring Guru, n.d.).

  5. Software Design Pattern: The Factory Pattern was selected. The reason for this was that the company needs to generate customizable emails at the "right time" during run time. Predicting which object (or email) to generate can be difficult. Per Professor Teymourian's lecture and the module 3 notes, a method would be more suited for this rather than a constructor. The Factory pattern will allow for this. Lastly, the expectation based on the requirements is that end-user is more interested in the email being generated rather than the process itself. This pattern will allow for the encapsulation of the implementation details of the email.
  
First, an interface called "EMailGenerator" was created and uses the method "GenerateEmail" based on the Customer type input (see assumptions below). Once the method is called, the EMailFactory will be used to "get a Customer Object"(javatpoint, n.d.). The type of Customer passed as a parameter will be used to obtain the exact type of object needed.

Second, the Customer class was made abstract. This is to adhere to the requirement to have an inheritance relationship (as stated in "Recordiing for week 3, Group 4 Friday 7/23 Live Office" ). The subclasses will be able to inherit the attributes and methods from that abstract class. In addition, the JUnit test will check for this by calling the "getCustomerType" method to verify the inheritance relationship (see TestCustomer method in TestEmailGeneration class).

Third, there are two boolean variables (checkEncryption and checkMessageContents in Customer class) to verify the existence of these features in certain classes. These were written specifically for the test case. The reason it is a bool is because the Encryption Messages and check message contents are in the EmailFactory class. Per the requirements stated, these messages can only be added after the email is generated. Given the design is an email factory, retrieving it would require changing the factory class. Thus, to ensure the factory class remains the same and comply with the test case, this boolean check was created in the customer class. If there is a detection of certain emails being generated (such as for business or VIP), the boolean will be changed from "false" to "true". Otherwise, it will remain false.

One trade off noted in this project, the Email Factory class code is longer. This is because the "generateHeader", "generateMainContext" and "generateFooter" methods were called per object. The intent was to display the email being generated. Originally (see my github repository history), my Customer class had a code where the constructor called those methods. However, per Professor Kia's lecture on July 22,2021, that is not a favorable programming practice. As a result, I complied and removed those methods and had them generated in the factory class instead. 

# Task 2: UML Class Diagram

Specifically, the UML diagram designed was inspired by Professor Teymourian's Module 3 lecture slides and Tutorials Point's, "Design Pattern - Factory Pattern" article. First, the EmailGenerationSystem interface was created. Second, the EmailFactory class will implement this interface. Third, the factory class will create the "Customer" object. The UML Class Diagram was created using Lucid Chart platform.

![image](https://user-images.githubusercontent.com/86865687/127113461-d9369e8e-7082-413d-9588-a82eb47ab0cd.png)



# Preconditions/Assumptions
  1. There is a stable connection and client is already connected to the system.
  2. The interface is able to receive the customer type input.
  3. The parameters are already inputted as shown in the main program.
  4. The getter is not being used in the main program to retrieve the customer type.
  5. The email will be generated successfully at run time.
  6. The customer type has to be already in the "generateEmail" method (see "Main" class).
  7. The encryption messages and message contents are only created after the email is generated. As a result, the boolean values can only change in the factory class.
  8. Due to the github package name, the warnings will appear in the checkstyle. I was not sure if I was unable to rename the package, hence, the errors.
  9. Customer class is made abstract and it's methods as well. This was a design choice to allow for subclasses to implement the methods in the parent classes differently and adhere to inheritances.
  10. As a result of the abstract class, it cannot be instantiated in the main class or test cases.
  11. The emailFactory class generates the "Header", "main context" and footer. The intent of this method is to solely display the messages and come only after the object is created. The intent is not to defeat the purpose of the factory class.
  

# Conceptual Solution
Both solutions can be found in the Main and JUnit test. The conceptual solution is that the user should be able to read a full message with a header, main context and footer (which will be noted in the email) dependent on the customer type.

In greater detail, the test case will follow these steps. (There will be 8 test cases)
	1. Declare the EMailGenerationSystem interface global initially.
        2. Generate 1 instance of this interface in the @before to test the entire generation of emails for different customer types.
        3. Test the creation of the customer classes by using the "assertEquals" and the "getCustomerType" method learned from Professor Kia's test class.
        4. Test the creation of generating the emails for all customer types by comparing the headers, main context and footers for equality.
        5.To test the existence of encryption and message contents, the methods "isCheckEncryption" and "isCheckMessageConents" are implemented. These will verify if
  they are "True". If so, the test will pass.


# Task 3: Implement your solution in java

The solution was originally written in the Eclipse IDE and then exported to github. The steps below will show how to compile, run and check bugs in the project. These compilation steps was based on the example provided by Professor Teymourian and modified to expand in greater detail.


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
