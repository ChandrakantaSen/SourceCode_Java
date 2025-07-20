import java.io.*;
class fac
{
    void fn(int m,int f)
    {
        if(f<1)
        {
            return ;
        }
        if(m%f==0)
        {
            System.out.print(f+" ");
        }
        fn(m,f-1);
    }
    void main()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a no. :");
        int n=Integer.parseInt(buf.readLine());
        fn(n,n);
    }
}
        