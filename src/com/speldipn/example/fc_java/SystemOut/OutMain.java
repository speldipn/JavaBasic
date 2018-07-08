package com.speldipn.example.fc_java.SystemOut;

import java.io.PrintStream;

public class OutMain {

	public static void main(String[] args) {
		
		String str = "Hello System.out.println !!";
		
		Systems.out.println(str);
	}

}

class Systems {
	public static PrintStream out = new PrintStream(java.lang.System.out);
}
