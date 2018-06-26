package com.speldipn.example.this_is_java.java8;

/*
 * @author Oh, joon young (speldipn)
 * @since 2018-06-25
 */
public class OopAnotherExample {
  public static void main(String[] args) {
    CalculatorService calculatorService = new CalculatorService();
    final int additionResult = calculatorService.calculate('+', 10, 20);
    System.out.println("result: " + additionResult);
    final int subtractionResult = calculatorService.calculate('-', 30, 20);
    System.out.println("result: " + subtractionResult);
    final int multiplicationResult = calculatorService.calculate('*', 30, 20);
    System.out.println("result: " + multiplicationResult);
    final int divisionResult = calculatorService.calculate('/', 30, 10);
    System.out.println("result: " + divisionResult);
  }
}

class CalculatorService {
  public int calculate(char calculation, int num1, int num2) {
    if(calculation == '+') {
      return num1 + num2;
    } else if(calculation == '-'){
      return num1 - num2;
    } else if(calculation == '*') {
      return num1 * num2;
    } else if(calculation == '/') {
      return num1 / num2;
    }else {
      throw new IllegalArgumentException("Unknown calculation: " + calculation);
    }
  }
}
