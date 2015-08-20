package jUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void testStringConcat() {
		// Initial
		final String prefix = "lol";
		final String suffix = "cats";
		final String end = "lolcats";

		// Run
		final String result = prefix.concat(suffix);

		// Test
		assertEquals(end, result);
	}

	@Test
	public void testStringLength() {
		// Initial
		final String testString = "01234";

		// Run
		final int length = testString.length();

		// Test
		assertEquals(5, length);
	}

	@Test
	public void testStringUpper() {
		// Initial
		final String start = "abcde";
		final String end = "ABCDE";

		// Run
		final String result = start.toUpperCase();

		// Test
		assertEquals(end, result);
	}

	@Test
	public void testStringReplace() {
    // Initial
    final String start = "string";
    final String end = "-tring";

    // Run
    final String result = start.replace('s', '-');

    // Test
    assertEquals(end, result);
	}

  @Test
  public void testStringSlice() {
    // Initial
    final String start = "string";
    final String end = "ring";

    // Run
    final String result = start.substring(2);

    // Test
    assertEquals(end, result);
  }
}
