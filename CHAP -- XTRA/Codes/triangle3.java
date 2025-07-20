import java.io.*;
public class triangle3
{
void decide(int x,int y, int z)
{
if((x==y)&&(y==z)&&(z==x))
{
System.out.println("The triangle with sides"+x+","+y+"and"+z+"is an equilateral triangle");
}
else if((x==y)||(y==z)||(z==x))
{
System.out.println("The triangle with sides"+x+","+y+"and"+z+"is an isosceles triangle");
}
else
{
System.out.println("The triangle with sides"+x+","+y+"and"+z+"is an scalene triangle");
}
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,j,k;
        System.out.println("Enter the first side of the triangle");
        i=Integer.parseInt(br.readLine());
        System.out.println("Enter the second side of the triangle");
        j=Integer.parseInt(br.readLine());
        System.out.println("Enter the third side of the triangle");
        k=Integer.parseInt(br.readLine());
        triangle3 ob=new triangle3();
        ob.decide(i,j,k);
    }
}