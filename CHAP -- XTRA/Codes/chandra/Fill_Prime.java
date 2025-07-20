import java.io.*;

class Fill_Prime
{
    public static void main()throws IOException
    {
        int n,i=0,j,p;
        int k=1,c=0;

        int a[][]=new int[10][10];
        int b[]=new int[100];
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter the range: ");
        n = Integer.parseInt(in.readLine());

        while(i < (n*n))
        {
            for(p=1;p<=k;p++)
            {
                if(k%p==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                b[i]=k;
                i++;
            }
            k++;
            c=0;
        }

        k=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=b[k];
                k++;
            }
        }

        System.out.println("Filled Array is: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}