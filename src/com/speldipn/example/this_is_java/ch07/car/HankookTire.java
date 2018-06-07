package com.speldipn.example.this_is_java.ch07.car;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-23
 */
public class HankookTire extends Tire {
  public HankookTire(String location, int maxRotation) {
    super(location, maxRotation);
  }

  @Override
  public boolean roll() {
    ++accumulatedRotation;
    if(accumulatedRotation < maxRotation) {
      System.out.println(location + " HankookTire 수명: " +
        (maxRotation-accumulatedRotation) + "회");
      return true;
    } else {
      System.out.println("*** " + location + " HankookTire 펑크 ***");
      return false;
    }
  }
}
