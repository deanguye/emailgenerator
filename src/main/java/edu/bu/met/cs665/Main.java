package edu.bu.met.cs665;

import edu.bu.met.cs665.EmailFactory;
import edu.bu.met.cs665.EmailGenerationSystem.Customers.Customer;
/**
 * This is the main class. It's responsibility is to generate
 * the one instance of the email factory and test for all 
 * cases. Since customer is abstract, only subclasses can
 * implement it's methods.
 * 
 * <p>Source: https://www.tutorialspoint.com/design_pattern/factory_pattern.html
 * @author deanna nguyen
 */

public class Main {
  /**
   * A main method to run the sequence to generate email.
   */
  public static void main(String[] args) {
    /* Generate the email factory */
    EMailGenerationSystem generateEmail = new EmailFactory();
    
    /* Generate the email for business customer.*/
    System.out.println("---This is the start of the email for"
        + " Business Customer.---"); 
    generateEmail.generateEmail("Business"); /* Generate email. */
    System.out.println("\n"); /* separate the test cases */
    
    /* Generate the email for frequent customer.*/
    System.out.println("---This is the start of the email for "
        + "Frequent Customer.---"); 
    generateEmail.generateEmail("Frequent"); /* Generate email. */
    System.out.println("\n");/* separate the test cases */
    
    /* Generate the email for new customer.*/
    System.out.println("---This is the start of the email for "
        + "New Customer.---"); 
    generateEmail.generateEmail("New"); /* Generate email. */
    System.out.println("\n");/* separate the test cases */
    
    /* Generate the email for returning customer.*/
    System.out.println("---This is the start of the email for "
        + "Returning Customer.---"); 
    generateEmail.generateEmail("returning"); /* Generate email. */
    System.out.println("\n");/* separate the test cases */
    
    /* Generate the email for vip customer.*/
    System.out.println("---This is the start of the email for"
        + " VIP Customer.---"); 
    generateEmail.generateEmail("VIP"); /* Generate email. */
    System.out.println("\n");/* separate the test cases */
    
    /* Generate the email for mispelling. The message will print out indicating error.*/
    System.out.println("---This is the start of the email for email "
        + " generation failure.---"); 
    generateEmail.generateEmail("custumer"); /* Generate email. */
  }
}
