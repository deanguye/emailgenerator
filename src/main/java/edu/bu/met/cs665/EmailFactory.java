package edu.bu.met.cs665;

import edu.bu.met.cs665.EmailGenerationSystem.Customers.Business;
import edu.bu.met.cs665.EmailGenerationSystem.Customers.Customer;
import edu.bu.met.cs665.EmailGenerationSystem.Customers.Frequent;
import edu.bu.met.cs665.EmailGenerationSystem.Customers.New;
import edu.bu.met.cs665.EmailGenerationSystem.Customers.Returning;
import edu.bu.met.cs665.EmailGenerationSystem.Customers.Vip;

/**
 * This Factory Class is responsible for implementing the
 * Email Generator Application. Please see read me explanation
 * for why the code is long.
 * Source:
 * https://www.tutorialspoint.com/design_pattern
 * /factory_pattern.html 
 * https://www.javatpoint.com/factory-method-design-pattern
 * https://howtodoinjava.com/design-patterns/creational/implementing-
 * factory-design-pattern-in-java/
 * @author Deanna Nguyen
 */
public class EmailFactory implements EMailGenerationSystem {  
  /**
   *  This will generate the entire email.
   **/
  public Customer generateEmail(String customerType) {     
    /* This will check for the Business Type email taking into account case. */
    if (customerType.contains("Business") || customerType.contains("business")) {  
      Business business = new Business(); /*Create business object */
      
      business.setCheckEncryption(true); /* Set to true to verify encryption exists. */
      /* Set to true to verify content exists. */
      business.setCheckMessageContents(true);
       
      /* This is for display purposes only (see read me and documentation explanations */
      /* These generate methods are called to generate entire email. */
      business.generateHeader();
      business.generateMainContext();
      business.generateFooter();
      
      /* Print out message to display checking spelling and grammar. */
      System.out.println("\nChecking for Grammar and Spelling for Business type email.");
      /* Print out message to display email message being encrypted. */
      System.out.println("Email being encrypted for Business type email.");
       
      return business; /*return business object. */
      
    } else if (customerType.contains("New") || customerType.contains("new")) { 
      /* This will check for the New Type email taking into account case. */

      /* Print out message to display create a new customer email. */
      System.out.println("This email template is unique to new customer.");
      
      /* This is for display purposes only (see read me and documentation explanations */
      New newCustomer = new New();
      newCustomer.generateHeader();
      newCustomer.generateMainContext();
      newCustomer.generateFooter();
      
      /* Return a new customer type object and implement it's methods. */
      return newCustomer;  
      
    } else if (customerType.contains("Returning") || customerType.contains("returning")) {
      /* This will check for the Returning Type email taking into account case. */
      
      /*
      * See customer class. Create new returning object and change message 
      * content status for unit tests. Return the returning object.
      */
      Returning returning = new Returning();
      returning.setCheckMessageContents(true);/* Set to true to verify message content exists. */
      
      /* This is for display purposes only (see read me and documentation explanations */
      returning.generateHeader();
      returning.generateMainContext();
      returning.generateFooter();
       
      /* This print statement is to convey checking for spelling and grammar for returning type. */
      System.out.println("Checking for Grammar and Spelling for returning customer type email.");
       
      /* return Returning object. */
      return returning;
      
    } else if (customerType.contains("Frequent") || customerType.contains("frequent")) { 
      /* This will check for the New Type email taking into account case. */
      
      /*
      * Create new frequent object and change message content
      * status for unit tests. Return the frequent object.
      */
      Frequent frequent = new Frequent();
      frequent.setCheckMessageContents(true); /* Set to true to verify message content exists. */
       
      /* Print statement checking for spelling and grammar for frequent type email. */
      System.out.println("Checking for Grammar and Spelling for frequent type email.");
      
      /* This is for display purposes only (see read me and documentation explanations */
      frequent.generateHeader();
      frequent.generateMainContext();
      frequent.generateFooter();
       
      /* return frequent type object. */
      return frequent;
      
    } else if (customerType.contains("VIP") || customerType.contains("vip")) { 
      /* This will check for the VIP Type email taking into account case. */
      
      /*
      * Create new vip object, change the encryption and message content
      * status for unit tests, and return the vip object.
      */
      Vip vip = new Vip();
      vip.setCheckEncryption(true); /* Set to true to verify encryption exists. */
      vip.setCheckMessageContents(true); /* Set to true to verify  message content exists. */
       
      /* Print statement checking for spelling and grammar for VIP type email. */
      System.out.println("Checking for Grammar and Spelling for VIP email.");
      /* Print statement for encryption for VIP type email. */
      System.out.println("Email being encrypted for VIP email.");
      
      /* This is for display purposes only (see read me and documentation explanations */
      vip.generateHeader();
      vip.generateMainContext();
      vip.generateFooter();
       
      /* return VIP type object. */
      return vip;

    } else { /* If spelling is incorrect or type does not exist, print this message. */
      System.out.println("The email did not generate because the type is non-existent"
          + " or spelling is incorrect");
    }
    return null;
  }   
}
