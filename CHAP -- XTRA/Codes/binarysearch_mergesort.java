import java.io.*;
class binarysearch_mergesort
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,j,n,t,m,k,flag=0,min,mid=0,max;
        System.out.println("Enter the size of the array a :- ");
        n=Integer.parseInt(br.readLine());
        System.out.println("Enter the size of the array b :- ");
        m=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        int b[]=new int[m];
        int c[]=new int[m+n];
        for(i=0;i<n;i++)
        {
            System.out.println("\nEnter the value of the array a "+(i+1));
            a[i]=Integer.parseInt(br.readLine());
            
        }
        System.out.println("\n________________________________________");
        for(i=0;i<m;i++)
        {
            System.out.println("\nEnter the value of the array b "+(i+1));
            b[i]=Integer.parseInt(br.readLine());
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
                for(i=0;i<m;i++)
        {
            for(j=0;j<m-1;j++)
            {
        
                if(b[j]>b[j+1])
                {
                    t=b[j];
                    b[j]=b[j+1];
                    b[j+1]=t;
                }
            }
        }
                System.out.println("\n________________________________________");
                System.out.println("The numbers in the array a after  sort are : -  ");
                for(i=0;i<n;i++)
                {
                    System.out.print(a[i]+"   ");
                }
                System.out.println("\n________________________________________");
                System.out.println("\n\nThe numbers in the array b after  sort are : -  ");
                for(i=0;i<m;i++)
                {
                    System.out.print(b[i]+"   ");
                }
                /*MERGE SORT*/
                for(i=j=k=0;i<(m+n);)
                {
                    if(a[j]<=b[k])
                    {
                        c[i++]=a[j++];
                    }
                    else
                    {
                        c[i++]=b[k++];
                    }
                    if((k==m)||(j==n))
                    {
                    break;
                }
            }
            for(;j<n;)
             {
              c[i++]=a[j++];
                    }
                        for(;k<m;)
                        {
                        c[i++]=b[k++];
                    }
                System.out.println("\n________________________________________");
                System.out.println("\nThe sorted array is :-  ");
                for(i=0;i<n+m;i++)
                {
                    System.out.println(c[i]+"   ");
                }
                System.out.println("Enter the number to be searched ");
                int k1=Integer.parseInt(br.readLine());
                min=0;
                max=(m+n)-1;
                mid=0;
                while(min<=max)
                {
                    mid=(max+min)/2;
                    if(k1>c[mid])
                    {
                        min=mid+1;
                    }
                    else if(k1<c[mid])
                    {
                        max=mid-1;
                    }
                    else
                    {
                        flag=1;
                        break;
                    }
                }
            if(flag==1)
            {
                System.out.println(k1+" is found at the "+(mid+1)+"th position in the final array ");
            }
            else
            {
                System.out.println(k1+" is not found ");
            }
            flag=0;
        for(i=0;i<n;i++)
        {
            if(k1==a[i])
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println(k1+" is found at the "+(i+1)+"th position in the first array" );            
        }
        else
        {
            System.out.println(k1+" is not found in the first array . ");
        }
                flag=0;
        for(i=0;i<m;i++)
        {
            if(k1==b[i])
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println(k1+" is found at the "+(i+1)+"th position in the second array . " );            
        }
        else
        {
            System.out.println(k1+" is not found in the second array . ");
        }
    }
}


             
        

