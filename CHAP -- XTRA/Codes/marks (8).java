import java.io.*;
class marks
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
{
int m,c,a,e,h,tot;
double avg;
System.out.println("Enter the marks of maths :-");
m=Integer.parseInt(br.readLine ());
System.out.println("Enter the marks of computer :-");
c=Integer.parseInt(br.readLine ());
System.out.println("Enter the marks of accounts :-");
a=Integer.parseInt(br.readLine ());
System.out.println("Enter the marks of english :-");
e=Integer.parseInt(br.readLine ());
System.out.println("Enter the marks of hindi :-");
h=Integer.parseInt(br.readLine ());
tot=m+c+a+e+h;
System.out.println("The total marks is="+tot);
avg=tot/5;
System.out.println("The average is="+avg);

    }
}
    }