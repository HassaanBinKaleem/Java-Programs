//Method Overriding
//Method Signature=Method Name +Parameters(Numaber of Parameter/Type of Parameters/Position of Parameters)
abstract class Figure
{
	double dim1;
	double dim2;
	Figure(double x,double y)
	{
		dim1=x;
		dim2=y;
	}	
	abstract double area();
}
class Triangle extends Figure
{
	Triangle(double x, double y)
	{
		super(x,y);
	}
	double area()//Over-ridded Method
	{
		return 1.0/2.0 * dim1 * dim2;	
	}
}
class Square extends Figure
{
	Square(double x,double y)
	{
		super(x,y);
	}
	double area()//Over-ridded Method
	{
		return  dim1 * dim2;	
	}
}

class MainDemoAbstract
{
	public static void main(String[] arg)
	{
		Figure f;
		Triangle t= new Triangle(2.3,4.5);
		Square s= new Square(10,20);
		f = t;//f= new Triangle(2,3);
		
		double at=f.area();
		System.out.println("at:"+ at);
		f = new Square(200,3);
		double as=f.area();		
		System.out.println("as:"+ as);
	}

}




