package com.speldipn.example.ch06;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-19
 */
public class Car {
  String company = "현대자동차";
  String model = "그렌져";
  String color = "검정";
  int maxSpeed = 350;
  private int speed;
  private boolean stop;
  int gas;

  Car() {
  }

  Car(String model) {
    this(model, "은색", 250);
  }

  Car(String model, String color) {
    this(model, color, 250);
  }

  Car(String model, String color, int maxSpeed) {
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }

  public void setSpeed(int speed) {
    if (speed < 0) {
      this.speed = 0;
      return;
    } else {
      this.speed = speed;
    }
  }

  public int getSpeed() {
    return speed;
  }

  public void setStop(boolean stop) {
    this.stop = stop;
    this.speed = 0;
  }

  public boolean isStop() {
    return stop;
  }

  void setGas(int gas) {
    this.gas = gas;
  }

  boolean isLeftGas() {
    if (gas == 0) {
      System.out.println("gas가 없습니다.");
      return false;
    }
    System.out.println("gas가 있습니다.");
    return true;
  }

  void run() {
    for (int i = 10; i <= 50; i += 10) {
      speed = i;
      System.out.println(model + " 달립니다.(시속:" + speed + "km/h)");
    }
  }

  void keyTurnOn() {
    System.out.println("키를 돌립니다.");
  }


}
