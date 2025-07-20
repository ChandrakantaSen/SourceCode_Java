import java.io.*;
public class trianglee
{
    void check(int n,int m,int o)
    {
        if(n==m&&m==o&&o==n)
        {
            System.out.print("Equlateral triangle:");
        }
        else if(n==m||m==o||o==n)
        {
            System.out.print("Isocelus triangle:");
        }
        else if(n!=m&&m!=o&&o!=n)
        {
            System.out.print("Scalene triangle:");
        }
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int g,h,i;
        System.out.print("Enter the number{g}:- ");
        g=Integer.parseInt(br.readLine());
        System.out.print("Enter the number{h}:- ");
        h=Integer.parseInt(br.readLine());
        System.out.print("Enter the number{i}:- ");
        i=Integer.parseInt(br.readLine());
        trianglee ob=new trianglee();
        ob.check(g,h,i);
    }
}