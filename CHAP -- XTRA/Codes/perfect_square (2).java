import java.util.*;
class perfect_square
{
    static int a[]=new int[10];
    static int i;
    static double x;
    static Scanner sc=new Scanner(System.in);
    static void accept()
    {
        System.out.println("Enter the values of the array");
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The array is:-");
        for(i=0;i<10;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void calculate()
    {
        System.out.println("The new array is:-");
        for(i=0;i<10;i++)
        {
            x=Math.sqrt(a[i]);
            if(x==(int)x)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
    public static void main()
    {
        perfect_square ob=new perfect_square();
        ob.accept();
        ob.calculate();
    }
}