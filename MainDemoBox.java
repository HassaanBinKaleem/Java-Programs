class Box
{
    double width;
    double height;
    double depth;
}
// This class declares an object of type Box;

class MainDemoBox
{
    public static void main(String args[])
    {
        Box mybox;
        mybox=new Box();
        double volume;
        // Assigns values to mybox's instance variable;
        mybox.width=10;
        mybox.height=20;
        mybox.depth=15;
        System.out.print("Width: "+ mybox.width+"\n");
        System.out.print("Height: "+mybox.height+"\n");
        System.out.print("Depth: "+mybox.depth+"\n");
        // Compute volume of Box;
        volume= mybox.width*mybox.height* mybox.depth;
        System.out.print("Volume: "+volume+"\n");
    }
}