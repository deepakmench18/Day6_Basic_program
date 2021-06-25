package com.bridgelab.utility;

import java.util.Scanner;

public class Main {
	Scanner scanner;
	public Main()
	{
		scanner = new Scanner(System.in);
	}
	public int getValue()
	{
		return scanner.nextInt();
	}
	public void Series(int N) {
		int first = 0,second = 1;
		int next = 0;
		for (int i = 0; i < N; i++)
		{
			System.out.println(first);
			next = first + second;
			first = second;
			second = next;
		}
	}

}
