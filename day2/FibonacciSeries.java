package week1.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
	int range=8;
	int firstnum=0;
	int secondnum=1;
	int sum;
		System.out.println("Fibonacci Series is:");
		System.out.println(+firstnum);
		System.out.println(+secondnum);
		for(int i=2;i<range;i++) {
			sum=firstnum+secondnum;// sum=0+1=1 
			firstnum=secondnum;//0=1
		    secondnum=sum;//1=1
			System.out.println(+sum);
			
		
		}

	}

}
