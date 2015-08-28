package org.dimigo.oop;

public class CalculatorTest2 {
   
   public static void main(String[] args) {
      int n1 = 10, n2 = 20;
      Calculator calculator = new Calculator(n1, n2);
      
      //calculator.powerOn();
      
      System.out.println(n1 + "+" + n2 + "=" + calculator.add());
      System.out.println(n1 + "-" + n2 + "=" + calculator.sub());
      System.out.println(n1 + "*" + n2 + "=" + calculator.mul());
      System.out.println(n1 + "/" + n2 + "=" + calculator.div());
      
      calculator.powerOff();
   }
   

}