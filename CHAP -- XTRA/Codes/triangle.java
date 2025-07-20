import java.io.*;
class triangle
{
public static void main(String args[])throws IOException
{
 int a,b,c;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter one angle of the triangle");
a=Integer.parseInt(br.readLine());
System.out.println("Enter second angle of the triangle");
b=Integer.parseInt(br.readLine());
System.out.println("Enter third angle of the triangle");
c=Integer.parseInt(br.readLine());
if((a+b+c)==180)
{
System.out.println("The triangle is possible");
if((a==90)||(b==90)||(c==90))
{
System.out.println("It is a right angled triangle");
    }
    else if((a>90)||(b>90)||(c>90))
    {
        System.out.println("It is an obtuse angled triangle");
    }
    else
    {
        System.out.println("It is an acute angled triangle");
    }
}
else
{
System.out.println("Triangle is not possible");
    }
}
    }
