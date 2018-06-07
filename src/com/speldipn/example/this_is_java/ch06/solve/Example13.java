package com.speldipn.example.this_is_java.ch06.solve;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-19
 */
class Member {
  String name;
  String id;
  String password;
  int age;

  Member() {}
  Member(String name, String id) {
    this.name = name;
    this.id = id;
  }
}

class MemberService {
  boolean login(String id, String password) {
    if(id.equals("hong") && password.equals("12345")) {
      System.out.println("로그인 되었습니다.");
      return true;
    }
    return false;
  }

  boolean logout(String id) {
    if(id.equals("hong")) {
      System.out.println("로그아웃 되었습니다.");
      return true;
    }
    return false;
  }
}

public class Example13 {
  public static void main(String[] args) {
    Member user1 = new Member("홍길동", "hong");
    Member user2 = new Member("김자바", "java");

    MemberService ms = new MemberService();
    ms.login("hong", "12345");
    ms.login("ng", "123456");
    ms.logout("hong");
    ms.logout("ha");
  }
}
