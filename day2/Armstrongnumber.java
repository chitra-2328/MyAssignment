package week1.day2;

public class Armstrongnumber {

	public static void main(String[] args) {
				int input, calculated,remainder,original;
				 input=153;
				calculated=0;
				original=input;
				while(original>0) {
					remainder= original%10;
					original=original/10;
					calculated=calculated+remainder*remainder*remainder;
					
	}
					 if(calculated==input) 
						 System.out.println("Armstrong number");
						 else 
							 System.out.println("Not an Armstrong");
				}
				}	


	