import java.io.*;
class grade
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
        if(avg>=90)
        {
        System.out.println("Grade    A ");
    }
    else if((avg>=80)&&(avg<90))
    {
        System.out.println("Grade    B ");
    }
    else if((avg>=70)&&(avg<80))
    {
        System.out.println("Grade    C ");
    }
    else if((avg>=60)&&(avg<70))
    {
        System.out.println("Grade    D ");
    }
    else if((avg>=50)&&(avg<60))
    {
        System.out.println("Grade    E ");
    }
    else if((avg>=40)&&(avg<50))
    {
        System.out.println("Grade    F ");
    }
    else
    {
        System.out.println("FAILED");
    }
}
    }
    
        
    
