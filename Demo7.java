/*7) Define class "Parent1" with some data.
Define interface "Parent2" with some data.
Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members*/


class Parent1
{
	int a = 9;
	void disp1() 
	{
		System.out.println("in disp1 of Parent1");
	}
}
interface Parent2
{
	int b =7;
	void disp2();
}

class Child extends Parent1 implements Parent2
{
	void disp1()
	{
		System.out.println("in disp1 of child class");
	}
public void disp2() 
	{
		System.out.println("in disp2 method of class child");
	}
}
public class Demo7
{
	public static void main(String[] args)
	{
		Child ref = new Child();
		ref.disp1();
		ref.disp2();
	}
}


