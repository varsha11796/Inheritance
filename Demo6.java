/*6) Define interface "A" with "disp1()" method.
Derive from "A", interface "B" with "disp2" method.
Derive class "C" , from "B".
Instantiate class "C" and call its members as well as derived from parent interfaces.*/

interface A
{
	void displ();
}
interface B extends A
{
	void disp2();
}
class C implements B
{
	public void displ()
	{
		System.out.println("in disp1 of class C");
	}

	public void disp2() 
	{
		System.out.println("in disp2  of class C");
	}
}
public class Demo6 {
	public static void main(String[] args)
	{
		C ref = new C();
		ref.displ();
		ref.disp2();
	}
}
