import java.io.*;
class arr_ex_1
{
    public static void main()throws IOException
    {
        int i,j,freq=0,l,u;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter no of elements in the array");
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        System.out.println("enter elements of the array");
        for(i=0;i<n;i++)
            a[i]=Integer.parseInt(br.readLine());
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    a[j]=a[j]+a[j+1];
                    a[j+1]=a[j]-a[j+1];
                    a[j]=a[j]-a[j+1];
                }
            }
        }
        System.out.println("Number\t\tFrequency");
        for(i=0;i<n;i++)
        {System.out.print(a[i]);j=a[i];
            while(a[i]==j)
            {
                freq++;i++;
                if(i==n)
                {
                     System.out.println("\t\t"+freq);
                     System.exit(0);
                    }
            }
            System.out.print("\t\t"+freq);
            System.out.println();
            freq=0;
        }
    }
}