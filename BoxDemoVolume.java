class Box {
	double width;
	double height;
	double depth;
/*	void volume(){
		System.out.println(width * height * depth);
	}***/
	double volume(){
		double ans;
		ans = width * height * depth;
		return ans;  // return width * height * depth;
	}
}
// This class declares an object of type Box.
class BoxDemoVolume {
	public static void main(String args[]) {
		Box mybox = new Box();
//		double vol;
// assign values to mybox's instance variables
		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;
// compute volume of box
		vol=mybox.volume();
//		vol = mybox.width * mybox.height * mybox.depth;
//		System.out.println("Volume is " + mybox.volume());
	}
}
