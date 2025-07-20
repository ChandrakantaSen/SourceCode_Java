import java.io.*;               
class palindrome_dowl
{
public static void main(String args[])throws IOException
{
 int n,m,d,s=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to find whether it is palindrome or not");
n=Integer.parseInt(br.readLine());
m=n;
do
{
d=m%10;
s=s*10+d;                                                        
m=m/10;                                          
}    
while(m>0);                                                                                                                                                                                                                                                                                    
if(s==n)
{
System.out.println(n+"is a palindrome number");
}
else
{
System.out.println(n+"is not a palindrome number");
}
}
}
