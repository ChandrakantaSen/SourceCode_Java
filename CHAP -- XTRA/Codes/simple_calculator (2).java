import java.io.*;
class calculator
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
String ans=" ";
simple_calculator obj=new simple_calculator();
scientific_calculator obj1=new scientific_calculator();
String s=" ";
System.out.println("CASIO CALCULATOR");
System.out.println();
System.out.println("Your options are :");
System.out.println("1: SIMPLE CALCULATOR");
System.out.println("2: SCIENTIFIC CALCULATOR");
System.out.println();
System.out.println("enter your choice as SIMPLE/SCIENTIFIC");
s=in.readLine();
if(s.equals("simple"))
{
do
{
System.out.println("enter 1 for ADDITION");
System.out.println("enter 2 for SUBTRACTION");
System.out.println("enter 3 for MULTIPLICATION");
System.out.println("enter 4 for DIVISION");
System.out.println("enter 5 for MODULUS");
System.out.println("enter 6 for EXPONENT");
System.out.println();
System.out.println("ENTER YOUR CHOICE");
int ch=Integer.parseInt(in.readLine());
int x,y;
switch(ch)
{
default:
System.out.println(" SORRY!!! Your choice is wrong");
System.out.println(" ENTER ANOTHER CHOICE");
ch=Integer.parseInt(in.readLine());
case 1:
int a=0;
System.out.println("enter a number");
x=Integer.parseInt(in.readLine());
System.out.println("enter another number");
y=Integer.parseInt(in.readLine());
a=obj.addition(x,y);
System.out.println("The sum is " +a);
break;

case 2:
int s1=0;
System.out.println("enter a number");
x=Integer.parseInt(in.readLine());
System.out.println("enter another number");
y=Integer.parseInt(in.readLine());
s1=obj.subtraction(x,y);
System.out.println("The difference is " +s1);
break;

case 3:
int m=0;
System.out.println("enter a number");
x=Integer.parseInt(in.readLine());
System.out.println("enter another number");
y=Integer.parseInt(in.readLine());
m=obj.multiplication(x,y);
System.out.println("The product is "+m);
break;

case 4:
int d=0;
System.out.println("enter a number");
x=Integer.parseInt(in.readLine());
System.out.println("enter another number");
y=Integer.parseInt(in.readLine());
d=obj.division(x,y);
System.out.println("The divisor is "+d);
break;

case 5:
int md=0;
System.out.println("enter a number");
x=Integer.parseInt(in.readLine());
System.out.println("enter another number");
y=Integer.parseInt(in.readLine());
md=obj.modulus(x,y);
System.out.println("The remainder is "+md);
break;

case 6:
double ex=0;
System.out.println("enter a number");
x=Integer.parseInt(in.readLine());
System.out.println("enter another number");
y=Integer.parseInt(in.readLine());
ex=obj.exponent(x,y);
System.out.println("The exponent is "+ex);
break;

}//switch closed
System.out.println("Do you want to continue?Enter yes or no");
ans=in.readLine();
if (ans.equalsIgnoreCase("no"))
{
System.out.println("THANK YOU FOR USING CASIO CALCULATOR");
 break;
}//if closed
}//do while closed
while(ans.equalsIgnoreCase("yes"));
}//if closed
else 
{
do
{
System.out.println("enter 1 for DECIMAL TO BINARY");
System.out.println("enter 2 for BINARY TO DECIMAL");
System.out.println("enter 3 for DECIMAL TO OCTAL");
System.out.println("enter 4 for OCTAL TO DECIMAL");
System.out.println("enter 5 for DECIMAL TO HEXA");
System.out.println("enter 6 for HEXA TO DECIMAL");
System.out.println("enter 7 for OCTAL TO BINARY");
System.out.println("enter 8 for BINARY TO OCTAL");
System.out.println("enter 9 for HEXA TO BINARY ");
System.out.println("enter 10 for BINARY TO HEXA");
System.out.println("enter 11 for HEXA TO OCTAL");
System.out.println("enter 12 for OCTAL TO HEXA");
System.out.println();
System.out.println("ENTER YOUR CHOICE");
int ch1=Integer.parseInt(in.readLine());
switch(ch1)
{
default:
System.out.println("SORRY!!!your choice is wrong");
System.out.println("ENTER ANOTHER CHOICE");
ch1=Integer.parseInt(in.readLine());

case 1:
int a1;
System.out.println("Enter a number");
a1=Integer.parseInt(in.readLine());
System.out.println("The binary number is");
obj1.decimal_binary(a1);
break;

case 2:
int bin=0;
int a2;
System.out.println("Enter a number");
a2=Integer.parseInt(in.readLine());
bin=obj1.binary_decimal(a2);
System.out.println("The decimal number is " +bin);
break;

case 3:
int a3;
System.out.println("Enter a number");
a3=Integer.parseInt(in.readLine());
System.out.println("The octal number is");
obj1.decimal_octal(a3);
break;

case 4:
int oct=0;
int a4;
System.out.println("Enter a number");
a4=Integer.parseInt(in.readLine());
oct=obj1.octal_decimal(a4);
System.out.println("The decimal number is " +oct);
break;

case 5:
int a5;
System.out.println("Enter a number");
a5=Integer.parseInt(in.readLine());
System.out.println("The hexa number is");
obj1.decimal_hexa(a5);
break;

case 6:
int hex=0;
int a6;
System.out.println("enter a number");
a6=Integer.parseInt(in.readLine());
hex=obj1.hexa_decimal(a6);
System.out.println("the decimal number is " +hex);
break;
case 7:
int a7;
System.out.println("enter a number");
a7=Integer.parseInt(in.readLine());
System.out.println("The binary number is");
obj1.octal_binary(a7);
break;

case 8:
int a8;
System.out.println("enter a number");
a8=Integer.parseInt(in.readLine());
System.out.println("the octal number is");
obj1.binary_octal(a8);
break;

case 9:
int a9;
System.out.println("enter a number");
a9=Integer.parseInt(in.readLine());
System.out.println("the binary number is");
obj1.hexa_binary(a9);
break;

case 10:
int a10;
System.out.println("enter a number");
a10=Integer.parseInt(in.readLine());
System.out.println("the hexa number is");
obj1.binary_hexa(a10);
break;

case 11:
int a11;
System.out.println("enter a number");
a11=Integer.parseInt(in.readLine());
System.out.println("the octal number is");
obj1.hexa_octal(a11);
break;

case 12:
int a12;
System.out.println("enter a number");
a12=Integer.parseInt(in.readLine());
System.out.println("the hexa number is");
obj1.octal_hexa(a12);
break;
}//switch closed
System.out.print("Do you want to continue?Enter yes or no");
ans=in.readLine();
if (ans.equalsIgnoreCase("no"))
{
System.out.println("THANK YOU FOR USING CASIO CALCULATOR");
 break;
 }//if closed
}//do while closed
while(ans.equalsIgnoreCase("yes"));
}//else closed
}//method closed
}//class closed




    class simple_calculator
{
    int addition(int a,int b)
{
    int add=0;
    add=a+b;
    return add;
}//int method closed
    int subtraction(int a,int b)
{
    int sub=0;
    if(a>b)
    sub=a-b;
    else 
    sub=b-a;
    return sub;
}//int method closed
    int multiplication(int a,int b)
{
    int multiply=0;
    multiply=(a*b);
    return multiply;
}
    int division(int a,int b)
{
    int div=0;
    div=(a/b);
return div;
}//int method cloosed
    int modulus(int a,int b)
{
    int mod=0;
    mod=(a%b);
    return mod;
}//int method closed
    double exponent(int a,int b)
{
    double e=0.00;
    e=Math.pow(a,b);
    return e;
}//int method closed
}//class closed




