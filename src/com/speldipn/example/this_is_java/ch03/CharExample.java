package com.speldipn.example.this_is_java.ch03;

/**
 * @author Oh, Joon young (speldipn)
 * @since 2018-04-15
 */
public class CharExample {
  public static void main(String[] args) {
    char c1 = 'A'; // 문자를 직접 저장
    char c2 = 65; // 10진수로 저장
    char c3 = '\u0041'; // 16진수로 저장

    char c4 = '가'; // 문자를 직접 저장
    char c5 = 44032;  // 10 진수로 저장
    char c6 = '\uac00';  // 16 진수로 저장

    int uniCode = c1; // 유니코드 얻기

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
    System.out.println(c6);
    System.out.println(uniCode);

//    char c7 = ''; 컴파일 에러 발생 문자는 공백으로 줄 수 없다.




  }
}
