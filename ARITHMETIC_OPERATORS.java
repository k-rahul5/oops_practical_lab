package oop;
import java.util.Scanner;
class ArithmeticOperators {
    public static void main(String[] args) {
      
      // declare variables
      int a,b;
      Scanner sc= new Scanner(System.in);
      System.out.println("Type a number:");
      a = sc.nextInt(); 
      System.out.println("Type another number:");
      b = sc.nextInt();
      // addition operator
      System.out.println("a + b = " + (a + b));

      // subtraction operator
      System.out.println("a - b = " + (a - b));

      // multiplication operator
      System.out.println("a * b = " + (a * b));

      // division operator
      System.out.println("a / b = " + (a / b));

      // modulo operator
      System.out.println("a % b = " + (a % b));
    }
  }