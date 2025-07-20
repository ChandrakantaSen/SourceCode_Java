import java.io.*;
public class rearrange2
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int n,i,t,k=0,c,j,k2=0;
        System.out.println("Enter the number of integers");
        n=Integer.parseInt(in.readLine());
        int a[]=new int[n];
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter a number");
            a[i]=Integer.parseInt(in.readLine());
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(a[j]<a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        if(n/2==0)
        {
            c=(n-1)/2;
        }
        else
        {
            c=(n)/2;
        }
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            {
                arr[c+k]=a[i];
                k=k+1;
            }
            else
            {
                arr[c-k2]=a[i];
                k2=k2+1;
            }
            
        }
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

            
            
                
        
        
        
        
        
            
        