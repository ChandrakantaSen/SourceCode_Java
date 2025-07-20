import java.io.*;
class qwertydivide{
public static void main (String args[]) throws IOException {
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
float a,b,c;
System.out.println ("Enter the first no.");
a=Float.parseFloat (br.readLine());
System.out.println ("Enter the second no.");
b=Float.parseFloat (br.readLine());
c=a/b;
System.out.println (" The division of "+a+" and "+b+" is = "+c);
    }
}