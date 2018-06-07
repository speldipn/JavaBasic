package com.speldipn.example.ch07.car;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-23
 */
public class CarExample {
  public static void main(String[] args) {
    Car car = new Car();

    for(int i = 1; i <= 5; ++i) {
      int problemLocation = car.run();
      if(problemLocation != 0) {
        System.out.println(car.tire[problemLocation-1].location + " Hankook 타이어로 교체");
        car.tire[problemLocation - 1] = new HankookTire(car.tire[problemLocation - 1].location, 15);
      }
      System.out.println("------------------------------------");
    }
  }
}
