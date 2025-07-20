import java.io.*;
class series2
{
   public static void main(String args[])
   {
       int a=1,b=0;
       for(int i=1;i<=5;i++)
       {
          for(int j=1;j<=i;j++)
          {
             if(i%2!=0)
             {
               if(j%2!=0)
                  System.out.print(a);
                else
                  System.out.print(b);
              }
              if(i%2==0)
              {
                if(j%2==0)
                     System.out.print(a);
                      else
                        System.out.print(b);
             }
           }
             System.out.println(" ");
        }
    }
}

