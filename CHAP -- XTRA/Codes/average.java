import java.io.*;
class average
{
    public static double percent(int x, int y, int z)
    {
        double r;
        r=(x+y+z)/3.0;
        return r;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        average ob = new average();
        int i,a,b,c; String s; double d;
        for(i=1;i<=5;i++)
        {
            System.out.println("Enter name and 3 subject marks ");
            s=br.readLine();
            a=Integer.parseInt(br.readLine());
            b=Integer.parseInt(br.readLine());
            c=Integer.parseInt(br.readLine());
            d=ob.percent(a,b,c);
            System.out.println("Name : "+s+" Average marks : "+d);
        }
    }
}
    