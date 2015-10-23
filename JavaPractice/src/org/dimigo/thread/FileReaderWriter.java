package org.dimigo.thread;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileReaderWriter {
	public static void main(String[] args) {
		try(Reader reader = new FileReader("files/input.txt");
				Writer writer = new FileWriter("files/output.txt")){
			char[] buf = new char[100];
			int result;
			
			while ((result = reader.read(buf)) != -1){
				writer.write(buf,0,result);
				
			}
			writer.write("\n요것도 출력되겠지롱!!!");
			System.out.println("파일 생성완료!!!");
		} catch (IOException e){
			e.printStackTrace();
		}
	}

}
