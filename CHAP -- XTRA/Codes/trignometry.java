import java.io.*;
class trignometry
{
public static void main(String args[])throws IOException
{
double s,c,t;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
s=Math.sin(30); 
c=Math.cos(30);
t=Math.tan(30);
if((s<c)&&(s<t))
{
System.out.println("the lowest value is sin30 which is"+s);
    }
    else if((c<t)&&(c<s))
    {
  System.out.println("the lowest value is cos30 which is"+c);
}
else
{
System.out.println("the lowest value is tan30 which is"+t);
    }
}
    }