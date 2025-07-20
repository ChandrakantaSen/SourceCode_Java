import java.io.*;               
class pg321q4
{
public static int armstrong(int n)
{
int m,d,s=0;
m=n;
while (m>0)
{
d=m%10;
s=s+(d*d*d);
m=m/10;
}
if(n==s)
{
return 1;
}
else
{
return 0;
}
}

public static void main (String args[])throws IOException
{
int a;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
pg321q4 ob= new pg321q4();
System.out.println("Enter the number to check whether it is armstrong or not");
a=Integer.parseInt(br.readLine());
if(ob.armstrong(a)==1)
{
System.out.println(a+"is an armstrong number");
}
else
{
System.out.println(a+"is not an armstrong number");
}
}
}
