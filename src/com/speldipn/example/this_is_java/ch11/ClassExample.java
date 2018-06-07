package com.speldipn.example.this_is_java.ch11;

public class ClassExample {
  public static void main(String[] args) {
    Car car = new Car();
    Class clazz1 = car.getClass();
    System.out.println(clazz1.getName());
    System.out.println(clazz1.getSimpleName());
    System.out.println(clazz1.getPackage().getName());
    System.out.println();

    try {
      Class clazz2 = Class.forName("ch11.ClassExample$Car");
      System.out.println(clazz2.getName());
      System.out.println(clazz2.getSimpleName());
      System.out.println(clazz2.getPackage().getName());
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  static class Car {
    int speed;
    int fuel;

    public Car() {
    }

    public Car(int speed, int fuel) {
      this.speed = speed;
      this.fuel = fuel;
    }

    public void downSpeed(int value) {
      speed -= value;
    }

    public void upSpeed(int value) {
      speed += value;
    }

    public void showInfo() {
      System.out.println("연로 : " + this.fuel);
      System.out.println("속도 : " + this.speed);
    }
  }
}
