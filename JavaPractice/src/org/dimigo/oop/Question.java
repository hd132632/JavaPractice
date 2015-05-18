package org.dimigo.oop;

import java.util.Scanner;

public class Question {
	public static void main(String[] args) {
		String artist;
		String aartist="빅뱅";
		String actor;
		String aactor="저스틴비버";
		String subject;
		String asubject="자바";
		Scanner scanner = new Scanner(System.in);
		System.out.println("가장 좋아하는 가수는?");
		artist=scanner.nextLine();
		if(artist.equals(aartist))
		{
			System.out.println("정답입니다!");
		}else
		{
			System.out.println("틀렸습니다ㅠㅠ");
		}
		System.out.println("가장 좋아하는 배우는?");
		actor=scanner.nextLine();
		if(actor.equals(aactor))
		{
			System.out.println("정답입니다!");
		}else
		{
			System.out.println("틀렸습니다ㅠㅠ");
		}
		
			System.out.println("가장 좋아하는 과목은?");
			subject=scanner.nextLine();
			if(subject.equals(asubject))
			{
				System.out.println("정답입니다!");
			}else
			{
				System.out.println("틀렸습니다ㅠㅠ");
			
	}
			scanner.close();

		}
}
		
