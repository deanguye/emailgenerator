package edu.bu.met.cs665.EmailGenerationSystem.Customers;

/**
 * The responsibility of this class is to generate Email
 * for the New Customer Type.
 * 
 * <p>Sources:
 * https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
 */
public class New extends Customer { /*Inherit methods from Customer. */
  
  /* Get the customer type and set for the new customer type. */
  @Override
  public String getCustomerType() {
    setCustomerType("New");
    System.out.println(customerType);
    return customerType;
  }
  
  
  /*
   * These methods are to generate the header, main
   * context, and footer unique to new customer types.
   */
  
  /* Generate the header for the new customer type. */
  @Override
  public String generateHeader() {
    System.out.println("(Header)\nTo: New Customer\nFrom: Company");
    return "(Header)\nTo: New Customer\nFrom: Company";
  }
  
  /* Generate the main context for the new customer type. */
  @Override
  public String generateMainContext() {
    System.out.println("\n(Main Context)\nThis is the message to welcome New Customer.");
    return "\n(Main Context)\nThis is the message to welcome New Customer.";
  }
  
  /* Generate the footer for the new customer type. */
  @Override
  public String generateFooter() {
    System.out.println("\n(Footer)\nThanks for being a new customer. \nSincerely,\nCompany");
    return "\n(Footer)\nThanks for being a new customer. \nSincerely,\nCompany";
  }
}