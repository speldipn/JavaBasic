package com.speldipn.example.ch06;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-19
 */
public class Singleton {
  private static Singleton singleton = new Singleton();

  private Singleton() {}

  static Singleton getInstance() {
//    if(singleton == null) {
//      singleton = new Singleton();
//    }
    return singleton;
  }
}
