import java.io.*;               
class neon_wl
{
public static void main(String args[])throws IOException
{
 int n,m,d,s=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to find whether it is neon or not");
n=Integer.parseInt(br.readLine());
m=n;
while(m>0)
{
d=m%10;
s=s+d;                                                        
m=m/10;                                          
}                                                                                                                                                                                                                                                                                          
if(s==n)
{
System.out.println(n+"is a neon number");
}
else
{
System.out.println(n+"is not a neon number");
}
}
}
