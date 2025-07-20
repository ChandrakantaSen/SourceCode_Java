import java.io.*;
class merge_sort
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,j,n,t,k;
        System.out.println("Enter the size of the array :- ");
        n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n+n];
        for(i=0;i<n;i++)
        {
            System.out.println("\nEnter the value of the array a "+(i+1));
            a[i]=Integer.parseInt(br.readLine());
            
        }
       //System.out.println("\n________________________________________");
        for(i=0;i<n;i++)
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
                for(i=0;i<n;i++)
                {
                    System.out.print(b[i]+"   ");
                }
                /*MERGE SORT*/
                for(i=j=k=0;i<(n+n);)
                {
                    if(a[j]<=b[k])
                    {
                        c[i++]=a[j++];
                    }
                    else
                    {
                        c[i++]=b[k++];
                    }
                    if((k==n)||(j==n))
                    {
                    break;
                }
            }
            for(;j<n;)
             {
              c[i++]=a[j++];
                    }
                        for(;k<n;)
                        {
                        c[i++]=b[k++];
                    }
               // System.out.println("\n________________________________________");
                System.out.println("\nThe sorted array is :-  ");
                for(i=0;i<n+n;i++)
                {
                    System.out.println(c[i]+"   ");
                }
            }
        }
            
        

