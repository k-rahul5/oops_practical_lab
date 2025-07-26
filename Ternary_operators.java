package oop;
import java.util.Scanner;
public class Ternary_operators {
	public static void main(String[] args) {

	    int februaryDays ;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("type a number");
	    februaryDays =sc.nextInt();
	    String result;

	    // ternary operator
	    result = (februaryDays ==29) ? "Not a leap year" : "Leap year";
	    System.out.println(result);
	  }
	}

		



  