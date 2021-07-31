package edu.bu.met.cs665.EmailGenerationSystem.Customers;

/**
 * The responsibility of this class is to represent all 
 * the customer types. It is abstract by design choice
 * to allow subclasses to implement and create their
 * own objects.
 * 
 * <p>Sources:
 * https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
 * https://bostonu.zoom.us/rec/share/GplrWmvlinD6KdRXovI0JezUDjctqRhT
 * bGed1VD5suRWbI4Fs9Qt0IGerYmzGvyu.mnH0D01e8gQE4kUC
 * https://stackoverflow.com/questions/685300/is-there-a-way-to-
 * override-class-variables-in-java
 */

public abstract class Customer {
  protected String customerType; /* Change customer type by subclass */
  
  /*
   *These group of variables are used solely for JUnit tests to verify the
   *existence of an encryption message and message contents.
   *It can only be changed to true at the Email Factory class.
   */
  protected boolean checkEncryption = false; /* Check for encryption */
  protected boolean checkMessageContents = false; /* Check for message contents. */
  

  /* These are the getters and setters for customer type.*/
  
  /**
   * This javadoc is present to notify that the customer type.
   * @return customerType
   **/
  public String getCustomerType() { 
    setCustomerType("Customer");
    System.out.println(customerType);
    return customerType;
  }

  /*Set the customer type. */
  public void setCustomerType(String customerType) {
    this.customerType = customerType;
  }

  /* Check for encryption status */
  public boolean isCheckEncryption() {
    return checkEncryption;
  }

  /* Change encryption status to true only in email factory */
  public void setCheckEncryption(boolean checkEncryption) {
    this.checkEncryption = checkEncryption;
  }
  
  /* Check for message contents. */
  public boolean isCheckMessageContents() {
    return checkMessageContents;
  }

  /* Change message contents status to true only in email factory */
  public void setCheckMessageContents(boolean checkMessage) {
    this.checkMessageContents = checkMessage;
  }
  
  /**
   * These methods are to generate the header, main
   * context, and footer unique to each customer. They
   * are all abstract by design choice to allow sub 
   * classes to implement.
   */
  /*Generate the header. */
  public abstract String generateHeader();
  
  /*Generate the main context */
  public abstract String generateMainContext();
 
  /*Generate the footer. */
  public abstract String generateFooter();
}
