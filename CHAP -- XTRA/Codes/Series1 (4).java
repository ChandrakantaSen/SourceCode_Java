import java.io.*;
class Series1
{
public static void main(String args[])throws IOException
{
int i,n,m,s,s1=0,j;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
for(i=1;i<=100;i++)
{
s=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
    {
    s++;
}
    }
    if(s==2)
    {
        s1=s1+i;
    }
}
System.out.println("The sum of the series upto 1 to 100 is : -" +s1);
    }
}