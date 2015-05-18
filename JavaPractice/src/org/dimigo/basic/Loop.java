package org.dimigo.basic;

public class Loop {
	public static void main(String[] args) {
		for (int i=0;i<10;i++)
		{
			for (int j=0;j<10;j++)
			{
				if (i==j)
				System.out.printf("*");
				else
					System.out.printf("%d",j+1);
			}
			System.out.println("");
		}
	}

}
