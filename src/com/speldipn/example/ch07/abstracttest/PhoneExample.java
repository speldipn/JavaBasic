package com.speldipn.example.ch07.abstracttest;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-23
 */
public class PhoneExample {
  public static void main(String[] args) {
    //Phone phone = new Phone();

    SmartPhone smartPhone = new SmartPhone("홍길동");

    smartPhone.turnOn();
    smartPhone.internetSearch();
    smartPhone.turnOff();

  }
}
