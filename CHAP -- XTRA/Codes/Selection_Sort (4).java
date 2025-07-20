import java.io.*;
class Selection_Sort
{
    public static void main(String args[])throws IOException
    {
        int i,n,j,t;
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
            }
        }
    

                    
