package org.dimigo.basic;

public class Promotion {
	public static void main(String[] args) {
		int salary=1700000;
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.print("월 평균 급여 : ");
		System.out.println(String.format("%,d", salary) + "원" );
		int people = 3;
		int store = 1500;
		long annual = (long)salary*people*store*12;
		System.out.println("\n연간 인건비 : " +String.format("%,d", annual) + "원");
		
	}

}
