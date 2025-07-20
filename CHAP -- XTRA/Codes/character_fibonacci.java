import java.util.*;
class character_fibonacci
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String x,y,c;
        int i,n;
        System.out.println("Enter the range");
        n=sc.nextInt();
        x="A";
        y="B";
        System.out.print(x+" "+y);
        for(i=0;i<n-2;i++)
        {
            c=y+x;
            System.out.print(" "+c);
            x=y;
            y=c;
        }
    }
}