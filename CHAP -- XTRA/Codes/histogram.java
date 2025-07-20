import java.io.*;
class histogram
{
    static int noOfDig(int n)
    {   
        int dig=0;
        for(int i=n;i>0;i=i/10)
        dig++;
        return dig;
    }
    static int largestDig(int n)
    {
        int ldig=0,d;
        for(int i=n;i>0;i=i/10)
        {
            d=i%10;
            if(d>ldig)
            ldig=d;
        }
        return ldig;
    }
    static int atPos(int n,int p)
    {
        int dig=0,d=0;
        for(int i=n;i>0;i=i/10)
        {
            d=i%10;
            dig++;
            if(dig==p)
            break;
        }
        return d;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,ld,nd;
        System.out.println("Enter number");
        n=Integer.parseInt(br.readLine());
        ld=largestDig(n);
        nd=noOfDig(n);
        for(int i=0;i<ld;i++)
        {
            for(int j=0;j<nd;j++)
            {
                if(atPos(n,nd-j)>=ld-i)
                System.out.print("X");
                else
                System.out.print("  ");
            }
            System.out.println ();
        }
        System.out.print(n);
    }
}