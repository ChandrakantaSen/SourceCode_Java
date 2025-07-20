import java.io.*;
class pat4
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println(" Enter number of character");
int n=Integer.parseInt(br.readLine());
int sp=0;
for(int i=n;i>=0;i--)
{
int j=i;
char c='A';
for(int count=0;count<j;count++)
{
System.out.print(c);
c++;
   }
   if(j==n)
   {
   sp=0;
  c--;
  c--;
j--;
}
else if(j!=n && j==n-1)
{
sp=1;
c--;
}
else
{
sp=sp+2;
c--;
}
for(int k=0;k<sp;k++)
{
System.out.print(" ");
    }
for(int count=0;count<j;count++)
{
System.out.print(c);
c--;
}
System.out.println(" ");
}
}

}

