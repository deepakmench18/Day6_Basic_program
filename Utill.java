package com.bridgelab.program;
import com.bridgelab.utility.Day_of_week;
public class Utill {
   
	public static void main(String[] args) {
		Day_of_week obj = new Day_of_week(); 
		System.out.println("Enter day");
		int d = obj.getValue();
		System.out.println("Enter month");
		int m = obj.getValue();
		System.out.println("Enter year");
		int y = obj.getValue();
		 if(d >= 1 || d <= 31 )
    	 {
    		 if(m >= 1 || m <= 12)
    		 {
    			 if (y > 1000 || y < 1000)
    			 {
    				 obj.day_week(d,m,y);	
    			 }
    		 }
    	 }
        	
		

	}

}
