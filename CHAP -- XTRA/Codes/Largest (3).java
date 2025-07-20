import java.io.*;
class Largest
{
    public static void main(String args[])throws IOException
    {
        int a,b,c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\n Enter the 1st number ");
        a=Integer.parseInt(br.readLine());
        System.out.print("\n Enter the 2nd number ");
        b=Integer.parseInt(br.readLine());
        System.out.print("\n Enter the 3rd number ");
        c=Integer.parseInt(br.readLine());
        {
            if((a>b)&&(a>c))
            {
                System.out.print("\n a is the largest number");
            }
            else if((b>a)&&(b>c))
            {
                System.out.print("\n b is the largest number");
            }
            else
            System.out.print("\n c is the largest number");
        }
    }
}