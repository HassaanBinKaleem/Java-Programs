//Inheritance
//Parent class/ super class
//child class / subclass
class A{
	int i;
	int j;
	/***A(){
		i=10;
		j=20;
	}***************/
	void show()
	{
		System.out.println("i="+ i + " j="+ j);
	}
	int sum(){
		return i + j;
	}
}
class B extends A
{
	int k;
	B()
	{
		k=100;
	}
	void showk()
	{
		show();
		System.out.println("k=" + k);
	}
	int sumk(){
		return i + j + k;
	}
}
class MainDemoInheritanceConstructor{
	public static void main(String[] arg)
	{
		A objA = new A();
		B objB = new B();
		objA.show();
		objB.showk();
		objA.i=10;
		objA.j=20;
		objA.show();
		objB.i=60;
		objB.j=70;
		objB.k=80;
		//objB.show();
		objB.showk();
		int ansA=objA.sum();
		int ansB=objB.sumk();
		System.out.println("ansA="+ ansA);		
		System.out.println("ansB="+ ansB);		
		
	}


}