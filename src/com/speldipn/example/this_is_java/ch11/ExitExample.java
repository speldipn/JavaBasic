package com.speldipn.example.this_is_java.ch11;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-12
 */
public class ExitExample {
  public static void main(String[] args) {
    // 보안 관리자 설정
    System.setSecurityManager(new SecurityManager() {
      @Override
      public void checkExit(int status) {
//        super.checkExit(status);
        if(status != 5) {
          throw new SecurityException();
        }
      }
    });

    for(int i = 0; i < 10; ++i) {
      // i값 출력
      System.out.println(i);
      try {
        System.exit(i);
      } catch (SecurityException e) {}
    }
  }
}
