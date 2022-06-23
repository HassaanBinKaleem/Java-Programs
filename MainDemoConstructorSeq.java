class A
{
	int i,j;
/***	A()
	{
		i=10;
		j=20;
	}****/
	A(int c)
	{
		i=j=c;
	}
	A(int x, int y)
	{
		i=x;
		j=y;
	}
	void show()
	{
		System.out.println("i:"+ i+ " j:"+ j);
	}	
	int sum()
	{
		return i+j;
	}

}
//Encapsulation
class B extends A
{
	int i;
	B()
	{
	   super(2000);	
	   i=3000;
	}
	void show()
	{
		super.show();		
		System.out.println("i:"+ i);
	}	
	int sum()
	{
		return super.sum()+i;
	}
}
class MainDemoConstructorSeq
{
	public static void main(String[] arg)
	{
		B bb= new B();
		System.out.println("bb.i:"+bb.i+"bb.j:"+bb.j+"bb.i:"+bb.i);
		bb.show();
		System.out.print("bb.sum():"+ bb.sum());
	}
}