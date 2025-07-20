import java.io.*; 
class maxmin
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,max,min;
System.out.println("Enter the first number : - ");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the second number : - ");
b=Integer.parseInt(br.readLine());
if(a>b)
{
 System.out.println("max is "+a+" and min is : - "+b);
}
 else
 {
 System.out.println("max is "+b+" and min is : - "+a);
}
}
}