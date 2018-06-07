package com.speldipn.example.ch06;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-19
 */
public class CarExample {
  public static void main(String[] args) {
    Car myCar = new Car();

    // 잘못된 속도 변경
    myCar.setSpeed(-50);

    System.out.println("현재 속도 : " + myCar.getSpeed() + "km/h");

    // 올바른 속도 변경
    myCar.setSpeed(60);

    System.out.println("현재 속도 : " + myCar.getSpeed() + "km/h");

    if(!myCar.isStop()) {
      myCar.setStop(true);
    }

    System.out.println("현재 속도 : " + myCar.getSpeed() + "km/h");
  }
}
