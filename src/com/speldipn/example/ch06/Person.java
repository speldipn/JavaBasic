package com.speldipn.example.ch06;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-19
 */
public class Person {
  final String nation = "Korea";
  final String ssn;
  String name;

  public Person(String ssn, String name) {
    this.ssn = ssn;
    this.name = name;
  }
}
