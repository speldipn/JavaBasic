package com.speldipn.example.java8;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class WhyJava8 {
  public static void main(String[] args) {
    final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    System.out.println(numbers);

    /* 1 : 2 : 3 : 4 : 5 : 6 : 7 : 8 : 9 : 10 으로 변환 */
    // case 1
    StringBuilder sb = new StringBuilder();
    for (Integer i : numbers) {
      sb.append(i + "");
      if (i != numbers.get(numbers.size() - 1)) {
        sb.append(" : ");
      }
    }
    System.out.println(sb);

    // case 2
    String result = numbers.stream()
                           .map(String::valueOf)
                           .collect(joining(" : "));
    System.out.println(result);
  }
}
