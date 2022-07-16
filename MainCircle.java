class Circle
{
	private float r;
	Circle(float radius)
	{
		r=radius;
	}
	public void setRadius(float a)
	{
		r=a;
	}
	public float getRadius()
	{
		return r;
	}
	float getCircumference()
	{
		float c;
		c=2*3.14f*r;
		return c;
	}
	float getArea()
	{
		float a;
		a=3.14f*r*r;
		return a;
	}
}
public class MainCircle
{
	public static void main(String args[])
	{
		Circle obj = new Circle(90.99f);
		obj.setRadius(34.56f);
		System.out.println("The Value of Radius is: "+obj.getRadius());
		System.out.println("The Circumference of Circle is: "+obj.getCircumference());
		System.out.println("The Area of Circle is: "+obj.getArea());
	}
}