import java.io.*;
class perfect_square
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m;
double a;
System.out.println("Enter a number to check whether it is a perfect square or not");
n=Integer.parseInt(br.readLine());
m=n;
a=Math.sqrt(m);
if((((int)(a))*((int)(a)))==n)
{
System.out.println(n+"is a perfect square");
    }
else
{
m=n;
do
{
a=Math.sqrt(m);
m++;
    }
    while(((int)(a)*((int)(a)))!=n);
    System.out.println("The next perfect square number "+((int)(a)*((int)(a))));
}
    }
}