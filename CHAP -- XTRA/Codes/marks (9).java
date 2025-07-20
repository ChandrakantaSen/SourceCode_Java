import java.io.*;
class marks
{
     public static void main(String args[])throws IOException
    {
        int m,p,ch,co,b,tot;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\n Enter the marks for mathematics ");
        m=Integer.parseInt(br.readLine());
        System.out.print("\n Enter the marks for physics ");
        p=Integer.parseInt(br.readLine());
        System.out.print("\n Enter the marks for chemistry ");
        ch=Integer.parseInt(br.readLine());
        System.out.print("\n Enter the marks for computer ");
        co=Integer.parseInt(br.readLine());
        System.out.print("\n Enter the marks for biology ");
        b=Integer.parseInt(br.readLine());
        tot=m+p+ch+co+b;
        System.out.println("Total marks = "+tot);
        double avg=tot/5;
        System.out.println("Average = "+avg);
    }
}