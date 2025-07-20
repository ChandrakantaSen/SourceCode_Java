import java.io.*;
class diff
{
public static void main() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the string");
String q=br.readLine();
String s=" "+q;
for(int i=1;i<s.length();i++)
{
if(s.charAt(i-1)==32)
{
if(s.charAt(i)>90)
System.out.print((char)(s.charAt(i)-32));
else 
System.out.print((char)(s.charAt(i)+32));
}
else
{
if(s.charAt(i)==32)
System.out.print((char)(32));
else
System.out.print((char)(s.charAt(i)+1));
}
}
}
}
