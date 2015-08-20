package jUnitTesting;

public class DiscountService {

  public int applyDiscount(int price) {
    if (price >= 50) {
      return 5;
    } else {
      return 0;
    }
  }

}
