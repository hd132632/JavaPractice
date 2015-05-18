package org.dimigo.basic;

public class Condition {
	public static void main(String[] args) {
		int bus =850;
		int car = 300;
		int any = 600;
		int num = (int)(Math.random()*20 +10);
		int type = (int)(Math.random()*3+1);
		System.out.println("<< 고속도로 통행료 계산 >>");
		switch (type)
		{
			case 1 :
				System.out.println("거리 : ");
				System.out.println((((int)num/5)*5) + "km");
				System.out.println("차종 : 고속버스");
				System.out.println("통행료 : " + (bus+(((num-10)/10)*300)));
				break;
			case 2 :
				System.out.println("거리 : ");
				System.out.println((((int)num/5)*5) + "km");
				System.out.println("차종 : 경차");
				System.out.println("통행료 : " + (car+(((num-10)/10)*200)));
				break;
				default :
					System.out.println("거리 : ");
					System.out.println((((int)num/5)*5) + "km");
					System.out.println("차종 : 그 외");
					System.out.println("통행료 : " + (any+(((num-10)/10)*200)));
		}
		
	}

}
