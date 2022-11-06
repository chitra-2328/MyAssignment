package week1.day1;

public class Mobile1 {
	public String mobileBrandName="Oneplus";
	char mobileLogo='1';
	short noOfMobilePiece=2;
	int modelNumber=2328;
	long mobileImeiNumber=254000542566L;
	float mobilePrice=231523;
	boolean isDamaged=true;
	
	//Create Object for Mobile1 and call variable from main method 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile1 myMobile =new Mobile1();
        System.out.println(myMobile.mobileBrandName);
        System.out.println(myMobile.mobileLogo);
        System.out.println(myMobile.noOfMobilePiece);
        System.out.println(myMobile.modelNumber);
        System.out.println(myMobile.mobileImeiNumber);
        System.out.println(myMobile.mobilePrice);
        System.out.println(myMobile.isDamaged);
        
	}

}
