package org.dimigo.oop;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.println("수학점수 입력 => ");
		int math= scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		int eng=scanner.nextInt();
		
		System.out.println("<< 점수 출력 >>");
		String sb = new StringBuilder()
		.append("<< 점수 출력 >>\n")
		.append("국어 점수 : ")
		.append(kor)
		.append("점\n수학 점수 : ")
		.append(math)
		.append("점\n영어 점수 : ")
		.append(eng)
		.append("점\n총점 : ")
		.append(kor+eng+math)
		.append("점\n평균 : ")
		.append((kor+eng+math)/3)
		.append("점").toString();
		System.out.println(sb);
		
	}

}
