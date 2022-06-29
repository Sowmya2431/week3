package week3.day1;

public class Student2 extends Student1
{
	public void getStudentInfo(String email,long phonenumber) 
	{
		System.out.println("Email: " + email + " Mob: " + phonenumber);
		
	}
	
	
	public static void main(String[] args) 
	{
		Students info = new Students();
		info.getStudentInfo(1);
		
		
		Student1 info1 = new Student1();
		info1.getStudentInfo(("Sowmya "),1);
		
		Student2 info2 = new Student2();
		info2.getStudentInfo(("sowmyamurugesan@gmail.com"), 1234567891L);
		
		
	}
}
