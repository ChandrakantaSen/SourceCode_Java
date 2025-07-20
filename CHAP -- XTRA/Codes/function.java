import java.io.*;               
class function
{
int func(int n)
{
int i,p;p=0;
p=n*n*n;
return(p);
}
public static void main(String args [])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int a,j;
int m[]=new int[10];
for(j=0;j<10;j++)
{
System.out.println("Enter ten numbers");
m[j]=Integer.parseInt(br.readLine());
}
for(j=0;j<10;j++)
{
function ob=new function();
int s=ob.func(m[j]);
System.out.println(s);
}
}
}
