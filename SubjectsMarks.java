import java.util.Scanner;
public class SubjectsMarks
{
   public static void main(String args[])
   {
       int oop,dld,ict,calculus,physics;
       float aggregateMarks,percentage;
       Scanner scan= new Scanner(System.in);
       System.out.print("Enter Numbers of Object Oriented Programming: ");
       oop=scan.nextInt();
       System.out.print("Enter Numbers of Digital Logic Design: ");
       dld=scan.nextInt();
       System.out.print("Enter Numbers of ICT: ");
       ict=scan.nextInt();
       System.out.print("Enter Numbers of Caclulus: ");
       calculus=scan.nextInt();
       System.out.print("Enter Numbers of Physics: ");
       physics=scan.nextInt();

       aggregateMarks= oop+dld+ict+calculus+physics;
       System.out.println("Aggregate Marks: "+aggregateMarks);
 
       percentage= aggregateMarks/5;
       System.out.println("Percentage: "+percentage); 
       
       if(percentage>=60)
       {
           System.out.println("PASS");
       }
       else
       {
           System.out.println("FAIL");
       }
   }


}