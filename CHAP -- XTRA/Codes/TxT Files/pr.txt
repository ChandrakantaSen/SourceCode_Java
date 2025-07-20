import java.io.*;
class pr
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number : "); 
int n=Integer.parseInt(br.readLine());
//for(int i=2;i<=n;i++)
//{
 int count=0;
 for(int j=1;j<=n;j++)
  {
   if(n%j==0)
     count=count+1;
  }
if(count==2)
 {
 System.out.println(" this is a prime number:\t"+n);
}
else
System.out.println(" this is  not a prime number:\t"+n);

//}
    }
}