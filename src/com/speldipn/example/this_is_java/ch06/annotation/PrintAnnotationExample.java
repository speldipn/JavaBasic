package com.speldipn.example.this_is_java.ch06.annotation;

import java.lang.reflect.Method;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-04-19
 */
public class PrintAnnotationExample {
  public static void main(String[] args) {
    // Service 클래스로부터 메소드 정보를 얻음
    Method[] declareMethods = Service.class.getDeclaredMethods();

    // Method 객체를 하나씩 처리
    for (Method method : declareMethods) {
      // PrintAnnotation이 적용되었는지 확인
      if (method.isAnnotationPresent(PrintAnnotation.class)) {
        //PrintAnnotation 얻기
        PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

        // 메소드 이름 출력
        System.out.println("[" + method.getName() + "] ");
        // 구분선 출력
        for (int i = 0; i < printAnnotation.number(); ++i) {
          System.out.print(printAnnotation.value());
        }
        System.out.println();

        // 메소드 호출
        try {
          method.invoke(new Service());
        } catch (Exception e) {
        }
        System.out.println();
      }
    }
  }
}
