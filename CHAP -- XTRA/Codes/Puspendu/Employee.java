package Puspendu;

import java.io.*;
class Employee
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Please enter the number of employees :");
int n=Integer.parseInt(br.readLine());
Employee obj1=new Employee();
obj1.Input(n);
}
public void Input(int m)throws IOException
{
String s,p;
double mi,tax;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Employee obj=new Employee();
for(int i=1;i<=m;i++)
{
System.out.println("Please enter the name of employee :");
s=br.readLine();
System.out.println("Please enter the PAN number :");
p=br.readLine();
System.out.println("Please enter monthly taxable income :");
mi=Double.parseDouble(br.readLine());
tax=obj.Calculate(mi);
obj.Display(s,p,mi,tax);
}
}
public double Calculate(double mi)
{
double s;double tax;
double a=mi*12;
if(a>=100001 && a<=150000)
{
s=a-100000;
tax=s*0.10;
}
else if(a>=150001 && a<=250000)
{
s=a-150000;
tax=(s*0.20)+5000;
}
else if(a>250000)
{
s=a-250000;
tax=(s*0.30)+25000;
}
else
{
tax=0.0;
}
return tax;
}
public void Display(String name,String p,double mi,double tax)
{
double a=mi*12;
System.out.println("PAN no. :\t| Name :   |\t Annual Taxable Income : |\t Annual Tax :");
System.out.println(p+"\t\t"+name+"\t\t\t"+a+"\t\t"+tax);
}
}