/*8) Define a class "base1" with only parameterized constructor.
Derive a class "sub1" from "base1". This class should have following constructors
	a) Default
	b) one parameter
	c) two parameter
Now try to instantiate "sub1" , using any of the above mentioned constructors.*/

class Base1
{
	int k=10;
	Base1(int k)
	{
		System.out.println(k);
	}
}
class Sub1 extends Base1
{
	int l,m;
	Sub1()
	{
		super(100);
		System.out.println("in default");
	}
	Sub1(int l)
	{
		super(200);
		System.out.println("in oneparameterized"+l);
	}
	Sub1(int l,int m)
	{
		super(300);
		System.out.println("in two parameterized"+l+" "+m);
	}
}
public class Demo8 
{
	public static void main(String args[])
	{
	Sub1 s1=new Sub1();
	Sub1 s2=new Sub1(2);
	Sub1 s3=new Sub1(15,25);
	}
}
