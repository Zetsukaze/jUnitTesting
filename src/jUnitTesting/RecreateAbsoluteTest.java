package jUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecreateAbsoluteTest {

  @Test
  public void testPositiveInt() {
    // Initial
    final int start = 1;
    final int end = 1;

    // Run
    final int result = RecreateAbsolute.abs(start);

    // Test
    assertEquals(end, result);
  }

  @Test
  public void testZeroInt() {
    // Initial
    final int start = 0;
    final int end = 0;

    // Run
    final int result = RecreateAbsolute.abs(start);

    // Test
    assertEquals(end, result);
  }

  @Test
  public void testNegativeInt() {
    // Initial
    final int start = -1;
    final int end = 1;

    // Run
    final int result = RecreateAbsolute.abs(start);

    // Test
    assertEquals(end, result);
  }

  @Test
  public void testMaxInt() {
    // Initial
    final int start = Integer.MAX_VALUE;
    final int end = Integer.MAX_VALUE;

    // Run
    final int result = RecreateAbsolute.abs(start);

    // Test
    assertEquals(end, result);
  }

  @Test
  public void testMin1Int() {
    // Initial
    final int start = Integer.MIN_VALUE + 1;
    final int end = Integer.MAX_VALUE;

    // Run
    final int result = RecreateAbsolute.abs(start);

    // Test
    assertEquals(end, result);
  }

  @Test (expected = ArithmeticException.class)
  public void testMinInt() {
    // Initial
    final int start = Integer.MIN_VALUE;
    final int end = Integer.MIN_VALUE;

    // Run
    final int result = RecreateAbsolute.abs(start);
  }

}
