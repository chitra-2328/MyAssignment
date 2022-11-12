package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		// Declare your input as 5
		int input=5;
		// Declare an integer variable fact as 1
		int fact=1;
		// Iterate from 1 to your input 
       for(int i=input;i>=1;i--) {
			fact=fact*i;
       }
       System.out.println(fact);
       
			
		}
	}


