package jUnitTesting;

public class PrinterService {
  final int minLength = 10;
  final int maxLength = 60;

  public boolean checkPageLength(int pageLength) {
    if (pageLength >= minLength && pageLength <= maxLength) {
      return true;
    } else {
      return false;
    }
  }
}
