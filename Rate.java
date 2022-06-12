import java.util.Scanner;
public class Rate
{
    public static void main(String args[])
    {
        float PM,PW,TL,LM,LW,TP,ILM,ILW;
                                                    //PM= TP*52/100;
	                                                //PW= TP-PM;
	                                                //TL= TP*48/100;
	                                                //LM= TP*35/100;
	                                                //LW= TP*13/100;
	                                                //ILM= PM-LM;
	                                                //ILW= PW-LW;
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Total Population(TP): ");
        TP=scan.nextInt();

        //Calculate The Percentage of Men;
	    PM=TP*52/100;
        System.out.print("\nThe Percentage of Men: "+PM);

        //Calculate The Percentage of Total Literacy;
	    TL=TP*48/100;
        System.out.print("\nThe Percentage of Total Literacy: "+TL);

        //Calculate The Percentage of Women;
	    PW=TP-PM;
        System.out.print("\nThe Percentage of Women: "+PW);

        //Calculate The Literate Men;
	    LM=TP*35/100;
        System.out.print("\nThe Litrate Men: "+LM);

        //Calculate The Literate Women;
	    LW=TP*13/100;
        System.out.print("\nThe Literate Women: "+LW);

        //Calculate Illiterate Men;
	    ILM=PM-LM;
        System.out.print("\nThe Illiterate Men: "+ILM);

        //Calculate Illiterate Women;
	    ILW=PW-LW;
        System.out.print("\nThe Illiterate Women: "+ILW);
    }
}