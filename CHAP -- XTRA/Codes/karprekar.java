import java.io.*;
class karprekar   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m,l,c=0;
double a,b,s;
System.out.println("Enter the number to check wheather the number is karprekar or not : -");
n=Integer.parseInt(br.readLine());
m=n;
while(m>0)
{
c++;
m=m/10;
    }
    l=n*n;
   a=l/(Math.pow(10,c));
    b=l%(Math.pow(10,c));
    s=a+b;
    if((int)(s)==n)
    {
        System.out.println("karprekar");
    }
    else
    {
        System.out.println("Not");
    }
}
    }