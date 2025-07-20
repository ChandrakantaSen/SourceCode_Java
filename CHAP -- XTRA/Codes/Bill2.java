import java.io.*;
class Bill2
{
    public static void main(String args[])throws IOException
    {
        int n;
        double amt=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\n Number of units used = ");
        n=Integer.parseInt(br.readLine());
        {
            if((n>0)&&(n<=75))
            {
                amt=1.50*n;
            }
            else if((n>75)&&(n<=150))
            {
                amt=((75*1.50)+((n-75)*2));
            }
            else if((n>150)&&(n<=250))
            {
                amt=(75*1.50)+(75*2)+((n-100)*3);
            }
            else
            {
                amt=(75*1.50)+(75*2)+(100*3)+((n-250)*4);
                amt=(double)(((10/100)*amt)+amt);
            }
            System.out.print("\n Total Amount = "+amt);
        }
    }
}