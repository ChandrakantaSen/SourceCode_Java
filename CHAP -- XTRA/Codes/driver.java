import java.io.*;
class driver
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
int age;
char sex;
System.out.println("Enter the age : - ");
age=Integer.parseInt(br.readLine());
System.out.println("Enter the sex : - ");
sex=(char)(br.read());
if((sex=='M')||(sex=='m'))
{
if(age>=30)
{
System.out.println("He should be insured");
    }
    else
    {
        System.out.println("He should not be insured");
    }
}
else if((sex=='F')||(sex=='f'))
{
if(age>=25)
{
System.out.println("she should be insured");
    }
    else
    {
        System.out.println("she should not be insured");
    }
}
    else
    {
        System.out.println("wrong Input");
    }
}
    }