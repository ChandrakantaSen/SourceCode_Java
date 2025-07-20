import java.io.*;               
class palindrome_nwl
{
public static void main(String args[])throws IOException
{
 int i,n,m,d,s;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to find whether it is palindrome or not");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
s=0;
m=i;
while(m>0)
{
d=m%10;
s=s*10+d;                                                        
m=m/10;                                          
}                                                                                                                                                                                                                                                                                          
if(s==i)
{
System.out.println(i);
}
}
}
}