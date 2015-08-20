package jUnitTesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmailService {
  private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
  private Pattern pattern;
  private Matcher matcher;

  public ValidateEmailService() {
    pattern = Pattern.compile(EMAIL_PATTERN);
  }
  public boolean isValidEmail(String email) {
    matcher = pattern.matcher(email);
    if (matcher.matches()) {
      String[] emailArray = email.split("@");
      if (emailArray[0].length() <= 64 && emailArray[1].length() < 254) {
        return true;
      } else {
        return false;
      }
    }
    return false;
  }

}
