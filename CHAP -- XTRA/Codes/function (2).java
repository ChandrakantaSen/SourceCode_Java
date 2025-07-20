import java.io.*;
class function
{
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static int a,b,c;
public static void main()throws IOException
{
System.out.println("Enter the 1st number:-");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the 2nd number:-");
b=Integer.parseInt(br.readLine());
    }
    public static void add()
    {
        c=a+b;
    }
    public static void show()
    {
        System.out.println("The addition value of "+a+" and "+b+" is "+c);
    }
}

