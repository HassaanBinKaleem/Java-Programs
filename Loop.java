import java.util.Scanner;
public class Loop
/*{
    public static void main(String args[])
    {                                                     //Program # 1 --- While Loop;  
        int i,j,rows;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the numbers of Rows: ");
        rows=scan.nextInt();

        i=1;
        while(i<=rows)
        {
            j=1;
            while(j<=i)
            {
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}*/

/*{
    public static void main(String args[])
    {                                                    //Program # 2 --- While Loop; 
        int i,j,rows,space;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the numbers of Rows: ");
        rows=scan.nextInt();

        i=1;
        while(i<=rows)
        {
            space=1;
            while(space<=(rows-i))
            {
                System.out.print(" ");
                space++;
            }
            j=1;
            while(j<=i)
            {
                System.out.print("* ");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}*/

/*{
    public static void main(String args[])
    {                                                             //Program # 3 --- While Loop; 
        int i,j,rows,space,n=1;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the numbers of Rows: ");
        rows=scan.nextInt();

        i=1;
        while(i<=rows)
        {
            space=1;
            while(space<=(rows-i))
            {
                System.out.print(" ");
                space++;
            }
            j=1;
            while(j<=i)
            {
                System.out.print(n+" ");
                n++;
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}*/

/*{
    public static void main(String args[])
    {                                                    //Program # 1 --- For Loop;
        int i,j,rows,colums,space;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the numbers of Rows: ");
        rows=scan.nextInt();
        System.out.print("Enter the Number of Colums: ");
        colums=scan.nextInt();
        
        for(i=1;i<=rows;i++)
        {
            for(j=1;j<=colums;j++)
            {
                if(i>1 && i<rows && j>1 && j<colums)
                {
                    for(space=1;space<=(colums-2);space++)
                    {
                        System.out.print(" ");
                    }
                    j=j+(colums-2);
                }
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}*/

/*{
    public static void main(String args[])
    {                                                       //Program # 2 --- For Loop;
        int i,n,sum=0;
        float avg=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Natural Numbers: ");
        n=scan.nextInt();

        for(i=1;i<=n;i++)
        {
            System.out.println(i);
            sum=sum+i;
           avg=sum/n;
        }
        System.out.print("Sum: "+sum+"\nAverage: "+avg);
    }
}*/

/*{
    public static void main(String args[])
    {                                                       //Program # 3 --- For Loop;
        int num,i;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Natural Numbers: ");
        num=scan.nextInt();
        {
            for(i=1;i<=num;i++)
            {
                if(i%2==0)
                {
                    System.out.println(i+" Even");   
                }
                else
                {
                    System.out.println(i+" Odd");
                }
            }
        }
    }
}*/

/*{
    public static void main(String args[])
    {                                                    //Program # 1 --- Do While Loop;
        int num,i;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Natural Numbers: ");
        num=scan.nextInt();

        i=1;
        do
        {
            System.out.println(i);
            i++;
        }
        while(i<=num);
    }
}*/

/*{
    public static void main(String args[])
    {                                                      //Program # 2 --- Do While Loop;
        int num,i,sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Natural Numbers: ");
        num=scan.nextInt();

        i=1;
        do
        {
            System.out.print(i+"\n");
            sum=sum+i;
            i++;
        }
        while(i<=num);
        System.out.print("Sum: "+sum);
    }
}*/

/*{
    public static void main(String args[])
    {                                                           //Program # 3 --- Do While Loop;
        int i,j,rows;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the numbers of Rows: ");
        rows=scan.nextInt();

        i=1;
        do
        {
            j=1;
            do
            {
                System.out.print("*");
                j++;
            }
            while(j<=i);
            i++;
            System.out.print("\n");
        }
        while(i<=rows);
    }
}*/