import java.io.*;               
class pg321q2
{
void triangle(int x,int y,int z)
{
if(x==y&&y==z&&x==z)
{
System.out.println("equilateral");
}
if(x==y||y==z||x==z)
{
System.out.println("isosceles");;
}
if(x!=y&&y!=z&&x!=z)
{
System.out.println("scalene");
}
}
public static void main (String args[])throws IOException
{
int a,b,c;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the first number");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the second number");
b=Integer.parseInt(br.readLine());
System.out.println("Enter the third number");
c=Integer.parseInt(br.readLine());
pg321q2 ob= new pg321q2();
ob.triangle(a,b,c);

}
}
