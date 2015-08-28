package org.dimigo.oop;

public class Calculator2 {

   private int num1;
   private int num2;
   private boolean yes;
   
   public Calculator2() {
      
   }
   
   public void powerOn() {
      System.out.println("전원을 켭니다");
      yes=true;
   }
   
   public void powerOff() {
      System.out.println("전원을 끕니다");
      yes=false;
   }
   
   public Calculator2(int num1, int num2) {
      this.num1 = num1;
      this.num2 = num2;
   }
   
   public int add() {
	   if (yes!=true)
	   {
		   System.out.println("전원부터키세요");
		   return 0;
	   }
      return num1 + num2;
   }
   
   public int sub() {
	   if (yes!=true)
	   {
		   System.out.println("전원부터키세요");
		   return 0;
	   }
	   return num1 - num2;
      
   }
   
   public int mul() {
	   if (yes!=true)
	   {
		   System.out.println("전원부터키세요");
		   return 0;
	   }
	   return num1 * num2;
   }
   
   public double div() {
	   if (yes!=true)
	   {
		   System.out.println("전원부터키세요");
		   return 0;
	   }
	   return num1 / num2;
   }
}