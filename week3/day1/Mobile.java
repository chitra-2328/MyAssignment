package week3.day1;

public class Mobile {

	    public void sendMgs() {
			System.out.println("SendMgs");
			
		}
		public void makeCall() {
			System.out.println("Make call");
		}
		public void saveContact() {
			System.out.println("saveContact");
		
		}
		public static void main(String[] args) {
			Mobile function=new Mobile();
			function.sendMgs();
			function.saveContact();
			function.makeCall();
	}


	}


