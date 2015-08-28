package org.dimigo.oop;

public class CalculatorTest {
   
   public static void main(String[] args) {
      int n1 = 10, n2 = 20;
      Calculator calculator = new Calculator();
      
      //calculator.powerOn();
      
      System.out.println(n1 + "+" + n2 + "=" + calculator.add(n1,n2));
      System.out.println(n1 + "-" + n2 + "=" + calculator.sub(n1,n2));
      System.out.println(n1 + "*" + n2 + "=" + calculator.mul(n1,n2));
      System.out.println(n1 + "/" + n2 + "=" + calculator.div(n1,n2));
      
      calculator.powerOff();
   }
   

}