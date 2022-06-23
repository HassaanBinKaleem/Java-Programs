class A{
	int i,j;
	void show()
	{
		System.out.println("As Show");
	}	
}
class B extends A{
	int k;
	void show()
	{
		System.out.println("Bs Show");
	}	
}
class C extends A{
	void show()
	{
		System.out.println("Cs Show");
	}	
}
class MainDemoPoly
{
	public static void main(String[] arg)
	{
		A aa=new A();
		B bb=new B();
		C cc=new C();
		aa.show();
		bb.show();
		cc.show();
		A ref;
		ref=new A();
		ref.show();

		ref=new B();//ref=bb;
		ref.show();
System.out.print("ref.i:"+ref.i+"ref.j:"+ref.j+"ref.k:"+ref.k);
		ref=new C();
		ref.show();







	}

}

