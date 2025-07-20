import java.io.*;
class amicable4   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m,i,s=0,s1=0;
System.out.println("Enter the 1st number ");
n=Integer.parseInt(br.readLine());
System.out.println("Enter the 2nd number ");
m=Integer.parseInt(br.readLine());
i=1;
do
{
if(n%i==0)
{
s=s+i;
}
i++;
}
while(i<n);
for(i=1;i<m;i++)
{
if(m%i==0)
{
s1=s1+i;
    }
}	
if((s==m)&&(s1==n))
{
System.out.println(n+"&"+m+"are amicable numbers");
    }
    else
    {
     System.out.println(n+"&"+m+"are not amicable numbers");
    } 
}
    }