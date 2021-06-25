package com.bridgelab.utility;

import java.util.Scanner;

public class Number {
   Scanner input;
   public Number()
   {
	   input = new Scanner(System.in);
   }
   public int getValue()
   {
	   return input.nextInt();
   }
   public void number(int N)
   {
	   int x = 1;
	   for (int i = 2; i < N; i++)
	   {   
		   if (N % i == 0)
		   {
			   x = 0;
			   System.out.println("Not Prime number");
		   }
	   }
	   if (x == 1)
	   {
		   System.out.println("Number is Prime Number");
	   }
   }
}
