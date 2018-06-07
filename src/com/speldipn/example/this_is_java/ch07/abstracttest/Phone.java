package com.speldipn.example.this_is_java.ch07.abstracttest;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-23
 */
public abstract class Phone {
  public String owner;

  public Phone(String owner) {
    this.owner = owner;
  }

  public void turnOn() {
    System.out.println("폰 전원을 켭니다.");
  }

  public void turnOff() {
    System.out.println("폰 전원을 끕니다.");
  }
}

