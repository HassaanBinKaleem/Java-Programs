class A
{
	final int i=10;
	void show()
	{
		System.out.println("As show");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("Bs show");
	}
}
class MainDemoFinal
{
	public static void main(String[] arg)
	{
		A aa=new A();
		B bb=new B();
		System.out.println("aa.i:"+ aa.i);
		System.out.println("bb.i:"+ bb.i);
		bb.i=200;
		aa.show();
		bb.show();
	}
}