import java.io.*;
class shuffle_mat
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,j,ch=0,ch2=0,ch3=0,temp1=0,temp2=0;
System.out.println("Enter the size of the matrix : - ");
n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
System.out.println("Enter the values in the matrix : - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(br.readLine());
    }
}
System.out.println("The values in the matrix are as follows : - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]);
    }
System.out.println();    
}
while(ch!=3)
{
System.out.println("Enter 1 to shuffle rows");
System.out.println("Enter 2 to shuffle columns");
System.out.println("Enter 3 to exit");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:
System.out.println("Enter 1 to shuffle from top");
System.out.println("Enter 2 to shuffle from bottom");
ch2=Integer.parseInt(br.readLine());
switch(ch2)
{
case 1:
System.out.println("Enter no of rows to shuffle from top");
ch3=Integer.parseInt(br.readLine());
if(ch3<=n)
{
for(i=0;i<ch3;i++)
{
temp1=a[i][0];
for(j=0;j<n-1;j++)
{
temp2=a[i][j+1];
a[i][j+1]=temp1;
temp1=temp2;
    }
    a[i][0]=temp2;
    }}
    else
    System.out.println("Choice out of bounds");
    break;
case 2:
System.out.println("Enter no of rows to shuffle from bottom");
ch3=Integer.parseInt(br.readLine());
if(ch3<=n)
{
for(i=n-1;i>=n-ch3;i--)
{
temp1=a[i][0];
for(j=0;j<n-1;j++)
{
temp2=a[i][j+1];
a[i][j+1]=temp1;
temp1=temp2;
    }
    a[i][0]=temp2;
    }}break;
    default:System.out.println("Wrong choice");
    break;
}
break;
case 2:
System.out.println("Enter 1 to shuffle from left");
System.out.println("Enter 2 to shuffle from right");
ch2=Integer.parseInt(br.readLine());
switch(ch2)
{
case 1:
System.out.println("Enter no of rows to shuffle from left");
ch3=Integer.parseInt(br.readLine());
if(ch3<=n)
{
for(j=0;j<ch3;j++)
{
temp1=a[0][j];
for(i=0;i<n-1;i++)
{
temp2=a[i+1][j];
a[i+1][j]=temp1;
temp1=temp2;
    }
    a[0][j]=temp2;
}
    }
    else
    System.out.println("Choice out of bounds");
    break;
case 2:
System.out.println("Enter no of rows to shuffle from right");
ch3=Integer.parseInt(br.readLine());
if(ch3<=n)
{
for(j=n-1;j>n-ch3;j--)
{
temp1=a[0][j];
for(i=0;i<n-1;i++)
{
temp2=a[i+1][j];
a[i+1][j]=temp1;
temp1=temp2;
    }
    a[0][j]=temp2;
}
    }
    else
    System.out.println("Choice out of bounds");
    break;
}
break;
case 3:
System.exit(0);
break;
default:System.out.println("Wrong choice");
    }
    System.out.println("The values in the shuffled matrix are as follows : - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]);
    }
System.out.println();    
}
}
    }
}