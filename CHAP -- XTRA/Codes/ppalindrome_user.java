import java.io.*;
    class ppalindrome_user
{
 public static void main(String args[])throws IOException
 { 
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
 
     int n;
     System.out.println("Enter the value of n");
     n=Integer.parseInt(br.readLine());
 for(int h=1;h<=n;h++)
{
int m=h,p=0,c=0;
while(m>0)
{
p=m%10;
m=m/10;
c=c*10+p;
}
if(c==h)         
{
int t;
for(t=2;t<h;t++)
{
if(h%t==0)
break;
}
if(h==t)
System.out.println("prime pallindrome="+h);
}
}
}
}
