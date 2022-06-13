class Human
{
    double weight;
    double height;

    void running()
    {
        System.out.print("Running"+"\n");
    }

    void eating()
    {
        System.out.print("Eating"+"\n");
    }
}

class MainDemo
{
    public static void main(String args[])
    {
        Human h=new Human();
        Human m=new Human();
        h.weight=120;
        h.height=5.5;

        m.weight=70;
        m.height=6.5;

        h.running();
        m.running();

        h.eating();
        m.eating();
    }
}