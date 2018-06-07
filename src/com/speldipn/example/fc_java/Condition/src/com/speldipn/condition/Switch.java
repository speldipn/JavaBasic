package com.speldipn.example.fc_java.Condition.src.com.speldipn.condition;

public class Switch {

	public static void main(String[] args) {
		//--------------
		// switch의 기본구조
		//--------------
		
		int a = 30;
		
		switch(a) {
			case 10: System.out.println("a의값이 10입니다"); break;
			case 20: System.out.println("a의값이 20입니다"); break;
			case 30: System.out.println("a의값이 30입니다"); break;
			default: System.out.println("a의값이 " + a); break;		
		}

	}

}
