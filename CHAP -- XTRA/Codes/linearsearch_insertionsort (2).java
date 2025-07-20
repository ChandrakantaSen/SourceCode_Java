import java.io.*;
class linearsearch_insertionsort
{
    public static void main(String args[])throws IOException
    {
        int i,n,j,t=0,k,flag=0;
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
        System.out.println("\n________________________________");
                System.out.println("Enter a number to be searched :-  ");
                k=Integer.parseInt(br.readLine());
                System.out.println("\n________________________________");
                for(i=0;i<n;i++)
                {
                    if(a[i]==k)
                    {
                        flag=1;
                        break;
                    }
                }
                if(flag==1)
                {
                    System.out.println(k+" is found at the "+(i+1)+"th position" );
                }
                else
                {
                    System.out.println(k+" is not found ");
                }
            }
        }

        