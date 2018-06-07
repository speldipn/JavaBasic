package com.speldipn.example.ch07.abstracttest;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-23
 */
public class Dog extends Animal {
  public Dog() {
    this.kind = "포유류";
  }

  @Override
  public void sound() {
    System.out.println("멍멍");
  }
}
