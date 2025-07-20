import java.io.*;               
class pg322q6
{
public static void freq(String x)
{
int i,j,c=0,l,flag=0;
l=x.length();
System.out.println("vowels          frequency");
for(i=0;i<l;i++)
{
if(x.charAt(i)=='A'||x.charAt(i)=='a'||x.charAt(i)=='E'||x.charAt(i)=='e'||x.charAt(i)=='I'||x.charAt(i)=='i'||x.charAt(i)=='O'||x.charAt(i)=='o'||x.charAt(i)=='U'||x.charAt(i)=='u')
{
for(j=0;j<l;j++)
{
if(x.charAt(i)==x.charAt(j))
{
c++;
}
}
for(j=i-1;j>=0;j--)
{
if(x.charAt(i)==x.charAt(j))
{
flag=1;
}
}
if(flag!=1)
{
System.out.println(x.charAt(i)+"             "+c);
}
}
flag=0;
c=0;
}
}
public static void main (String args[])throws IOException
{
String x;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
pg322q6 ob= new pg322q6();
System.out.println("Enter the string to find out the frequency of each character");
x=br.readLine();
ob.freq(x);
}
}

