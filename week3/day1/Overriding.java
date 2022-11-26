package week3.day1;

public class Overriding {
        public void add(int a, int b ) {
        	System.out.println(a+b);
        }
        public void add(int a, int b, int c ) {
        	System.out.println(a+b+c);
        }
        public void sub(double a, double b ) {
        	System.out.println(a-b);
        }
        public void sub(int a, int b ) {
        	System.out.println(a-b);
        }
        public void mul(int a, double b ) {
        	System.out.println(a*b);
        }
        public void mul(double a, double b ) {
        	System.out.println(a*b);
        }
	public static void main(String[] args) {
		Overriding calculation=new Overriding();
		calculation.add(1, 2);
		calculation.add(2, 1, 3);
		calculation.sub(40.5, 30.2);
		calculation.sub(40, 20);
		calculation.mul(23.3, 12.2);
		calculation.mul(12, 11.5);
	
	}

}
