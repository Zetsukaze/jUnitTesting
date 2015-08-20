package jUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrinterServiceTest {

  @Test
  public void testNormal() {

    // Should do boundary testing, min - just above min - normal - just below max - max

    // Initial
    PrinterService printerService = new PrinterService();
    final int minLength = printerService.minLength;
    final int maxLength = printerService.maxLength;

    // Run
    boolean validity = false;
    outerloop:
    for (int i = minLength; i <= maxLength; i++) {
      if (printerService.checkPageLength(i)) {
        validity = true;
      } else {
        validity = false;
        break outerloop;
      }
    }

    // Test
    assertEquals(true, validity);

  }

  @Test
  public void testBelowMin() {

    // Initial
    PrinterService printerService = new PrinterService();

    // Run
    final boolean validity = printerService.checkPageLength(9);

    // Test
    assertEquals(false, validity);
  }

  @Test
  public void testAboveMax() {

    // Initial
    PrinterService printerService = new PrinterService();

    // Run
    final boolean validity = printerService.checkPageLength(61);

    // Test
    assertEquals(false, validity);
  }
}
