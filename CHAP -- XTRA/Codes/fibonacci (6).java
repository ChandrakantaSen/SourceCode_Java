import java.io.*;
class fibonacci
{
    void fibo(int n)
    {
        int f0=0,f1=1,f2=2,i;
        for(i=3;i<=n;i++)
        {
            f2=f0+f1;
            f0=f1;
            f1=f2;
            System.out.println("f2");
        }
    }
    public static void main(String args[])throws IOException
    {
        int m;
        BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
        m=Integer.parseInt(Br.readLine());
        fibonacci obj=new fibonacci();
        obj.fibo(m);
    }
}
    

        






        