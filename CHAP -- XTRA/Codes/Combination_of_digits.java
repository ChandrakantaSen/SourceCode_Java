import java.io.*;
class Combination_of_digits
{
    static int largestNo(int n)
    {   int d=0,max=0,i,j,last=10,ret=0,count=0;
        for(i=n;i>0;i/=10)
        {   max=0;count=0;
            for(j=n;j>0;j/=10)
            {
                d=j%10;
                if(d>max&&d<last)
                max=d;
            }
            for(j=n;j>0;j/=10)
            {
                d=j%10;
                if(d==max)
                count++;
            }
            for(j=1;j<=count;j++)
            {
                ret=ret*10+max;
                last=max;
            }
        }
        return ret;
    }
    static void comb(int n)
    {   System.out.println("the combinations of "+n+" are:-");
        int max=largestNo(n);
        for(int i=max;i>0;i--)
        {
            if(largestNo(i)==max)
            System.out.println(i);
        }
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter number to find combination");
        n=Integer.parseInt(br.readLine());
        comb(n);
    }
}