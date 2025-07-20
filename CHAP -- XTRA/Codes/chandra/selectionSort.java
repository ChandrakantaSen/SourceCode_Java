import java.util.*;
class selectionSort
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10");
        int a[]=new int[10];
        int i;
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        int min=0,j,k;

        for(i=0;i<10;i++)
        {
            for(j=i;j<10;j++)
            {
                if(a[i]>a[j])
                {
                    k=a[i];
                    a[i]=a[j];
                    a[j]=k;
                }
            }
        }

        for(i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}