import java.io.*;
class pat3  
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
char c='*';
for(int count=0;count<j;count++)
{
System.out.print(c);
   }
   if(j==n)
   {
   sp=0;
j--;
}
else if(j!=n && j==n-1)
{
sp=1;
}
else
{
sp=sp+2;
}
for(int k=0;k<sp;k++)
{
System.out.print(" ");
    }
for(int count=0;count<j;count++)
{
System.out.print(c);

}
System.out.println(" ");
}
}

}


    
