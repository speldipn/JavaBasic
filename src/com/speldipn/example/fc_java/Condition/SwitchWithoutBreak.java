package com.speldipn.example.fc_java.Condition;

public class SwitchWithoutBreak {

	public static void main(String[] args) {
		String job = "driver"; // swimmer, runner, skater, driver, rider
		
		switch(job) {
		case "swimmer" : 
			System.out.println("나는 수영복이 필요합니다");
			break;
		case "runner" : 
			System.out.println("나는 운동화가 필요합니다");
			break;
		case "skater" : 			
		case "driver" : 			
		case "rider" : 
			System.out.println("나는 탈것이 필요합니다");
			
		default: break;
		}
	}

}
