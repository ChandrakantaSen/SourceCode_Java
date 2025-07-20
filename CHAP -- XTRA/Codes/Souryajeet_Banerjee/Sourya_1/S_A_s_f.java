import java.io.*;
public class S_A_s_f
{   
    public static void main(String args[]) throws IOException
    {
       BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("   Sridhara  Acharyya's  formula.");
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.print(" a = ");
       int a=Integer.parseInt(obj.readLine());
       System.out.print(" b = ");
       int b=Integer.parseInt(obj.readLine());
       System.out.print(" c = ");
       int c=Integer.parseInt(obj.readLine());
       double d =(b*b)-(4*a*c);
       System.out.println(" d ="+d);
       double yxz =(Math.sqrt(-d));
       double yxs =(Math.sqrt(d));
       System.out.println("  ="+yxz+","+yxs);
       double yx = ((-b-(Math.sqrt(-d))));
       double jj = ((-b+(Math.sqrt(-d))));
       System.out.println("  ="+yx+","+jj);
       double bx = ((-b-(Math.sqrt(d))));
       double bj = ((-b+(Math.sqrt(d))));
       System.out.println("  ="+bx+","+bj);
       double y = ((-b-(Math.sqrt(-d)))/(2*a));
       double x = ((-b+(Math.sqrt(-d)))/(2*a));
       System.out.println();
       System.out.println(" x =(-b+((b^2-4ac)^(1/2))/2a)or(-b-((b^2-4ac)^(1/2))/2a)");
       System.out.println();
       System.out.println();
       System.out.println(" x ="+y+","+x);
       double j = ((-b+(Math.sqrt(d)))/(2*a));
       double k = ((-b-(Math.sqrt(d)))/(2*a));
       System.out.println(" x ="+j+","+k);
    }
}