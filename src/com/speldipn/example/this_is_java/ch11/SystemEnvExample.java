package com.speldipn.example.this_is_java.ch11;

public class SystemEnvExample {
  public static void main(String[] args) {
    String javaHome = System.getenv("JAVA_HOME");
    if(javaHome != null) {
      System.out.println(javaHome);
    }
  }
}
