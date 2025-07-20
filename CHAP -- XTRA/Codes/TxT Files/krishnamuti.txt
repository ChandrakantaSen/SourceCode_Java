import java.io.*;
class krishnomurti
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int k,fact=1,s=0,y=0,i=0;
System.out.println("enter any number:");
k=Integer.parseInt(br.readLine());
int b=k;
while(k!=0)
{
y=k%10;
for(i=1;i<=y;i++)
{
fact=(fact*i);
    }
s=s+fact;
fact=1;
k/=10;

    
}    
    if(s==b)
    {
    System.out.println("this is  a krishnamurti number ");
}
else
{
System.out.println("this is not a krishnamurti number");
    }
}
    }