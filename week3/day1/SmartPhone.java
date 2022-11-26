package week3.day1;

public class SmartPhone extends AndroidPhone {

	public void connectWhatsApp() {
		System.out.println("connectWhatsApp");
		
	}
	public void takeVideo() {
		System.out.println("Taking video from smartphone");
	}
	public static void main(String[] args) {
		SmartPhone function=new SmartPhone();
		function.connectWhatsApp();
        function.saveContact();
        function.sendMgs();
        function.makeCall();
        function.takeVideo();

	}

}