class scientific_calculator
{
void decimal_binary(int a)
{
    int c[]=new int[10];
    int d=0,i=0;
    int l=c.length;
    while(a!=0)
{
    d=a%2;
    c[i]=d;
    a=a/2;
    i++;
}//while loop closed
    for(int j=i-1;j>=0;j--)
{
    System.out.print(c[j]);
    System.out.println();
}//for closed
}//method closed


    int binary_decimal(int a)
{
    int b=0,d=0;
    int c=0,e=0,f=0;
    while(a!=0)
{
    b=(a%10);
    c=(int)(Math.pow(2,d));
    e=(b*c);
    f=f+e;
    a=a/10;
    d++;
}//while closed
    return f;
}//method closed


    void decimal_octal(int a)
{
    int c[]=new int[10];
    int d=0,i=0;
    int l=c.length;
    while(a!=0)
{
    d=a%8;
    c[i]=d;
    a=a/10;
    i++;
}//while closed
    for(int j=i-1;j>=0;j--)
{
    System.out.print(c[j]);
    System.out.println();
}//for closed
}//method closed


    int octal_decimal(int a)
{
    int b=0,d=0;
    int c=0,e=0,f=0;
    while(a!=0)
{
    b=(a%10);
    c=(int)(Math.pow(8,d));
    e=(b*c);
    f=f+e;
    a=a/10;
    d++;
}//while closed
    return f;
}//method closed


    void decimal_hexa(int n)
{
    char ar[]={'A','B','C','D','E','F'};
    String s=" ";
    int a,b,c=0;
    while(n!=0)
{
    a=n%16;
    if(a<10)
    s=a+s;
else
{
    b=a%10;
    s=ar[b]+s;
}
    n=n/16;
}//while closed
    System.out.print(s);
    System.out.println();
}//method closed
   
   int hexa_decimal(int a)
{
    int b=0,d=0;
    int c=0,e=0,f=0;
    while(a!=0)
{
    b=(a%10);
    c=(int)(Math.pow(16,d));
    e=(b*c);
    f=f+e;
    a=a/10;
    d++;
}//while closed
    return f;
}//method closed
    void octal_binary(int n)
{
    int p=0,q=0;
    p=octal_decimal(n);
    decimal_binary(p);
//System.out.println(q);
}//method closed
    void binary_octal(int n)
{
    int p=0,q=0;
    p=binary_decimal(n);
    decimal_octal(p);
//System.out.println(q);
}//method closed
    void hexa_binary(int n)
{
    int p=0,q=0;
    p=hexa_decimal(n);
    decimal_binary(p);
//System.out.println(q);
}//method closed
    void binary_hexa(int n)
{
    int p=0,q=0;
    p=binary_decimal(n);
    decimal_hexa(p);
//System.out.println(q);
}//method closed
    void hexa_octal(int n)
{
    int p=0,q=0;
    p=hexa_decimal(n);
    decimal_octal(p);
//System.out.println(q);
}//method closed
   void octal_hexa(int n)
{
    int p=0,q=0;
    p=octal_decimal(n);
    decimal_hexa(p);
//System.out.println(q);
}//method closed
}//class closed












