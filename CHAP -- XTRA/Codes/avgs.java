import java.io.*;
class avgs
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int M,C,B,H,E,TOTAL;
double avgs;
System.out.println("Enter any no.");
M=Integer.parseInt(br.readLine());
System.out.println("Enter any no.");
C=Integer.parseInt(br.readLine());
System.out.println("Enter any no.");
B=Integer.parseInt(br.readLine());
System.out.println("Enter any no.");
H=Integer.parseInt(br.readLine());
System.out.println("Enter any no.");
E=Integer.parseInt(br.readLine());
TOTAL=M+B+C+H+E;
avgs=TOTAL/5;
if(avgs>=90)
{
System.out.println("The grade is A");
    }
    else if((avgs>=80)&&(avgs<90))
    {
    System.out.println("The grade is B");
}
else if((avgs>=70)&&(avgs<80))
{
System.out.println("The grade is C");
    }
    else if((avgs>=60)&&(avgs<70))
{
System.out.println("The grade is D");
    }
    else if((avgs>=50)&&(avgs<60))
{
System.out.println("The grade is E");
    }
    else if((avgs>=40)&&(avgs<50))
    {
        System.out.println("The grade is G");
    }
    else
    {
        System.out.println("The grade is FAIL");
    }
}
    }

