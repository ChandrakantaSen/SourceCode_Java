import java.io.*;
class BinarySearch_SelectionSort
{
    public static void main(String args[])throws IOException
    {
        int i,n,j,t,k,flag=0,min,max,mid;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array  ");
        n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        System.out.println("Enter the numbers in the array  ");
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
                System.out.println("The numbers arranged after Selection Sort are as follows :- ");
                for(i=0;i<n;i++)
                {
                    System.out.println(a[i]);
                }
                System.out.println("\n\nEnter the number to be searched  :-  ");
        k=Integer.parseInt(br.readLine());
        min=0;
        max=n-1;
        mid=0;
        while(min<=max)
        {
            mid=(max+min)/2;
            if(k>a[mid])
            {
                min=mid+1;
            }
            else if(k<a[mid])
            {
                max=mid-1;
            }
            else
            {
                flag=1;
                break;
            }
        }
        System.out.println(                                            );
        System.out.println(                                            );
        if(flag==1)
        {
        System.out.println(k+" is found at the "+(mid+1)+"th position ");
        }
        else
        {
        System.out.println(k+" is not found ");
    }
    }
}
                
        

