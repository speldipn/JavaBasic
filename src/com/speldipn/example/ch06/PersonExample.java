package com.speldipn.example.ch06;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-19
 */
public class PersonExample {
  public static void main(String[] args) {
    Person p1 = new Person("123456-1234567", "계백");

    System.out.println(p1.nation);
    System.out.println(p1.ssn);
    System.out.println(p1.name);

    // p1.nation = "usa";
    // p1.ssn = "234567-2345678";
    p1.name = "을지문덕";

  }
}
