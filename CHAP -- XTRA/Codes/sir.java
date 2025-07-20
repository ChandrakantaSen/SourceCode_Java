import java.io.*;
class sir
{
void main()throws IOException
{
 BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int i,j=1,n;
System.out.println("Enter limit : ");
n=Integer.parseInt(buf.readLine());
for(i=1;i<=n;i++)
{
System.out.print((i*j)+" ");
j=j*10+1;;

    }
}
    }