package org.dimigo.thread;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInOutStream {
	public static void main(String[] args) {
		try{InputStream is = new FileInputStream("files/407f7061d195db36c3585dcb9d84bc91.jpg");
				OutputStream os = new FileOutputStream("files/407f7061d195db36c3585dcb9d84bc91.jpg");
				int result;
				
			//	while((result = is.read()) != -1){
				//	os.write(result);
				//}
				byte[] buf = new byte[100];
				while ((result = is.read(buf)) != -1)
				{
					os.write(buf, 0, result);
				}
				System.out.println("파일 생성완료!!");
	}catch (Exception e){
		e.printStackTrace();
	}
				
	}

}
