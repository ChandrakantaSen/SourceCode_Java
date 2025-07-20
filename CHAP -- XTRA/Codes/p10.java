import java.io.*;
class p10
{
public static void main(String args[])throws IOException
{
String name[]=new String[10],t="";
int i;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the name of the 10 students : - ");
for(i=0;i<10;i++)
{
System.out.println("Enter the full name of "+(i+1)+"the student : - ");
name[i]=br.readLine();
    }
System.out.println("The name of students are as follows : - ");
for(i=0;i<10;i++)
{
System.out.println(name[i]);
    }
for(i=0;i<10;i++)
{
t=t+name[i].charAt(0);
}
System.out.println("The name is : - "+t);
    }
}