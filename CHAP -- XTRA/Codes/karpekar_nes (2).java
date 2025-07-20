import java.io.*;
class karpekar_nes
{
    static int i,n,m,d,s; 
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void input()throws IOException
    {
        System.out.println("Enter the  range : - ");
        n=Integer.parseInt(br.readLine());
    } 
    public static void karpekarshow()
    {
        System.out.println("karpekar numbers are as follows :- ");
        for(i=1;i<=n;i++)
        {
            m=i;
            d=1;
            s=i*i;
            while(m>0)
            {
                d=d*10;
                m=m/10;
            }
            if((s%d)+(s/d)==i)
            {
                System.out.println(i);
            }
        }
    }
    public static void main()throws IOException
    {
        karpekar_nes ob=new karpekar_nes();
        ob.input();
        ob.karpekarshow();
           }
}