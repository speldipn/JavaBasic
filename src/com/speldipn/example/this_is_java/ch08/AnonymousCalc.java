package com.speldipn.example.this_is_java.ch08;

public class AnonymousCalc {
  private int field;

  public void method(final int arg1, int arg2) {
    final int var1 = 0;
    int var2 = 0;

    field = 10;

//    arg1 = 20;
//    arg2 = 20;

//    var1 = 30;
//    var2 = 30;

    Calculatable calc = new Calculatable() {
      @Override
      public int sum() {
        int result = field + arg1 + arg2 + var1 + var2;
        return result;
      }
    };
    System.out.println("sum: " + calc.sum());
  }

  public static void main(String[] args) {
    AnonymousCalc anony = new AnonymousCalc();
    anony.method(0, 0);
  }
}
