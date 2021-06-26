package com.bridgelab.program;
import com.bridgelab.utility.Utility;
public class Coupons {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.print("Enter number of coupons to generat n: " );
		int numberOfCoupns = utility.getValue();
		System.out.print("Enter Size of coupons: " );
		int sizeOfCoupon = utility.getValue();
		Utility.getCoupons(numberOfCoupns,sizeOfCoupon);

	}

}
