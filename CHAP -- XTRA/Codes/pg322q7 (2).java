import java.io.*;               
class pg322q7
{
public static void main (String args[])throws IOException
{
String x;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
pg322q7 ob= new pg322q7();        
System.out.println("Enter any word");
x=br.readLine();
ob.magic(x);
}
public static void magic(String x)
{
int i;
int l=x.length();
for(i=0;i<l;i++)
{
if(x.charAt(i)==x.charAt(i+1))
{
System.out.println("It is a magic string");
}
else
{
System.out.println("It is not a magic string");
}
}
}
}