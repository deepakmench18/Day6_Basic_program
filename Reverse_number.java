package com.bridgelab.program;

import com.bridgelab.utility.Check_reverse;

public class Reverse_number {

	public static void main(String[] args) {
		Check_reverse obj = new Check_reverse();
		System.out.println("Enter Number :");
		int N = obj.getValue();
		obj.reverse(N);

	}

}
