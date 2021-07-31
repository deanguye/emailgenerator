package edu.bu.met.cs665.EmailGenerationSystem.Customers;

/**
 * The responsibility of this class is to generate Email
 * for the Frequent Customer Type.
 * 
 * <p>Sources:
 * https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
 */
public class Frequent extends Customer { /*Inherit methods from Customer. */
  
  /* Get the customer type and set for frequent type. */
  @Override
  public String getCustomerType() {
    setCustomerType("Frequent");
    System.out.println(customerType);
    return customerType;
  }
  
  
  /*
   * These methods are to generate the header, main
   * context, and footer unique to frequent customer types.
   * All will be overriden.
   */
  
  /* Generate the header for the frequent customer type. */
  @Override
  public String generateHeader() {
    System.out.println("(Header)\nTo: Frequent Customer\nFrom: Company");
    return "(Header)\nTo: Frequent Customer\nFrom: Company";
  }
  
  /* Generate the main context for the frequent customer type. */
  @Override
  public String generateMainContext() {
    System.out.println("\n(Main Context)\nThis is the message for our Frequent customer.");
    return "\n(Main Context)\nThis is the message for our Frequent customer.";
  }
  
  /* Generate the footer for the frequent customer type. */
  @Override
  public String generateFooter() {
    System.out.println("\n(Footer)\nThanks for being a Frequent customer. \nSincerely,\nCompany");
    return "\n(Footer)\nThanks for being a Frequent customer. \nSincerely,\nCompany";
  }
}
