import java.io.*;
public class insurance_policy
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int age;
char sex;
System.out.println("Enter the age:-");
age=Integer.parseInt(br.readLine());
System.out.println("Enter the sex:-");
sex=(char)(br.read());
if((sex=='M')||(sex=='m'))
{
if(age>=30)
{
System.out.println("He is ensured");
}
else
{System.out.println("He is not ensured");
}
}
else if((sex=='F')||(sex=='f'))
{
if(age>=25)
{
System.out.println("She is ensured");
}
else
{
System.out.println("She is not ensured");
}
}

else
{
System.out.println("Wrong Input");
}
}
}

