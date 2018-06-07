package com.speldipn.example.ch03.operationpromotion;

/**
 * @author Oh, Joon young (speldipn)
 * @since 2018-04-15
 */
public class PromotionExample {
  public static void main(String[] args) {
    // 자료형이 작은곳에서 큰곳으로 저장할때는 묵시적 형변환이 이루어진다.

    byte byteValue = 10;
    int intValue = byteValue; // int <- byte
    System.out.println(intValue);

    char charValue = '가';
    intValue = charValue; // int <- char
    System.out.println("가의 유니코드: " + intValue);

    intValue = 500;
    long longValue = intValue; // long <- int
    System.out.println(longValue);

    intValue = 200;
    double doubleValue = intValue; // double <- int
    System.out.println(doubleValue);

  }
}
