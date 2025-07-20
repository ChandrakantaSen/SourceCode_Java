import java.io.*;
class check
{
public static void main(String args[])throws IOException
{
int n,i,sum=0;
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
System.out.print("enter range");
n=Integer.parseInt(br.readLine());
i=1;
while(i<n)
{
sum=sum+i;
i++;
}
System.out.print("print sum");
}
}

 