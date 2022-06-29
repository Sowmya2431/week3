package org.system;

public class Desktop extends Computer{

	public void desktopsize()
	{
		System.out.println("Desktop size is 7 inch");
	}
	public void method1() {
		desktopsize();
		super.computerModel();
	}
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.method1();
}
}