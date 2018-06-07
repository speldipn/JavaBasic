package com.speldipn.example.ch07.abstracttest;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-23
 */
public class SmartPhone extends Phone {
  public SmartPhone(String owner) {
    super(owner);
  }

  public void internetSearch() {
    System.out.println("인터넷 검색을 합니다.");
  }
}
