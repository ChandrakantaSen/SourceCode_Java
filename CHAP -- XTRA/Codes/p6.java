import java.io.*;
class p6
{
public static void main(String args[])throws IOException
{
int k=0,i;
String name[]=new String[40],t="";
int marks[]=new int[40];
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the full name and marks of the students : - ");
for(i=0;i<5;i++)
{
System.out.println("Enter the full name of "+(i+1)+"the student : - ");
name[i]=br.readLine();
System.out.println("Enter the marks of "+(i+1)+"the student : - ");
marks[i]=Integer.parseInt(br.readLine());
    }
System.out.println("Name\tMarks : - ");
for(i=0;i<5;i++)
{
System.out.println(name[i]+"\t"+marks[i]);
    }
System.out.println("Name\tMarks : - ");
for(i=0;i<5;i++)
{
if(marks[i]>k)
{
k=marks[i];
t=name[i];
    }
  }
System.out.println("The person who has got the highest mark is : - "+t);
    }
}