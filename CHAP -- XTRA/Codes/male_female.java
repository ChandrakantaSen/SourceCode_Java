import java.io.*;
class male_female
{
public static void main(String args[])throws IOException
{
int a;char ch;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter your age");
a=Integer.parseInt(br.readLine());
System.out.println("enter your sex");
ch = (char)(br.read());
if((ch=='m')||(ch=='M'))
{
if(a >= 30)
{
System.out.println("he is insured ");
}
else
{
System.out.println("he is not insured ");
}
}
else if(( ch=='f')||(ch=='F'))
{
if(a >= 25)
{
System.out.println("she is insured ");
}
else
{
System.out.println("she is not insured ");
}
}
else
{
System.out.println("wrong input ");
}
}
    }
