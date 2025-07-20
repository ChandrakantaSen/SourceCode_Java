import java.io.*;
class fibo_recursive
{
static int fibo(int i)
{ 
if(i==1 || i==2)
return 1;
else
return (fibo(i-1)+fibo(i-2));
    }
    public static void main( String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
   System.out.println("enter the limit  of fibonacci series is to be found");
   int m=Integer.parseInt(br.readLine());
   int d=0;
   for(int j=1;j<=m;j++)
   {
   d=fibo(j);
   System.out.println(d);
}}
    }
