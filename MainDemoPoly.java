class A
{
    int i,j;
    void show()
    {
        System.out.print("Memory allocated to i & j in parent class"+"\n");
    }
}

class B extends A
{
    int k;
    void show()
    {
        System.out.print("Memory allocated to K from child class along with i & j from parent class"+"\n");
    }
}

class C extends A
{
    int l;
    void show()
    {
        System.out.print("Memory allocated to l from child class along with i & j from parent class"+"\n");
    }
}

class MainDemoPoly
{
    public static void main(String args[])
    {
        A aa=new A();
        B bb=new B();
        C cc=new C();
        
        aa.show();
        bb.show();
        cc.show();

        A ref;
        ref=new B();
        ref.show();
    }
}