package org.dimigo.inheritance;

public class Figure {
	protected int centerX;
	protected int centerY;
	
	public Figure (int centerX, int centerY)
	{
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea()
	{
		return 0.0;
	
	}
	protected void printCenter()
	{
		System.out.printf("중심좌표 : (%d,%d)",centerX,centerY);
	}
	protected void moveFigure(int x, int y)
	{
		System.out.println("--중심좌표 이동");
		centerX+=x;
		centerY+=y;
	}
	

}
