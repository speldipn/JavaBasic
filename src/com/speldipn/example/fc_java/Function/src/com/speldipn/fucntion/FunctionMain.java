package com.speldipn.example.fc_java.Function.src.com.speldipn.fucntion;

public class FunctionMain {

	public static void main(String[] args) {
	   One one = new One();
	   
	   // 1. 반환값이 없는 함수 사용
	   one.call();
	   
	   // 2. 반환값이 있는 함수 사용
	   String value = one.getValue();
	   System.out.println(value);
	   
	   // 3. 파라미터 있는 함수에 값 넘기기
	   Two two = new Two();
	   two.print("Sample");
	   String str = "Hello";
	   two.print(str);
	   
	   two.printMulti("첫번째 인자", 31, "세번째 인자");
	   
	   
	   /////////////////////////////////////////////////
	   
	   // 오버로드 테스트 코드	   
	   Overload overload = new Overload();
	   overload.take("");
	   overload.take("", "");
	   overload.take(10);
	   overload.take("", 20);
	   overload.take(20, "");
	   
	}

}
