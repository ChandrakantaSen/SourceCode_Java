/*CALCULATION OF THE AREA OF THE TRIANGLE TAKING THE LENGTHS AND SIZE AS AN INPUT 
ACCORDING TO USER'S CHOICE*/
import java.io.*;
class p259_7
{
public static void main(String args[])throws IOException
{
int a,b,c,ch;
double et=0.0,st=0.0,it=0.0,s=0.0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("...................MENU............");
System.out.println("Press 1 for area of an equilateral triangle");
System.out.println("Press 2 for area of an isoceles triangle");
System.out.println("Press 3 for area of an scalene triangle");
System.out.println("Enter your choice");
ch=Integer.parseInt(br.readLine());
switch (ch)
{
case 1:
System.out.println("Enter the side of the equilateral triangle");
a=Integer.parseInt(br.readLine());
et=(Math.sqrt(3)/4*a*a);
System.out.println("The area of the equilateral triangle is"+et);
break;
case 2:
System.out.println("Enter the two side of the isoceles triangle");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
it=(0.25*b*(Math.sqrt((4*b*b)-(a*a))));
System.out.println("The area of the isoceles triangle is"+it);
break;
case 3:
System.out.println("Enter the three side of the isoceles triangle");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=Integer.parseInt(br.readLine());
s=(a+b+c)/2;
st=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("The area of the scalene triangle is"+st);
break;
default:
System.out.println("Wrong choice");
}
}
}