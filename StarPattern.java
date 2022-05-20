import java.util.Scanner;
public class StarPattern
{
    public static void main(String args[])
    {
        int rows,i,j;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Numbers of Rows: ");
        rows=scan.nextInt();

        for(i=1;i<=rows;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}