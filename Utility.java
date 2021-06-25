package com.bridgelab.utility;

import java.util.Scanner;

public class Utility {
	Scanner scanner;
	public Utility()
	{
		scanner = new Scanner(System.in);
	}
	public int getValue()
	{
		return scanner.nextInt();
	}
	public void Perfect(int N)
	{
		int sum = 0;
		for(int i= 1; i < N; i++)
		{
			
			if(N % i == 0)
			{
			sum = sum + i;
	        }
		}
	if (sum == N)
	{
		System.out.println("Number is perfect number");
	}
	else
	{
		System.out.println("Number is Not Perfect Number");
	}

}
}
