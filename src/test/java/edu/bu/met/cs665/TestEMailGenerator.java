package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.bu.met.cs665.EmailFactory;
import edu.bu.met.cs665.EmailGenerationSystem.Customers.Business;
import edu.bu.met.cs665.EmailGenerationSystem.Customers.Customer;
import edu.bu.met.cs665.EmailGenerationSystem.Customers.Frequent;
import edu.bu.met.cs665.EmailGenerationSystem.Customers.New;
import edu.bu.met.cs665.EmailGenerationSystem.Customers.Returning;
import edu.bu.met.cs665.EmailGenerationSystem.Customers.Vip;

/**
 *  This will test for the email generator
 *  and use a single instance. For each
 *  customer type, the entire email will
 *  be generated. In addition, assertions
 *  will be provided to verify each component
 *  of the test.
 *  <p>Sources:
 *  Professor Kia's lecture below:
 *  https://bostonu.zoom.us/rec/share/GplrWmvlinD6KdRXovI0JezUDjctqRhTbGed
 *  1VD5suRWbI4Fs9Qt0IGerYmzGvyu.mnH0D01e8gQE4kUC
 *  https://www.developerdrive.com/javascript-getters-setters/
 *  and Professor Teymourian's pre-assigned template.
 */

public class TestEMailGenerator {
  EMailGenerationSystem emailGenerated; /*Declare global instance of email factory. */
  
  public TestEMailGenerator() {}
  
  @Before
  public void runBeforeGenerationTest() {
    /* Generate 1 instance of email generation system. */
     emailGenerated = new EmailFactory(); 
  } 

  /* This will test the creation of the Business Object. */
  @Test
  public void testBusinessCustomer() {
    Customer businessCustomer = emailGenerated.generateEmail("Business"); /* Generate email. */
    
    /*This assertion will verify object is created. If so, the customer type should be changed to business.*/
    assertEquals("Business",businessCustomer.getCustomerType()); 
    
    /*These assertions verify the header, main context, and footer are a unique match to business customer. */
    assertEquals("(Header)\nTo: Business Customer\nFrom: Company", businessCustomer.generateHeader()); /* Generate Header. */
    assertEquals("\n(Main Context)\nThis is the message for our Business customer.", businessCustomer.generateMainContext()); /* Generate Main Context. */
    assertEquals("\n(Footer)\nThanks for being a Business customer. \nSincerely,\nCompany", businessCustomer.generateFooter()); /* Generate Footer. */
  }
  
  /* This will test the entire email generation for the new customer type. */
  @Test
  public void testNewCustomer() {
    Customer newCustomer = emailGenerated.generateEmail("New"); /* Generate email. */
    
    /*This assertion will verify object is created. If so, the customer type should be changed to new.*/
    assertEquals("New",newCustomer.getCustomerType()); /*verify object is created. */
    
    /*These assertions will verify the header, main context, and footer are a unique match to new customer. */
    assertEquals("(Header)\nTo: New Customer\nFrom: Company", newCustomer.generateHeader()); /* Generate header. */
    assertEquals("\n(Main Context)\nThis is the message to welcome New Customer.", newCustomer.generateMainContext()); /* Generate main context. */
    assertEquals("\n(Footer)\nThanks for being a new customer. \nSincerely,\nCompany", newCustomer.generateFooter()); /* Generate footer. */
  }

  /* This will test the entire email generation for the VIP customer type. */
  @Test
  public void testVIPCustomer() {
    Customer vipCustomer = emailGenerated.generateEmail("VIP"); /* Generate email. */
    
    /*This assertion will verify object is created. If so, the customer type should be changed to VIP.*/
    assertEquals("VIP",vipCustomer.getCustomerType()); /*verify object is created. */
    
    /*These assertions will verify the header, main context, and footer are a unique match to vip customer. */
    assertEquals("(Header)\nTo: VIP Customer\nFrom: Company", vipCustomer.generateHeader()); /* Generate Main Context */
    assertEquals("\n(Main Context)\nThis is the message for our VIP customer.", vipCustomer.generateMainContext()); /* Generate Main Context */
    assertEquals("\n(Footer)\nThanks for being a VIP customer. \nSincerely,\nCompany", vipCustomer.generateFooter()); /* Generate Main Context */
  }

  /* This will test the entire email generation for the frequent customer type. */
  @Test
  public void testFrequentCustomer() {
    Customer frequentCustomer = emailGenerated.generateEmail("Frequent"); /* Generate email. */
    
    /*This assertion will verify object is created. If so, the customer type should be changed to Frequent.*/
    assertEquals("Frequent",frequentCustomer.getCustomerType()); /*verify object is created. */
    
    /*These assertions will verify the header, main context, and footer are a unique match to frequent customer. */
    assertEquals("(Header)\nTo: Frequent Customer\nFrom: Company", frequentCustomer.generateHeader()); /* Generate Footer. */
    assertEquals("\n(Main Context)\nThis is the message for our Frequent customer.", frequentCustomer.generateMainContext()); /* Generate Footer. */
    assertEquals("\n(Footer)\nThanks for being a Frequent customer. \nSincerely,\nCompany", frequentCustomer.generateFooter()); /* Generate Footer. */
  }

  /* This will test the entire email generation for the frequent customer type. */
  @Test
  public void testReturningCustomer() {
    Customer returningCustomer = emailGenerated.generateEmail("returning"); /* Generate email. */
    
    /*This assertion will verify object is created. If so, the customer type should be changed to Returning.*/
    assertEquals("Returning",returningCustomer.getCustomerType()); 
    
    /*These assertions will verify the header, main context, and footer are a unique match to returning customer. */
    assertEquals("(Header)\nTo: Returning Customer\nFrom: Company", returningCustomer.generateHeader()); /* Generate Main Context. */
    assertEquals("\n(Main Context)\nThis is the message show our appreciation"
        + " for returning customers.", returningCustomer.generateMainContext()); /* Generate Main Context. */
    assertEquals("\n(Footer)\nThanks for being a returning customer. \nSincerely,\nCompany", returningCustomer.generateFooter()); /* Generate Main Context. */
  }
  
  /* This will test the email generation of the abstract customer class to see it
   * it's methods work and can change the type to new. If so, the test passes. */

  @Test
  public void testCustomer() {
    Customer customer = emailGenerated.generateEmail("New"); /* Generate email. */
    
    /*This assertion will verify object is created. If so, the customer type should be changed to Customer.*/
    assertEquals("New",customer.getCustomerType()); 
  }
  
  /* This will test to check the encryption status is true for the business case. If so, the test
   * pass.
   */
  @Test
  public void testCheckEncryptionStatus() {
    Customer businessCustomer = emailGenerated.generateEmail("Business"); /* Generate email. */
    assertEquals(true,businessCustomer.isCheckEncryption());
  }
  
  /* This will test to check the message contents is present for the vip case. If so, the boolean
   * "CheckMessageContents" will be changed to true and the test will pass (run the test individually).
   */
  @Test
  public void testCheckMessageContents() {
    Customer vipCustomer = emailGenerated.generateEmail("VIP"); /* Generate email. */
    assertEquals(true,vipCustomer.isCheckMessageContents());
  }
 }
