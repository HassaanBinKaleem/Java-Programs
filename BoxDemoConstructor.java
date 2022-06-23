class Box {
	double width;
	double height;
	double depth;
	Box(double w, double h, double d)//formal parameters
	{
		System.out.println("Constructor is calling");
		width	= w;
		height 	= h;
		depth 	= d;
	}
}
class BoxDemoConstructor {
	public static void main(String args[]) {
		Box mybox1 = new Box(1,2,3);//actual parameters
System.out.println(mybox1.width + "\n" + mybox1.height + "\n"+ mybox1.depth);
		Box mybox2 = new Box(2.5, 3.6, 9.4);
System.out.println(mybox2.width + "\n" + mybox2.height + "\n"+ mybox2.depth);
		

}
}