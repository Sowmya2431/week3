package week3.day1;

public class Automation extends MultipleLanguage implements TestTool,Language{

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java got implemented");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium got implemented");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby got implemented");
	}
	
	public static void main(String[] args) {
		
		Automation obj= new Automation();
		obj.java();
		obj.Selenium();
		obj.ruby();
		obj.python();
		
	}
}
	