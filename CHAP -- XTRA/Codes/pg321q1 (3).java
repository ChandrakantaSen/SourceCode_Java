import java.io.*;               
class pg321q1
{
int func(int x)
{
return x*x*x;
}
public static void main (String args[])throws IOException
{
int i,n,k;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
for(i=0;i<10;i++)
{
System.out.println("Enter the number");
n=Integer.parseInt(br.readLine());
pg321q1 ob= new pg321q1();
k=ob.func(n);
System.out.println("The cubes of the above digits is:-"+k);
}
}
} 
