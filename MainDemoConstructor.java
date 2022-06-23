class Box
{
	double width;
	double height;
	double depth;
	Box(double w, double h,double d)
	{
		width = w;
		height = h;
		depth = d;
	}
	Box(double c)
	{
		width= height= depth=c;
	}
	Box(int i){
		System.out.println("int constructor is calling");
		width= height= depth=i;
	}
	Box(){
		width = -1;
		height = -1;
		depth = -1;
	}
}

class MainDemoConstructor
{
	public static void main(String[] arg){
		Box obj1= new Box(19);
		Box obj2= new Box(1.5,2.87,3.76);
		Box obj3= new Box();		
		System.out.println((int)obj1.width+ "\t" + (int)obj1.height+ "\t" + (int)obj1.depth);
		System.out.println(obj2.width+ "\t" + obj2.height+ "\t" + obj2.depth);
		System.out.println(obj3.width+ "\t" + obj3.height+ "\t" + obj3.depth);
	}

}