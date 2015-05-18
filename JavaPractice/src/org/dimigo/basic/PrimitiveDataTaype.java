package org.dimigo.basic;

public class PrimitiveDataTaype {
	public static void main(String[] args) {
		

	String name = "아이유";
	Boolean Ismale = false;
	int age = 23;
	double height = 161.8;
	float weight = 44.3f;
	char bloodtype = 'A';
	System.out.printf("<< 아이유 프로필 >>\n이름 : %s\n",name);
	if (Ismale)
	{
		System.out.println("성별 : 남자");
	}else
	{
		System.out.println("성별 : 여자");
	}

	System.out.println("나이 : "+age+"세");
	System.out.printf("키 : %.1f\n몸무게 : %.1f\n혈액형 : %c형",height,weight,bloodtype);
	}

}
