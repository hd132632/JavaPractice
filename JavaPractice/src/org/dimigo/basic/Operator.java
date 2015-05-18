package org.dimigo.basic;

public class Operator {
	public static void main(String[] args) {
		int a=9,b=10;
		double h = 5.8d;
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : ");
		double first = (a+b) * h / 2;
		double sec = (a * h);
		System.out.println(first);
		System.out.println("평행사변형 넓이 : ");
		System.out.printf("%.1f\n",sec);
		
		if (first > sec)
		{
			System.out.println("사다리꼴이 평행사변형 보다 " + (first-sec) + " 더 큽니다.");
		} else if (sec < first)
		{
			System.out.println("평행사변형이 사다리꼴 보다 " + (sec-first) + " 더 큽니다.");
		} else
		{
			System.out.println("사다리꼴과 평행사변형의 넓이가 같습니다");
		}
	}

}
