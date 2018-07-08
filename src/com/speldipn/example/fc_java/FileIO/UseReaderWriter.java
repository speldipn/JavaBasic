package com.speldipn.example.fc_java.FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UseReaderWriter {
	// 1. 읽기
	public String read(String filePath) {
		String result = "";
		// 1.1 파일을 생성하고
		File file = new File(filePath);
		// 1.2. 파일이 있는지 확인
		if(file.exists()) {		
			int oneChar = 0;
			try(FileReader fr = new FileReader(file);) {
				while((oneChar = fr.read()) != (-1)) {					
					result = result + (char)oneChar;
				}
				System.out.println();
			} catch (FileNotFoundException e) {				
				e.printStackTrace();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	// 2. 쓰기
	public void write(String filePath, String content) {
		// 2.1 파일을 생성하고
		File file = new File(filePath);	
		
		if(file.exists()) {			
			try( FileWriter fw = new FileWriter(file, true)) { // FileWriter 두번째 파라미터는 append 여부 결정 : true
				fw.write(content);
				fw.write("\r\n");
			} catch (IOException e) {				
				e.printStackTrace();
			}
		} else {
			try( FileWriter fw = new FileWriter(file)) {
				fw.write(content);
				fw.write("\r\n");
			} catch (IOException e) {				
				e.printStackTrace();
			}						
		}
	}
}
