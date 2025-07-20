import java.io.*;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.DataInputStream;
import java.io.OutputStreamWriter;
  class twentytwo
    {
      public static void main(String ar[])throws Exception
        {
     DataInputStream in=new DataInputStream(System.in);         
          int x;
               int a[]={'3','4','5','6','7','8','9'};
               FileWriter w=new FileWriter("data.dat");
               FileWriter w1=new FileWriter("even.dat");
               FileWriter w2=new FileWriter("odd.dat");
                 for(int j=0;j<a.length;j++)
                     {
                       try{
                    w.write(a[j]);
                         if(a[j]%2==0)
                           {               
                        w1.write(a[j]);
                           }
                          else
                           {
                          w2.write(a[j]);
                           }
                          }catch(Exception e){}
                     }

               w.close();
               w1.close();
               w2.close();
        }
    }
