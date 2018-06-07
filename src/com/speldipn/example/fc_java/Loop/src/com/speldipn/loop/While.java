package com.speldipn.example.fc_java.Loop.src.com.speldipn.loop;

public class While {

	public static void main(String[] args) {
		/* 1. while(조건식) {
		 * 2. do {
		 * }while(조건식);
		 */
		
		int a = 11;
		
		System.out.println("While Test code");
		
		while(a <= 10) {
			System.out.println(a);
			a = a + 1;
		}
		
		System.out.println("Do While Test code");
		
		a = 11;
		do {
			System.out.println(a);
			a++;
		}while(a <= 10);

	}

}
