import java .io.*;
class marks 
{
public static void main (String args[]) throws IOException
{
int a,b,c,d,e,tot;
double avgs;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the 1st no.");
a=Integer.parseInt (br.readLine());
System.out.println ("Enter the 2nd no.");
b=Integer.parseInt (br.readLine());
System.out.println ("Enter the 3rd no.");
c=Integer.parseInt (br.readLine());
System.out.println ("Enter the 4th no.");
d=Integer.parseInt (br.readLine());
System.out.println ("Enter the 5th no.");
e=Integer.parseInt (br.readLine());
tot=a+b+c+d+e;
System.out.println ("Enter the sum of the no. is " +tot);
avgs=tot/5;
System.out.println ("the average of the given  numbers are"+avgs);
if (avgs>=90)
{
System.out.println ("The grade is A");
    }
else if ((avgs>=80)&& (avgs<90))
{
System.out.println ("The grade is B");
    }
    else if ((avgs<80)&&(avgs>70))
{
System.out.println ("The grade is C");
    }
    else if ((avgs<70)&&(avgs>60))
{
System.out.println ("The grade is D");
    }
    else if ((avgs<60)&&(avgs>50))
{
System.out.println ("The grade is E");
    }
    else if ((avgs<50)&&(avgs>40))
{
System.out.println ("The grade is F");
    }
    else
    {
        System.out.println ("The sorry you have failed");
    }
}
    }
    
    
    
    
    