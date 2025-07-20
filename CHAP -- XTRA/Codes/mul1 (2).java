import java.io.*;
class mul1
{
public void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,m;
System.out.println("Enter the First number : - ");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the Second number : - ");
b=Integer.parseInt(br.readLine());
m=a*b;
System.out.println("The porduct  of "+a+" and "+b+"is ="+m);
}
}