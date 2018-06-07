package com.speldipn.example.this_is_java.ch07.airplane;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-21
 */
public class SupersonicAirplaneExample {
  public static void main(String[] args) {
    SupersonicAirplane sa = new SupersonicAirplane();

    sa.takeOff();
    sa.fly();
    sa.flyMode = SupersonicAirplane.SUPERSONIC;
    sa.fly();
    sa.flyMode = SupersonicAirplane.NORMAL;
    sa.fly();
    sa.land();
  }
}
