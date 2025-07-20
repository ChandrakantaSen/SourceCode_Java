/* PATTERN
0
1 2
3 4 5
9 8 7 6
5 4 3 2 1
0
*/
import java.io.*;
class p296_5b
{
public static void main(String args[])throws IOException
{
int i,j,k,p=0,q=9,m;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("The pattern");
for(i=1;i<=3;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(p+" ");
p++;
}
System.out.println();
}
for(k=4;k>=1;k--)
{
for(m=1;m<=k;m++)
{
System.out.print(q+" ");
q--;
}
System.out.println();
}
}
}