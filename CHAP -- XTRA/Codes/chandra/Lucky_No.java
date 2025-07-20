import java.util.*;
class Lucky_No
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        int a[]=new int[n];        
        for(int i=0;i<n;i++)
        a[i]=i+1;
        System.out.println("The original numbers are :\n");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        System.out.println();
        int i,j,d=1;
        while(d<n)
        {
            for(i=d;i<n;i+=d)
            {            
                for(j=i;j<n-1;j++)
                   {
                     a[j]=a[j+1];
                   }
                n--;
            }
            d++;
            for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
            System.out.println();
        }
        System.out.println("\nThe lucky numbers are..\n");
        for(i=0;i<n;i++)
        System.out.print(a[i]+" ");
        
        }
    }