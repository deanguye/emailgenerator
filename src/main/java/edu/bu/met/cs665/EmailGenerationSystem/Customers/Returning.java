package edu.bu.met.cs665.EmailGenerationSystem.Customers;

/**
 * This Class is responsible for implementing the
 * Email Generator Application.
 * 
 * <p>Source:
 * https://www.geeksforgeeks.org/factory-method-design-pattern-in-java/
 * https://www.tutorialspoint.com/design_pattern/factory_pattern.html
 * @author Deanna Nguyen
 */
public class Returning extends Customer { /*Inherit methods from Customer. */

  /* Get the customer type and set for the returning customer type. */
  @Override
  public String getCustomerType() {
    setCustomerType("Returning");
    System.out.println(customerType);
    return customerType;
  }
  
  
  /*
   * All methods will be overridden to generate different messages.
   */
  
  /* Generate the header for the returning customer type. */
  @Override
  public String generateHeader() {
    System.out.println("(Header)\nTo: Returning Customer\nFrom: Company");
    return "(Header)\nTo: Returning Customer\nFrom: Company";
  }
  
  /* Generate the main context for the returning customer type. */
  @Override
  public String generateMainContext() {
    System.out.println("\n(Main Context)\nThis is the message show our appreciation"
        + " for returning customers.");
    return "\n(Main Context)\nThis is the message show our appreciation"
      + " for returning customers.";
  }
  
  /* Generate the footer for the returning customer type. */
  @Override
  public String generateFooter() {
    System.out.println("\n(Footer)\nThanks for being a returning customer. \nSincerely,\nCompany");
    return "\n(Footer)\nThanks for being a returning customer. \nSincerely,\nCompany";
  }
}