import java.io.*;
class Saving extends Account    
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double ci,mb;
int c,p,r,t,a=0;
public void interest()throws IOException
{
System.out.println("Enter the principal amount : ");
p=Integer.parseInt(br.readLine());
System.out.println("Enter the rate : ");
r=Integer.parseInt(br.readLine());
System.out.println("Enter the time in years : ");
t=Integer.parseInt(br.readLine());
c=p*(1+(r/100))+p;
ci=Math.pow(c,t);
System.out.println("The compound interest calculated on the principal amount is : "+ci);
mb=ci+super.bal;
System.out.println("The balance after imposing interest is : "+mb);
    }
public void withdraw()throws IOException
{
System.out.println("Main Balance :  "+mb);
System.out.println("Enter the amount to be withdrawn : "+a);
a=Integer.parseInt(br.readLine());
mb=mb-a;
System.out.println("The balance after withdrawing money is "+mb);
    } 
public void show()throws IOException    
{
super.input();
System.out.println("The name of the customer name is : - "+super.name);
System.out.println("The account number is :  "+super.acc);
System.out.println("The opening balance of the customer is :  "+super.bal);
interest();
withdraw();    
}
    }

    