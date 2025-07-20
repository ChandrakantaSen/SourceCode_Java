import java.io.*;
class linearsearch_bubblesort
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,k,flag=0,j,n,t;
        System.out.println("Enter the size of the array :- ");
        n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the numbers in the array  "+(i+1));
            a[i]=Integer.parseInt(br.readLine());
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
        System.out.println("The numbers in the array after bubble sort are as follows : -  ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+"    ");
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
