import java.io.*;
class qwertymultiply 
{
public static void main (String args[]) throws IOException {
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
long a,b,c;
System.out.println ("Enter the first no.");
a=Long.parseLong (br.readLine());
System.out.println ("Enter the second no.");
b=Long.parseLong (br.readLine());
c=a*b;
System.out.println (" The multiplication of "+a+" and "+b+" is = "+c);
    }
}