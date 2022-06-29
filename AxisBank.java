package week3.day1;

public class AxisBank extends BankInfo {

	public void deposit() 
	{
		System.out.println("Over Riding method");

	}
	
	public static void main(String[] args) 
	{
		BankInfo obj = new BankInfo();
		obj.saving();
		obj.fixed();
		obj.deposit();
		
		AxisBank obj1 = new AxisBank();
		obj1.deposit();
		
	}
}
