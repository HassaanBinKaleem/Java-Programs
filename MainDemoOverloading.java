class OverloadedClass
{
	int myPower()
	{
		return 2*2;
	}
	double myPower(double n)
	{
		return n*n;
	}
	int myPower(int n)
	{
		System.out.println("int version");
		return n*n;
	}

	double myPower(double n, int p)
	{
		double pow=1;
		for(int i=1;i<=p;i++)
		{
			pow = pow * n;
		}
		return pow;
	}
}
class MainDemoOverloading{
	public static void main(String[] arg)
	{
		OverloadedClass obj= new OverloadedClass();
		int ans1=obj.myPower();				
		System.out.println("ans1=obj.myPower():"+ ans1);
		double ans2=obj.myPower(5);
		System.out.println("ans2=obj.myPower(5):"+ ans2);
		double ans4=obj.myPower(5.5);
		System.out.println("ans4=obj.myPower(5.5)"+ ans4);
		double ans3=obj.myPower(2,4);
		System.out.println("ans3=obj.myPower(2,4):"+ ans3);
	}

}


