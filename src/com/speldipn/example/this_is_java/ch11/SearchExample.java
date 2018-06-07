package com.speldipn.example.this_is_java.ch11;

import com.speldipn.example.this_is_java.ch11.arraysort.Member;
import com.speldipn.example.this_is_java.ch11.arraysort.Member;

import java.util.Arrays;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-05-15
 */
public class SearchExample {
  public static void main(String[] args) {
    // 기본 타입값 검색
    int[] scores = {99, 97, 98};
    Arrays.sort(scores);
    int index = Arrays.binarySearch(scores, 99);
    System.out.println("찾은 인덱스: " + index);

    // 문자열 검색
    String[] names = { "홍길동", "박동수", "김민수" };
    Arrays.sort(names);
    index = Arrays.binarySearch(names, "홍길동");
    System.out.println("찾은 인덱스: " + index);

    // 객체 검색
    com.speldipn.example.ch11.arraysort.Member m1 = new com.speldipn.example.ch11.arraysort.Member("홍길동");
    com.speldipn.example.ch11.arraysort.Member m2 = new com.speldipn.example.ch11.arraysort.Member("박동수");
    com.speldipn.example.ch11.arraysort.Member m3 = new com.speldipn.example.ch11.arraysort.Member("김민수");
    Member[] members = {m1, m2, m3};
    Arrays.sort(members);
    index = Arrays.binarySearch(members, m1);
    System.out.println("찾은 인덱스: " + index);

  }
}
