package com.speldipn.example.fc_java.Exception;

public class ExceptionMain {

	public static void main(String[] args) {
		// Exception(예외) 의 종류
		
		// 0. 예외처리의 기본 구조
		try {
			// 예외가 발생할 수 있는 코드
		} catch(Exception e) {
			System.out.println(e);
		}
		
		// 1. CheckedException
		// 예외가 발생했을 때 코드상에서 처리할 수 있는 경우
		// 예외도 하나의 객체로써 발생하는데, 체크드 예외는 java에 이미 정의가 되어있다.
		
		System.out.println("예외 발생전");		
		
		// try, catch 구문으로 처리 하지 않는 경우, 예외가 발생하면 프로그램이 종료되어 버린다.
		

		try {
			// 1.1 정수를 0으로 나눌때
			int a = 35 / 0;
		
			// 1.2 배열의 index 범위를 벗어날 때
			int nums[] = new int[5];			
			nums[5] = 56;
			
		}  catch(Exception e) {
			// printStatckTrace는 내부적으로 제3의 thread에서 동작하기 때문에
			e.printStackTrace();
		}
		
		System.out.println("예외 발생후");

		// 2. UncheckedException - RuntimeException
		// 예외가 발생했을 때 코드상에서 처리가 불가능한 경우
		// 복구가 불가능한 상황이기 때문에 예외를 발생시키지 않고 종료처리하기도 한다.	
		try {
			// RuntimeException 발생시는 try catch로 처리할 수 있다.
			// RuntimeException을 처리 못하는 경우도 있으며 그것은 0.1%정도뿐이다.			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}