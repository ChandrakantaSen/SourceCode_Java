import java.util.*;
class scheighest 
{
public static void main()

{
Scanner sc=new Scanner(System.in);
int a[]=new int[10]; 
String b[]=new String[10];
int c[]=new int[10];
int i,t=0;
for ( i=0;i<10;i++)
{ 
System.out.println("Enter ten marks of ten students");
a[i]=sc.nextInt();
System.out.println("Enter name of ten students");
b[i]=sc.next();
System.out.println("Enter roll number of ten students");
c[i]=sc.nextInt();
}
int max=0 ,schighest=0;
for ( i=0;i<10;i++)
{
if(a[i]>max)
{
max=a[i];
t=i;
}
System.out.println("name of the heighest student"+b[i]);
System.out.println(" heighest marks "+t);
System.out.println("roll number of the heighest student"+c[i]);
}
}


