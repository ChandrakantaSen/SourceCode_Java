import java.io.*;
class Bill
{
    public static void main(String args[])throws IOException
    {
        int n,t=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\n Number of calls= ");
        n=Integer.parseInt(br.readLine());
        {
            if((n>0)&&(n<=100))
            {
                t=200;
            }
            else if((n>100)&&(n<=300))
            {
                t=200+((n-100)*2);
            }
            else if((n>300)&&(n<=500))
            {
                t=200+(200*2)+((n-300)*3);
            }
            else if(n>500)
            {
                t=200+(200*2)+(200*3)+((n-500)*5);
            }
            System.out.print("\n Total amt "+t);
        }
    }
}