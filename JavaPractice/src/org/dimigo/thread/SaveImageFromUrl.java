package org.dimigo.thread;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;


public class SaveImageFromUrl {
	public static void main(String[] args) {
		String imageUrl = "https://static.dimigo.in/img/logobeta.png";
		try {
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
					OutputStream os = new FileOutputStream("Files/logo.png")){
				
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
