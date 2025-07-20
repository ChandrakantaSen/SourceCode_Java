import java.io.*;
class prime
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,a,j,c=0;
System.out.println("************************************************** ");
System.out.println("the prime from5 to 500 is as follows :- ");
for(j=5;j<=500;j++)
{
c=0;
for(i=0;i<=j;i++)
{
if(i%j==0)
{
c++;
    }
}
if(c==2)
{
System.out.println(i);
    }
}
}
    }
    