import java.io.*;
class Current extends Account  
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double d,mb,i=0,mbal=5000;
public void deposit()throws IOException
    {
System.out.println("Enter the deposit :  ");
d=Double.parseDouble(br.readLine()); 
mb=d+super.bal;        
    }
public void compute()
    {
System.out.println("There is no interest because it is a current account");
    }
 public void minbal()
    {
if(mb<5000)        
{
System.out.println("You have to give us 100 Rs.penalty ");
mb=mb-100;
    }
System.out.println("The main balance is :  "+mb);    
    }
public void show()throws IOException    
{
super.input();
System.out.println("The name of the customer name is : - "+super.name);
System.out.println("The account number is :  "+super.acc);
System.out.println("The opening balance of the customer is :  "+super.bal);
deposit();
compute();
minbal();
    }
/*public void main(String args[])throws IOException    
{
Current ob=new Current();
ob.input();
ob.deposit();
ob.compute();
ob.minbal();
    }*/
    }