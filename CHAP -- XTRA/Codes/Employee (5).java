import java.io.*;
class Employee
{
public static void main(String args[])throws IOException
{
int i,c=0,s,ss=0,n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number: -");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
System.out.println("Enter the salary : - ");
s=Integer.parseInt(br.readLine());
if(s>10000)
{
c++;
    }
ss=ss+s;
    }
System.out.println("Salary:-"+ss);
System.out.println("no.of employees getting salary above 10000 "+c);
    }
}
    
