import java.io.*;
class qwertysub{
public static void main (String args[]) throws IOException {
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
double a,b,c;
System.out.println ("Enter the first no.");
a=Double.parseDouble (br.readLine());
System.out.println ("Enter the second no.");
b=Double.parseDouble (br.readLine());
c=a-b;
System.out.println (" The subtration of "+a+" and "+b+" is = "+c);
    }
}