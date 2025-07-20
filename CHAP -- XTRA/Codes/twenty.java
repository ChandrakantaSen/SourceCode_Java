     import java.io.*;
     import java.lang.*;


        class twenty
            {
               public int setValue(int a)
                  {
                    int m=1;
                      while(a>0)
                        {
                          m=m*a;
                          a--;
                        }
                        return m;
                  }
                public int Result(int z)
                    {
                       int z1=z;
                       System.out.println("Multipication="+z);
                       return z;
                    }

       public static void main(String ar[])throws Exception
         {
           twenty tw=new twenty();
           DataInputStream in=new DataInputStream(System.in);
           System.out.print("Enter Number from 1 to 10:: ");
           int x=Integer.parseInt(in.readLine());
           System.out.println();
            int s=p1.setValue(x);
            tw.Result(s);
         }
            }


