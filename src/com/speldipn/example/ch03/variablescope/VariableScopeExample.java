package com.speldipn.example.ch03.variablescope;

/**
 * @author Oh, Joon young (speldipn)
 * @since 2018-04-15
 */
public class VariableScopeExample {
  public static void main(String[] args) {
    int v1 = 15;
    if(v1 > 10) {
      int v2 = v1 - 10;
    }
//    int v3 = v1 + v2 + 5; // v2변수를 사용할 수 없기 때문에 컴파일 에러가 발생

  }
}
