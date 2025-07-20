import java.io.*;
class twinprimenos
{
public static void main(String args[])throws IOException
{
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
int lim;
System.out.println("Enter the maximum limit");
lim=Integer.parseInt(br.readLine());
int a=1,b=0,count=0;
for(int i=2;i<=lim;i++)
{
count=0;
for(int j=2;j<=i/2;j++) 
if(i%j==0)
{ 
count=1;
break;
    }
    if(count==0)
    {
   
   b=i;
    if((b-a)==2)
    System.out.println("Twin pair("+a+","+b+")");
    a=b;
}
    }
    }
}