import java.io.*;
class Pascal_Triangl
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter the n of rows : ");
        int r = Integer.parseInt(br.readLine());
        for(int i=0;i<r;i++)
        {
            for(int k=r;k>i;k--)
            {
                System.out.print(" ");
            }
            int n = 1;
            for(int j=0;j<=i;j++)
            {                
                 System.out.print(n+" ");
                 n = n * (i - j) / (j + 1);
            }
            System.out.println();
        }
 
    }
}