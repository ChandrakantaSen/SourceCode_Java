import java.io.*;
class insertion_sort
{
    public static void main(String args[])throws IOException
    {
        int i,n,j,t=0,k;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array ");
        n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("The number in the "+(i+1)+" array ");
            a[i]=Integer.parseInt(br.readLine());
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                if(a[j]>a[i])
                {
                    t=a[j];
                    a[j]=a[i];
                    for(k=i;k>j;k--)
                    {
                    a[k]=a[k-1];
                }
                    a[k+1]=t;
                    }
                }
        }
        System.out.println("The sorted array is  ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+"   ");
        }
    }
}
        