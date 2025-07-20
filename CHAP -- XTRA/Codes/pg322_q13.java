import java.io.*;
public class pg322_q13
{
static double pp;
public static double discount(int x)
{
double d;
d=(pp*x)/100;
return d;
}
public static double discount(int x,int y)
{
double d;
d=((pp*x)/100)+((pp*y)/100);
return d;
}
public static double discount(int x,int y,int z)
{
double d;
d=((pp*x)/100)+((pp*y)/100)+((pp*z)/100);
return d;
}
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
pg322_q13 ob=new pg322_q13();
int ch;
double d1,sp;
System.out.println("Enter the printed price : - ");
pp=Double.parseDouble(br.readLine())	;
do
{
System.out.println("---------------MENU------------------------------------------ ");
System.out.println("Press 1 for find out the first discount : - ");
System.out.println("Press 2 for find out the second discount : - ");
System.out.println("Press 3 for find out the third discount : - ");
System.out.println("Press 4 for Exit : - ");
System.out.println("Enter your choice : - ");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:
d1=ob.discount(10);
sp=pp-d1;
System.out.println("The sale price is : - "+sp);
break;
case 2:
d1=ob.discount(10,8);
sp=pp-d1;
System.out.println("The sale price is : - "+sp);
break;
case 3:
d1=ob.discount(10,8,6);
sp=pp-d1;
System.out.println("The sale price is : - "+sp);
break;
case 4:
System.exit(0);
break;
default:
System.out.println("Wrong Choice ");
    }
}
while(true);
    }
}

    