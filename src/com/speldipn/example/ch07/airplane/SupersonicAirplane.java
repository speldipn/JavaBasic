package com.speldipn.example.ch07.airplane;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-21
 */
public class SupersonicAirplane extends Airplane {
  public static final int NORMAL = 1;
  public static final int SUPERSONIC = 2;

  public int flyMode = NORMAL;

  @Override
  public void fly() {
    if (flyMode == SUPERSONIC) {
      System.out.println("초음속비행합니다.");
    } else {
      super.fly();
    }
  }
}
