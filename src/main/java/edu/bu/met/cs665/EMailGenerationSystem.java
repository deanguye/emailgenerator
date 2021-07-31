package edu.bu.met.cs665;

import edu.bu.met.cs665.EmailGenerationSystem.Customers.Customer;

/**
 * This interface will be responsible for generating the email.
 * @author deanna nguyen
 */
public interface EMailGenerationSystem {
  Customer generateEmail(String customerType); /* generate email based on customer type. */
}
