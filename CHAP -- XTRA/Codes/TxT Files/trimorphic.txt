import java.io.*;
class trimorphic
{
public static void main() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the no.");
int n=Integer.parseInt(br.readLine());
int b=(int)Math.pow(n,3);
String s=Integer.toString(n);
String q=Integer.toString(b);
if(q.endsWith(s)==true)
System.out.println("is trimorphic");
else 
System.out.println("is not trimorphic");
    }
}
