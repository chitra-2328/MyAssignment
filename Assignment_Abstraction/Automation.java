package Assignment_Abstraction;

public class Automation extends MultipleLanguage {
	public void Java()
	{
		System.out.println("Learn Java");
	}
	public void Selenium() {
		System.out.println("Learn Selenium");
	}
	public void python() {
		 System.out.println("Learn Python");
	}
	public void ruby() {
		System.out.println("Learn Ruby");
	}

	public static void main(String[] args) {
	Automation auto = new Automation();
	auto.Java();
	auto.Selenium();
	auto.python();
	auto.ruby();

	}

}
