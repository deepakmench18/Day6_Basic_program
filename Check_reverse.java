package com.bridgelab.utility;

import java.util.Scanner;

public class Check_reverse {
	Scanner scanner;
	public Check_reverse()
	{
		scanner = new Scanner(System.in);
	}
	public int getValue()
	{
		return scanner.nextInt();
	}
	public void reverse(int N)
	{
		int digit = 0, rev = 0;
		int temp = N;
		while(N != 0)
		{
			digit = N % 10;
			rev = rev * 10 + digit;
			N = N / 10;
		}
		System.out.println("Reversed Number" + rev);
	}

}
