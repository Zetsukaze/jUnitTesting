package jUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumMultiples3and5ServiceTest {

  @Test
  public void test() {
    // Initial
    SumMultiples3and5Service sumService = new SumMultiples3and5Service();
    final int upperLimit = 1000;
    final int sum = 233168;

    // Run
    final int result = sumService.sumMultiples3and5(upperLimit);

    // Test
    assertEquals(sum, result);
  }

}
