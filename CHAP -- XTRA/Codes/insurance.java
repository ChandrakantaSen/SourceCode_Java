import java .io.*;
class insurance 
{
public static void main (String args[]) throws IOException
{
int age;
char sex;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter the age");
age=Integer.parseInt (br.readLine());
System.out.println ("Enter the sex");
sex=(char)(br.read());
if ((sex=='M')||(sex=='m'))
{
if(age>=30)
{
System.out.println ("He is insured");
    }
    else
    {
        System.out.println ("He is not insured");
    }
}
else if ((sex=='F')||(sex=='f'))
    {
      if(age>=25)
      {
      System.out.println ("She is insured");
    }
    else 
    {
        System.out.println ("She is not insured");
    }
}
else
{
System.out.println ("Wrong choice");
    }
}
    }
    