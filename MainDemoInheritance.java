class A
{
	int i;
	int j;
	A()
	{
		i=10;
		j=20;
	}
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
	int sum(){
		return i+j;
	}
}
class B extends A{
	int i;
	B()
	{
		super(100);			
		i=5000;
		
	}
	void show()
	{
		super.show();
		System.out.println("i:"+ i);
	}
	int sum(){
		return super.sum()+i;
	}
	

}
class MainDemoInheritance
{
	public static void main(String[] arg)
	{
		B objB=new B();
		objB.show();

System.out.println("objB.i:"+ objB.i+ " objB.j:"+ objB.j + " objB.k:"+ objB.i);				
System.out.println("Sum=" + objB.sum());	
		

	}
}