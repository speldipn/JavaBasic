package com.speldipn.example.ch07.car;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-23
 */
public class KumhoTire extends Tire {
  public KumhoTire(String location, int maxRotation) {
    super(location, maxRotation);
  }

  @Override
  public boolean roll() {
    ++accumulatedRotation;
    if(accumulatedRotation < maxRotation) {
      System.out.println(location + " KumhoTire 수명: " +
        (maxRotation-accumulatedRotation) + "회");
      return true;
    } else {
      System.out.println("*** " + location + " KumhoTire 펑크 ***");
      return false;
    }
  }
}
