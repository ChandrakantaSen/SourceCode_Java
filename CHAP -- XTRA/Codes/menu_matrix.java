import java.io.*;
class menu_matrix
{
public static void main( String args [])throws IOException
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
int op,d=0;
System.out.println("1.sum of 2 matrices");
System.out.println("2.odd numbers");
System.out.println("enter an option");
op=Integer.parseInt(br.readLine());
int b[][]=new int [3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{

System.out.println("enter values");
b[i][j]=Integer.parseInt(br.readLine());

    }    }
int a[][]=new int [3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.println("enter values");
a[i][j]=Integer.parseInt(br.readLine());
    }    }
switch(op)
{
case 1:
int temp[][]=new int[3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
temp[i][j]=b[i][j]+a[i][j];
    
System.out.print(temp[i][j]+"\t");
        }
   System.out.println();
}
   break;
   case 2:
   for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
if((b[i][j]%2!=0)||(a[i][j]%2!=0))
   d++;
}
    }
    System.out.println(" no of odd digits are ="+d);
break;



default:
System.out.println(" invalid option");
    }
}
    }

 