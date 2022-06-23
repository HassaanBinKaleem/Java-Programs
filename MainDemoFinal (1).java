//use of final keyword
class A{
	final int i=10;//Declare Constant
	 void show()
	{
		System.out.print("As show");
	}
}
class B extends A{
	void show()
	{
		System.out.print("Bs show");
	}
}
class MainDemoFinal
{
	public static void main(String[] arg)
	{
		A aa=new A();
		B bb=new B();
		System.out.print(bb.i);
		bb.i=20;
		aa.show();
		bb.show();
	}
}