import java.io.*;
public class income_tax
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double ai,tax;
System.out.println("Enter the annual income");
ai=Double.parseDouble(br.readLine());
if(ai<=100000)
{
tax=0;
}
else if(ai>=100001&&ai<150000)
{
tax=(ai-100000)*0.10;
}
else if(ai>=150001&&ai<250000)
{
tax=(ai-150000)*0.20;
tax=tax+15000;
}
else
{
tax=(ai-250000)*0.30;
tax=tax+25000;
}
if(tax==0)
{
System.out.println("no tax");
}
else
{
System.out.println("The income tax to be paid"+tax);
}
}
}

