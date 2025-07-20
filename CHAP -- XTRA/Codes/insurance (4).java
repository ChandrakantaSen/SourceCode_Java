import java.io.*;
class insurance
{
public static void main(String args[])throws IOException
{
int age;
char ch=' ';
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
age=Integer.parseInt(br.readLine());
if(ch=='m')
{
if(age>30)
{
System.out.println("the person should be insured");
    }
else
{
System.out.println("the person should not be insured");
    }
}
else
{
if(age>25)
{
System.out.println("the person should be insured");
    }
else
{
System.out.println("the person should not be insured");
    } 
}
    }
}