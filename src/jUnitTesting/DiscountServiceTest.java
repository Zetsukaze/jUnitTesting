package jUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiscountServiceTest {

  @Test
  public void checkDiscountGiven() {

    // Initial
    DiscountService discountSvc = new DiscountService();
    final int price = 50;
    final int  discount = 5;

    // Run
    int result = discountSvc.applyDiscount(price);

    // Test
    assertEquals(discount, result);
  }

  @Test
  public void checkDiscountGivenAbove() {

    // Initial
    DiscountService discountSvc = new DiscountService();
    final int price = 51;
    final int  discount = 5;

    // Run
    int result = discountSvc.applyDiscount(price);

    // Test
    assertEquals(discount, result);
  }

  @Test
  public void checkDiscountBelow() {

    // Initial
    DiscountService discountSvc = new DiscountService();
    final int price = 49;
    final int  discount = 0;

    // Run
    int result = discountSvc.applyDiscount(price);

    // Test
    assertEquals(discount, result);
  }

}
