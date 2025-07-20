import java.io.*;
class sqr
{
public static void main(String args[])throws IOException
{
String ch;
double x;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
ch="yes";
while(ch.equals("YES")|| ch.equals("YES")||ch.equals("Y")||ch.equals("Y"))
{
System.out.print("enter any number:\n");
ch=br.readLine();
x=Double.parseDouble(ch);
System.out.println("square root of"+x+'\t'+"is"+'\t'+Math.sqrt(x));
System.out.print("do u want to continue?(yes or no)-");
ch=br.readLine();
}
}
}