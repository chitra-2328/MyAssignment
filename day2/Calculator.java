package week1.day2;

public class Calculator {
	
	public int add(int num1,int num2,int num3) 
	{
		int result=num1+num2+num3;
		System.out.println(result);
return result;	
	}
	public int sub(int num1,int num2) 
	{
		int result=num1-num2;
		System.out.println(result);
return result;	
	}
	public double mul(double num1,double num2) 
	{
		double result=num1*num2;
		System.out.println(result);
return result;	
	}
	public float divide(float num1,float num2) 
	{
		float result=num1/num2;
		System.out.println(result);
return result;	
	}
	public static void main(String[] args) {
	Calculator total=new Calculator();
    total.add(10, 20, 30);//60
    total.sub(20, 10);//10
    total.mul(25.55, 20.20);//516.11
    total.divide(50, 10); //5.0

	}

}
