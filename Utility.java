package com.bridgelab.utility;

import java.util.Random;
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
	     public static void getCoupons(int noOfcoupns, int sizeOfCoupon) {
	 		int cnt = 0;
	 		String str1 = "";
	 		String coupns = "";
	 		while(cnt != noOfcoupns) {
	 			str1 = generateCoupons(sizeOfCoupon);
	 			if(!coupns.contains(str1)) {
	 				coupns += str1;
	 				cnt++;
	 				System.out.println("coupon"+cnt+" =  "+str1);
	 			}
	 		}
	 		
	 	}

	 	public static String generateCoupons(int sizeOfCoupon) {
	 		String str = "";
	 		Random random = new Random();
	 			for(int i=0; i<sizeOfCoupon; i++) {
	 				int num = random.nextInt(10);
	 				str += ""+num;
	 			}
	 		return str;
	 	}

}
