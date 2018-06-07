package com.speldipn.example.ch11.solve;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-16
 */
public class Problem {
  public static void main(String[] args) {
    // 1. (4)
    // 2. hashCode(), equals()
    // 3. student 코딩
    // 4. member 코딩
    // 5. (4)
    // 6 ~ 12 : 코딩
    // 13. Wrapper 클래스를 사용할대 == 와 != 연산을 사용하지 않는 것이 좋다.
    // 비교연산시에 언박싱된 값을 비교해야 하는데 자바에서는 == 와 != 연산자는 참조변수를 비교하는데 사용하기 때문이다.
    // 허용되는 값들이 있긴하지만(ex -128~127, boolean .. ) 이 외에는 제대로된 비교가 어렵기 때문에 equals() 메소드를 overriding하거나
    // 할당한 Wrapper 클래스 타입에 맞는 값을 가져와서 비교하는것 올바르다.

  }
}
