package org.dimigo.oop;

public class Calculator {


   private boolean yes;
   
   public Calculator() {
      
   }
   
   public void powerOn() {
      System.out.println("전원을 켭니다");
      yes=true;
   }
   
   public void powerOff() {
      System.out.println("전원을 끕니다");
      yes=false;
   }
   
   
   public static int add(int num1, int num2) {
	   //if (yes!=true)
	  // {
		///   System.out.println("전원부터키세요");
		 //  return 0;
	  // }
      return num1 + num2;
   }
   
   public static int sub(int num1, int num2) {
//	  if (yes!=true)
//	   {
//		   System.out.println("전원부터키세요");
//		   return 0;
//	   }
	   return num1 - num2;
      
   }
   
   public static int mul(int num1, int num2) {
//	  // if (yes!=true)
//	   {
//		   System.out.println("전원부터키세요");
//		   return 0;
//	   }
	   return num1 * num2;
   }
   
   public static double div(int num1, int num2) {
//	  // if (yes!=true)
//	   {
//		   System.out.println("전원부터키세요");
//		   return 0;
//	   }
	   return num1 / num2;
   }
}