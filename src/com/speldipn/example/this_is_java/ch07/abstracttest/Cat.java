package com.speldipn.example.this_is_java.ch07.abstracttest;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-23
 */
public class Cat extends Animal {
  public Cat() {
    this.kind = "포유류";
  }

  @Override
  public void sound() {
    System.out.println("야옹");
  }
}
