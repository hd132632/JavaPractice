package org.dimigo.thread;

public class Race2 {
	public static void main(String[] args) {
	System.out.println("main thread start");
		Thread run1 = new Thread(new Runner("홍길동"));
		Thread run2 = new Thread(new Runner("홍길순"));
		
		
		run1.start();
		run2.start();
		System.out.println("main thread end");
	}

}
