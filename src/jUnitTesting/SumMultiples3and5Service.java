package jUnitTesting;

public class SumMultiples3and5Service {

  public int sumMultiples3and5(int upperLimit) {
    int sum = 0;
    for (int i = 0; i < upperLimit; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum = sum + i;
      }
    }
    return sum;
  }
}
