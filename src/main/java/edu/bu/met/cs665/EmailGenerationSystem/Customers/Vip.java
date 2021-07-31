package edu.bu.met.cs665.EmailGenerationSystem.Customers;

/**
 * This Class is responsible for implementing the
 * Email Generator Application.
 * Sources:
 * 
 * <p>https://www.geeksforgeeks.org/factory-method-design-pattern-in-java/
 * https://www.tutorialspoint.com/design_pattern/factory_pattern.html
 * @author Deanna Nguyen
 */
public class Vip extends Customer { /*Inherit methods from Customer. */
  
  /* Get the customer type and set for the VIP customer type. */
  @Override
  public String getCustomerType() {
    setCustomerType("VIP");
    System.out.println(customerType);
    return customerType;
  }
  

  /*
   * All methods will be overridden to generate different messages.
   */
  
  /* Generate the header for the VIP customer type. */
  @Override
  public String generateHeader() {
    System.out.println("(Header)\nTo: VIP Customer\nFrom: Company");
    return "(Header)\nTo: VIP Customer\nFrom: Company";
  }
  
  /* Generate the main context for the VIP customer type. */
  @Override
  public String generateMainContext() {
    System.out.println("\n(Main Context)\nThis is the message for our VIP customer.");
    return "\n(Main Context)\nThis is the message for our VIP customer.";
  }
  
  /* Generate the footer for the VIP customer type. */
  @Override
  public String generateFooter() {
    System.out.println("\n(Footer)\nThanks for being a VIP customer. \nSincerely,\nCompany");
    return "\n(Footer)\nThanks for being a VIP customer. \nSincerely,\nCompany";
  }
}