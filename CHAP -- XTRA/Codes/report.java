import java.io.*;
class report
{
public static void main(String args[])throws IOException
{
int m,p,c,b,h;
double k=0,q=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter five marks in corresponding five subjects:");
m=Integer.parseInt(br.readLine());
p=Integer.parseInt(br.readLine());
c=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
h=Integer.parseInt(br.readLine());
k=m+p+c+b+h;
System.out.println("the total is"+k);
q=k/5.0;
System.out.println("the average is"+q);
if(q>90)
{
System.out.println("Your grade is A");
    }
else if(q<=90&&q>80)
{
System.out.println("Your grade is B");
    }
else if(q<=80&&q>60)
{
System.out.println("Your grade is C");
    }
else if(q<=60&&q>50)
{
System.out.println("Your grade is D");
    }
else if(q<=50&&q>40)
{
System.out.println("Your grade is E");
    }
else
{
System.out.println("FAIL");
    }
}
    }