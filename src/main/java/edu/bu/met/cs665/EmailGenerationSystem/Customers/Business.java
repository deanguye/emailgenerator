package edu.bu.met.cs665.EmailGenerationSystem.Customers;

/**
 * The responsibility of this class is to generate Email
 * for the Business Customer Type.
 * 
 * <p>Sources:
 * https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
 */
public class Business extends Customer { /*Inherit methods from Customer. */
  
  /* Get the customer type and set to business. */
  @Override
  public String getCustomerType() {
    setCustomerType("Business");
    System.out.println(customerType);
    return customerType;
  }
  
  /*
   * All methods will be overridden to generate different messages.
   */
  
  /* Generate the header for the business customer type. */
  @Override
  public String generateHeader() {
    System.out.println("(Header)\nTo: Business Customer\nFrom: Company");
    return "(Header)\nTo: Business Customer\nFrom: Company";
  }
  
  /* Generate the main context for the business customer type. */
  @Override
  public String generateMainContext() {
    System.out.println("\n(Main Context)\nThis is the message for our Business customer.");
    return "\n(Main Context)\nThis is the message for our Business customer.";
  }
  
  /* Generate the footer for the business customer type. */
  @Override
  public String generateFooter() {
    System.out.println("\n(Footer)\nThanks for being a Business customer. \nSincerely,\nCompany");
    return "\n(Footer)\nThanks for being a Business customer. \nSincerely,\nCompany";
  }
}
