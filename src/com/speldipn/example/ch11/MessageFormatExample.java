package com.speldipn.example.ch11;

import java.text.MessageFormat;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-15
 */
public class MessageFormatExample {
  public static void main(String[] args) {
    String id = "java";
    String name = "신용권";
    String tel = "010-123-5678";

    String text = "회원 ID: {0} \n회원이름: {1} \n회원전화: {2}";
    String result1 = MessageFormat.format(text, id, name, tel);
    System.out.println(result1);
    System.out.println();

    String sql = "insert into member values( {0}, {1}, {2} )";
    Object[] arguments = {"'java'", "'신용권'", "'010-123-5678'"};
    String resutl2 = MessageFormat.format(sql, arguments);
    System.out.println(resutl2);
  }
}
