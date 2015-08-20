package jUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumMultiples3and5ServiceTest {

  @Test
  public void test() {
    // Initial
    SumMultiples3and5Service sumService = new SumMultiples3and5Service();
    final int upperLimit = 10;
    final int sum = 23;

    // Run
    final int result = sumService.sumMultiples3and5(upperLimit);

    // Test
    assertEquals(sum, result);
  }

}
