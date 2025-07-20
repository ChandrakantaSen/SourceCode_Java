//wap to perform the sum of main diagonal & sum of right diagonal elements of 4*4 order matrix.

import java.io.*;
class matrix
{
public static void main(String args[])throws IOException
{
BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
int x[][]={{6,9,0,8},{3,2,1,5},{2,9,0,1},{4,1,9,6}};
System.out.println("1. sum of main diagonal elements");
System.out.println("2. sum of right diagonal elements");
char c=(char)System.in.read();
switch(c)
{
case '1':
int s=0;
for(int i=0;i<=3;i++)
{
s=s+x[i][i];
    }
    System.out.println(s);
    break;
    case '2':
    int r=0;
    int j=3;
    for(int i=0;i<=3;i++)
    {
        r=r+x[i][j];
        j--;
    }
    System.out.println(r);
    break;
    default:
    System.out.println("wrong choice");
}
    }
}
    