import java.io.*;
class Linearsearch_Selectionsort
{
    public static void main(String args[])throws IOException
    {
        int i,n,j,t,k,flag=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array  ");
        n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("\n\nEnter the numbers in the array  "+(i+1));
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
                System.out.println("\n\nThe numbers arranged after Selection Sort are as follows :- ");
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


            
        
    

                    