package com.speldipn.example.ch11.solve;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-16
 */
public class Member {
  private String id;
  private String name;

  public Member(String id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return id + ": " + name;
  }
}
