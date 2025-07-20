import java.util.*; //Importing Utilization package
class Insert //Declaring class
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Input size of array :-");
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Input elements of array :-");
        for(i=0;i<n;i++)
        A[i]=sc.nextInt();
        System.out.println("Input array position where element is to be inserted :-");
        int a=sc.nextInt();
        if((a<0)||(a>=n))
        System.out.println("Position out of bounds for input array !! ");
        else 
        {
           System.out.println("Input number to be inserted :-");
           int x=sc.nextInt();
           A[a-1]=x;
           System.out.println("Array after inserting the number :-");
           for(i=0;i<n;i++)
           System.out.println(A[i]);
        }
    }
}