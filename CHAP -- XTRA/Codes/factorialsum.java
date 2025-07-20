import java.io.*;
class factorialsum
{
public static void main(String args[])throws IOException
{
int j,fact,i,d,s=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
for(i=1;i<=10;i++)
{
fact=1;
for(j=1;i<=i;j++)
{
fact=fact*j;
    }
    s=s+fact;
}
System.out.println("The sum of all the factorials upto 1 to 10 is "+s);
}
    }
    
    