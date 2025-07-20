import java.util.*;
class Array_merge
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int A[]=new int[5];
        int B[]=new int[4];
        int i;
        System.out.println("Enter 5 even numbers :");
        for(i=0;i<5;i++)
        A[i]=sc.nextInt();
        System.out.println("Enter 4 odd numbers :");
        for(i=0;i<4;i++)
        B[i]=sc.nextInt();
        int C[]=new int[4+5];
        for(i=0;i<5;i++)
        C[i]=A[i];
        for(i=0;i<4;i++)
        C[5+i]=B[i];
        System.out.println("The third array is as follows :");
        for(i=0;i<C.length;i++)
        {
            System.out.println(C[i]);
        }
    }
}