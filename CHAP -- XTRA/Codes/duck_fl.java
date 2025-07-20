import java.io.*;               
class duck_fl
{
public static void main(String args[])throws IOException
{
 int n,m,d=0,flag=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to find whether it is a duck number or not");
n=Integer.parseInt(br.readLine());
for(m=n;m>0;d=m%10,m=m/10)
{
if(d==0)
{
flag=1;
break; 
}
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
