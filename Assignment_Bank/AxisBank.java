package Assignment_Bank;

public class AxisBank extends BankInfo {
	public void deposit()
	{
		System.out.println("Deposit Amount: 15000");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank override = new AxisBank();
        override.deposit();
        override.saving();
        override.fixed();
	}

}
