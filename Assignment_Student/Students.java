package Assignment_Student;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Id is:" + id);
	}
   public void getStudentInfo(int id, String name)
   {
	   System.out.println("Id is:"+ id);
	   System.out.println("Name:"+ name);
   }
   public void getStudentInfo(long phonenumber, String email ) {
	   System.out.println("PhoneNumber:"+phonenumber);
	   System.out.println("Email:"+email);
	   
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students details = new Students();
		details.getStudentInfo(23);
		details.getStudentInfo(23, "Chitra");
		details.getStudentInfo(9283384448L, "chitralearn23@gmail.com");

	}

}
