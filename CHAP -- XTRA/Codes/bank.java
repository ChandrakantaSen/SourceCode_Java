import java.io.*;
class bank
{
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static String name,type;
static int num,c;
static double amt;
bank(String name1,String type1,int num1,Double amt1)
{
name=name1;
type=type1;
num=num1;
amt=amt1;
}
static void withdraw()throws IOException
{
System.out.println("Enter the amount to be withdrawn : ");
c=Integer.parseInt(br.readLine());
amt=amt-c;
System.out.println("The balance after withdrawing money is "+amt);
} 
static void print()
{
System.out.println("Name : "+name);
System.out.println("Type of account : "+type);
System.out.println("Account Number : "+num);
System.out.println("Balance amount in the account : "+amt);
}
public static void main(String args[])throws IOException
{
String n,t;
int nu;
Double a;
System.out.println("Name : ");
n=br.readLine();
System.out.println("Type of account : ");
t=br.readLine();
System.out.println("Account Number : ");
nu=Integer.parseInt(br.readLine());
System.out.println("Balance amount in the account : ");
a=Double.parseDouble(br.readLine());
bank ob=new bank(n,t,nu,a);
ob.print();
ob.withdraw();
}
}