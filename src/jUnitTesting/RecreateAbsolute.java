package jUnitTesting;

public class RecreateAbsolute {

  public static int abs(int i) {
    if (i >= 0) {
      return i;
    } else if (i == Integer.MIN_VALUE) {
      throw new ArithmeticException();
    } else {
      return i * -1;
    }
  }
}
