/* prime number */
import java.io.*;
import java.io.DataInputStream;

  class prime
    {
      public static void main(String args[])throws Exception
        {
          int j,p;
          p=2;
          for(int i=0;i<ar.length;i++)
             {
             j=Integer.parseInt(ar[i]);
                if(j%2==0)
               System.out.println("Even");
                else
               System.out.println("Odd");

                      while(p<=j)
                         {
                           if(j%p==0)
                              {
                                break;
                              }
                              p=p+1;
                         }
                       if(p>=j)
                        System.out.println("number:: "+j+"PRIME");
                        else
                        System.out.println("number:: "+j+"NOT PRIME");

             }
        }
    }