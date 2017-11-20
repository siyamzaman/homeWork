package HomeWork;

import java.util.Scanner;

import org.junit.Test;

public class HomeWork11_11 {

	@Test
	public void Add() {
		
	//	int a=74;
	//int b=36;
	int c=74+36;
	System.out.println("sum of 74+36 is " + c);
	}
	
	///// Palindrome  @#@
	
	@Test
	
	public void Palindrome() {
		System.out.println("Please Enter a number : ");
      int palindrome = new Scanner(System.in).nextInt();
      
      if(isPalindrome(palindrome)){
          System.out.println("Number : " + palindrome + " is a palindrome");
      }else{
          System.out.println("Number : " + palindrome + " is not a palindrome");
      }       
      
  }
  
  public static boolean isPalindrome(int number) {
      int palindrome = number; // copied number into variable
      int reverse = 0;

      while (palindrome != 0) {
          int remainder = palindrome % 10;
          reverse = reverse * 10 + remainder;
          palindrome = palindrome / 10;
      }

     
      if (number == reverse) {
          return true;
      }
      return false;
	}
  
// Temperature.
  
  @Test
  public void temperature() {
	  
	  float temperatue;
	    Scanner in = new Scanner(System.in);      
	 
	    System.out.println("Enter temperatue in Fahrenheit: ");
	    temperatue = in.nextInt();
	 
	    temperatue = ((temperatue - 32)*5)/9;
	 
	    System.out.println("Temperatue in Celsius = " + temperatue);
  }
  
  @Test
  public void  inch() {
	  Scanner input = new Scanner(System.in);
	  
	          System.out.print("Input a value in inch: ");
	          double inch = input.nextDouble();
	          double meters = inch * 0.0254;
	          System.out.println("you input "+inch + " inch, which is equal to  " + meters + " meters.");
	  
  }
  
  @Test
  public void greatest() {
	  
	  int counter = 1;
      int number;
      int largest = 0;

      Scanner input = new Scanner(System.in);

      System.out.println("Enter the number: ");
      number = input.nextInt();
      largest=number;
      while(counter < 3){
          System.out.println("Enter the number: ");
          number = input.nextInt();        
          if(number > largest)//If largest is small, set current number as largest
              largest = number;
          counter++;
      

      }

      System.out.println("the largest number is " + largest);
	  
	  
  }
  
  
  @Test
  public void Smallest() {
	  
	  int counter = 1;
	  int number;
	  int smallest = 0;

	  Scanner input = new Scanner(System.in);

	  System.out.println("Enter the number: ");
	  number = input.nextInt();
	  smallest=number;
	  while(counter < 3){
	      System.out.println("Enter the number: ");
	      number = input.nextInt();        
	      if(number < smallest)
	          smallest = number;
	      counter++;


	  }

	  System.out.println("the smallest number is " + smallest);
	  
	  
  }
  
}
