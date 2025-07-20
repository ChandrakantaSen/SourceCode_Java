import java.util.*;
class replace
{
public static void main()
    {
Scanner sc=new Scanner (System.in);
System.out.println("enter a limit ");
int n=sc.nextInt();
System.out.println("Enter 10 no.s int anarray");
int a[]=new int[n];
int f=0;
for (int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
           }
      System.out.println("Enter the searching value no.");
      int m=sc.nextInt();
       int t=0;
      for (int i=0;i<n ;i++)
      {
        if(a[i]==m)
    {
       f=1;
     a[i]=0;
     break;
    }
}
       System.out.println("arrray after replace");
          for( int i=0;i<n;i++)
        {
            System.out.println(a[i]);
}
}
}
