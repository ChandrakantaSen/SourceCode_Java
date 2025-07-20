import java.io.*;
public class market
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,c; double x,y;
System.out.println("Enter the product code:-");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the quantity of items purchased:-");
b=Integer.parseInt(br.readLine());
System.out.println("Enter the price of each items:-");
c=Integer.parseInt(br.readLine());
x=b*c;
System.out.println("The total cost is:-"+x);
if(x>=100&&x<500)
{
System.out.println("gift to be given to the customer is:-A KEY RING");
}
else if(x>=500&&x<1000)
{
System.out.println("gift to be given to the customer is:-A LEATHER PURSE");
}
else
{
System.out.println("gift to be given to the customer is:-A POCKET CALCULATOR");
}
}
}
