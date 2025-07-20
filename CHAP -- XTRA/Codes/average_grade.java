import java.io.*;
public class average_grade
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,c; double av,t;
System.out.println("Enter the marks of 1st subject:-");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the marks of 2nd subject:-");
b=Integer.parseInt(br.readLine());
System.out.println("Enter the marks of 3rd subject:-");
c=Integer.parseInt(br.readLine());
t=a+b+c;
System.out.println("The total marks of all the 3 subject are:-"+t);
av=(a+b+c)/3.0;
if(av>90)
{
System.out.println("Grade-A*");
}
else if(av>80&&av<=90)
{
System.out.println("Grade-AA");
}
else if(av>70&&av<=80)
{
System.out.println("Grade-A");
}
else if(av>60&&av<=70)
{
System.out.println("Grade-B");
}
else if(av>50&&av<=60)
{
System.out.println("Grade-C");
}
else if(av>40&&av<=50)
{
System.out.println("Grade-D");
}
else
{
System.out.println("Grade-F");
}
}
}
