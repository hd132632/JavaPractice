package org.dimigo.thread;

public class Race {
	public static void main(String[] args) {
	Thread run1 = new Runner("홍길동");
		Thread run2 = new Runner("홍길순");
		
		run1.start();
		run2.start();
	}

}
