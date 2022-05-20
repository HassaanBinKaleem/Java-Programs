import java.util.Scanner;
public class MainStar
{
    public static void main(String args[])
    {
        int i,j,rows;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Numbers of Rows: ");
        rows=scan.nextInt();

        for(i=1;i<=rows;i++)
        {
            for(j=1;j<=rows;j++)
            {
                if(i==1 || i==rows || j==1 || j==rows || i==j || j==rows-i+1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }   
}
