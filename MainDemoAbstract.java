abstract class Figure
{
	double dim1;
	double dim2;
	Figure(double x, double y)
	{
		dim1=x;
		dim2=y;
	}
	abstract double area();
/***	{
		System.out.print("No area calculated");
		return 0;
	}****/
}
class Triangle extends Figure
{
	Triangle(double x, double y)
	{
		super(x,y);
	}	
	double area()
	{
		return 1.0/2.0 * dim1 * dim2;
	}
}
class Square extends Figure
{
	Square(double x, double y)
	{
		super(x,y);
	}
	double area()
	{
		return dim1 * dim2;
	}
}
class MainDemoAbstract
{
	public static void main(String[] arg)
	{
		Figure ff;//= new Figure(2,3);
		Triangle tt= new Triangle(10,20);
		Square ss= new Square(200,3);
		//double af=ff.area();
		double at=tt.area();
		double as=ss.area();
		//System.out.println("Figure area:"+ af);
		System.out.println("Triangle area:"+ at);
		System.out.println("Square area:"+ as);
		ff = tt;
		System.out.println("Triangle area:"+ ff.area());
		ff = new Square(1000,4);
		System.out.println("Square area:"+ ff.area());

		

	}
}
