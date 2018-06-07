package com.speldipn.example.this_is_java.ch07.car;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-22
 */
public class Tire {
  public int maxRotation;
  public int accumulatedRotation;
  public String location;

  public Tire(String location, int maxRotation) {
    this.location = location;
    this.maxRotation = maxRotation;
  }

  public boolean roll() {
    ++accumulatedRotation;
    if(accumulatedRotation < maxRotation) {
      System.out.println(location + " Tire 수명: " +
        (maxRotation-accumulatedRotation) + "회");
      return true;
    } else {
      System.out.println("*** " + location + " Tire 펑크 ***");
      return false;
    }
  }
}
