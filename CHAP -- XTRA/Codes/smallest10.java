import java.util.*;
class smallest10
{
    public static void main(String args[])
    {
        int min=1000000,n,i;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the ten numbers");
        for(i=1;i<=10;i++)
        {
           n=in.nextInt();
           if(min>n)
           {
               min=n;
            }
        }
        System.out.println("smallset number is"+min);
    }
}
           
