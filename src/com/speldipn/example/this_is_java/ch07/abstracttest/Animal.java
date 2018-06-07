package com.speldipn.example.this_is_java.ch07.abstracttest;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-23
 */
public abstract class Animal {
  public String kind;

  public void breathe() {
    System.out.println("숨을 쉽니다.");
  }

  public abstract void sound();
}
