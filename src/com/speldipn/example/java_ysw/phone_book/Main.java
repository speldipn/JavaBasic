package com.speldipn.example.java_ysw.phone_book;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-10
 */
public class Main {
  public static void main(String[] args) {
    Phone person1 = new Phone("이정훈", "313-1111", "92.11.20");
    Phone person2 = new Phone("김효준", "321-2222");

    person1.showPhone();
    System.out.println();
    person2.showPhone();

  }
}
