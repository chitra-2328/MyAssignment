package OrgSystem;

public class Desktop extends Computer {
 public void desktopSize() {
	 System.out.println("Size of the computer: 50 inches");
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop size= new Desktop();
		size.desktopSize();
        size.computerModel();
	}

}
