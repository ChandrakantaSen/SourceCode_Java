import java.io.*;
class retur1
{
    public static int add(int x,int y,int z)
    {
        return (x+y+z);
    }
      public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        retur1 obj=new retur1();
        int a,b,c,d;
        System.out.print("\nEnter the first number : -  ");
        a=Integer.parseInt(br.readLine());
        System.out.print("\nEnter the second number : -  ");
        b=Integer.parseInt(br.readLine());
        System.out.print("\nEnter the tisra number : -  ");
        d=Integer.parseInt(br.readLine());
        c=add(a,b,d);
        System.out.println(c);
    }
}