package com.speldipn.example.fc_java.Loop.src.com.speldipn.loop;

public class BreakContinue {

	public static void main(String[] args) {
		int begin = 1;
		int end = 9;		
		int offset = 10;
		
		out: for(int i = begin; i <= end; ++i) {
			
//			if(i > 5)break;
			if(i < 5)continue;
			
			for(int j = 1; j <= offset; ++j) {
				if(j == 7)break out; 
				int result = i * j;
//				System.out.println(i + " * " + j + " = " + result);
				System.out.printf("%d x %d = %d\n", i, j, result);
			}			
		}
	}

}
