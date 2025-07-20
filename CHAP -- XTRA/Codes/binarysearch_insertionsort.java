import java.io.*;
class binarysearch_insertionsort
{
    public static void main(String args[])throws IOException
    {
        int i,min,max,mid,n,j,t=0,k,flag=0;
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
System.out.print("\n___________________________________________");
        System.out.println("\nEnter a number to be searched  :-  ");
        k=Integer.parseInt(br.readLine());
        System.out.print("\n_____________________________________________");
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
            System.out.println(k+" is found at position "+(mid+1));
        }
            else
            {
                System.out.println(k+" is not found ");
            }
        }
}       
        