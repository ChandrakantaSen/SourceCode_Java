import java.io.*;
class blue
{
public static void main(String args[])throws IOException
{
int M,P,CH,H,COM,TOT;
double avgs;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the value of M");
M=Integer.parseInt (br.readLine());
System.out.println("Enter the value of P");
P=Integer.parseInt (br.readLine());
System.out.println("Enter the value of CH");
CH=Integer.parseInt (br.readLine());
System.out.println("Enter the value of H");
H=Integer.parseInt (br.readLine());
System.out.println("Enter the value of COM");
COM=Integer.parseInt (br.readLine());
TOT=M+P+CH+H+COM;
avgs=TOT/5;
System.out.println("The total value of all the subject is : - "+TOT);
System.out.println("The average value of all the subject is : - "+avgs);
    }
}