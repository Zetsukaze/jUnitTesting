package jUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateEmailServiceTest {

  @Test
  public void testNormalEmail() {
    // Initial
    ValidateEmailService validEmailSvc = new ValidateEmailService();
    final String email = "blah-blah_blah.blah@blah.com";

    // Run
    final boolean result = validEmailSvc.isValidEmail(email);

    // Test
    assertEquals(true, result);
  }

  @Test
  public void testLocalLengthWrong() {
    // Initial
    ValidateEmailService validEmailSvc = new ValidateEmailService();
    String local = "";
    for (int i = 0; i <= 64; i++) {
      local = local.concat("a");
    }
    final String email = local + "@blah.com";

    // Run
    final boolean result = validEmailSvc.isValidEmail(email);

    // Test
    assertEquals(false, result);
  }


  @Test
  public void testDomainLengthWrong() {
    // Initial
    ValidateEmailService validEmailSvc = new ValidateEmailService();
    String domain = "";
    String suffix = ".com";
    for (int i = 0; i <= 253 - 4; i++) {
      domain = domain.concat("a");
    }
    final String email = "blah@" + domain + suffix;

    // Run
    final boolean result = validEmailSvc.isValidEmail(email);

    // Test
    assertEquals(false, result);
  }

  @Test
  public void testNoConsectuivePeriods() {
    // Initial
    ValidateEmailService validEmailSvc = new ValidateEmailService();
    final String email = "blah..blah@blah.com";

    // Run
    final boolean result = validEmailSvc.isValidEmail(email);

    // Test
    assertEquals(false, result);
  }

  @Test
  public void testNoStartingPeriod() {
    //Initial
    ValidateEmailService validEmailSvc = new ValidateEmailService();
    final String email = ".blah@blah.com";

    // Run
    final boolean result = validEmailSvc.isValidEmail(email);

    // Test
    assertEquals(false, result);
  }

  @Test
  public void testNoEndingPeriod() {
    // Initial
    ValidateEmailService validEmailSvc = new ValidateEmailService();
    final String email = "blah.@blah.com";

    // Run
    final boolean result = validEmailSvc.isValidEmail(email);

    // Test
    assertEquals(false, result);
  }

  @Test
  public void testLocalAlphanumeric() {
    // Initial
    ValidateEmailService validEmailSvc = new ValidateEmailService();
    final String email = "blah0123456789@blah.com";

    // Run
    final boolean result = validEmailSvc.isValidEmail(email);

    // Test
    assertEquals(true, result);
  }

  @Test
  public void testSpecialChars() {
    // Initial
    ValidateEmailService validEmailSvc = new ValidateEmailService();
    final String email = "blah-blah_blah.blah@blah.com";

    // Run
    final boolean result = validEmailSvc.isValidEmail(email);

    // Test
    assertEquals(true, result);
  }

  @Test
  public void testLocalUpper() {
    // Initial
    ValidateEmailService validEmailSvc = new ValidateEmailService();
    final String email = "BLAH@blah.com";

    // Run
    final boolean result = validEmailSvc.isValidEmail(email);

    // Test
    assertEquals(true, result);
  }

  @Test
  public void testLocalNotNull() {
    // Initial
    ValidateEmailService validEmailSvc = new ValidateEmailService();
    final String email = "@blah.com";

    // Run
    final boolean result = validEmailSvc.isValidEmail(email);

    // Test
    assertEquals(false, result);
  }
}
