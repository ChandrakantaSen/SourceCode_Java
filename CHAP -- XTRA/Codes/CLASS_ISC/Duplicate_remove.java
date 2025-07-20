import java.util.*; //Importing Utilization package
class Duplicate_remove //Declaring class
{
    int A[];
    Duplicate_remove(int n)
    {
        A=new int[n];
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array :-");
        for(int i=0;i<A.length;i++)
        A[i]=sc.nextInt();
    }
    void bubblesort()
    {
        int i,j,temp,n=A.length;
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-1-i;j++)
            {
                if(A[j]>A[j+1])
                {
                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
    }
    void display()
    {
        System.out.println("The elements of the array :");
        int c;
        for(int i=0;i<A.length;)
        {
            System.out.println(A[i]);c=A[i++];
            while((i<A.length)&&(A[i]==c))
            {
                i++;
            }
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements :-");
        int n=sc.nextInt();
        Duplicate_remove ob=new Duplicate_remove(n);
        ob.input();
        ob.bubblesort();
        ob.display();
    }
}