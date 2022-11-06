package week1.day1;

public class TwoWheeler {

	private static final boolean No = false;
	public int noOfWheels=4;
	public short noOfMirrors=2;
	public long chassisNumber=254255589L;
	public boolean isPunctured=No;
	public String bikeName= "Yamaha R15";
	public double runningKM= 245.255;
	
	//Create Object for Twowheeler and call variable from main method 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler bike= new TwoWheeler();
		System.out.println(bike.noOfWheels);
		System.out.println(bike.noOfMirrors);
        System.out.println(bike.chassisNumber);
        System.out.println(bike.isPunctured);
        System.out.println(bike.bikeName);
        System.out.println(bike.runningKM);
	}

}
