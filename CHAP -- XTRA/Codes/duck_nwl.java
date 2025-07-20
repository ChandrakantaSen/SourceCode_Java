import java.io.*;               
class duck_nwl
{
public static void main(String args[])throws IOException
{
 int n,m,d,flag=0,i;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to find whether it is a duck number or not");
n=Integer.parseInt(br.readLine());
m=n;

while(m>0)
{
d=m%10;
if(d==0)
{
flag=1;
break;                                          
}      
m=m/10;
}                                                                                                                                                                                                                                                                                    
if(flag==1)
{
System.out.println(n+" is a duck number");
}
else
{
System.out.println(n+" is not a duck number");
}
}
}
