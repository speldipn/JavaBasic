package com.speldipn.example.ch11.arraysort;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-15
 */
public class Member implements Comparable<Member> {
  String name;

  public Member(String name) {
    this.name = name;
  }

  @Override
  public int compareTo(Member o) {
    return name.compareTo(o.name);
  }
}
