package com.speldipn.example.this_is_java.ch06;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-19
 */
public class SingletonExample {
  public static void main(String[] args) {
//    Singleton obj1 = new Singleton();
//    Singleton obj2 = new Singleton();

    Singleton obj1 = Singleton.getInstance();
    Singleton obj2 = Singleton.getInstance();

    if(obj1 == obj2) {
      System.out.println("같은 Singleton 객체입니다.");
    } else {
      System.out.println("다른 Singleton 객체입니다.");
    }
  }
}
