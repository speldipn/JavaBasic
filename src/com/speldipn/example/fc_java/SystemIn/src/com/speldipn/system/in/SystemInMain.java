package com.speldipn.example.fc_java.SystemIn.src.com.speldipn.system.in;

import java.util.Scanner;

public class SystemInMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 boolean runStatus = true;
		
		while(runStatus) {
			int cmd = scanner.nextInt(); // 프로그램이 실행된후 이 코드에서 대기한다.
			
			switch(cmd) {
				case 1:System.out.println("1. 안녕하세요"); break;
				case 2:System.out.println("2. 요즘어때요?"); break;
				case 3: System.out.println("3. 날씨가 좋군요");break;
				case 4: System.out.println("4. 오랜만이에요");break;
				case 5: System.out.println("5. 또봐요"); runStatus = false; break;
				default:System.out.println("명령어가 잘못입력되었습니다."); break;
			}
		}	
	}
}
