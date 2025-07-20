import java.io.*;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
  class twentyone
    {
      public static void main(String ar[])throws Exception
        {
          char data[]={'T','h','i','s',' ','i','s',' ','t','h','e',' ','F','i','l','e',' ','c','o','n','t','e','n','t'};
          String s,s1;
           for(int i=0;i<1;i++)
              {                 
                s=ar[i];
               s1=ar[i+1];
               FileWriter f1=new FileWriter(s);
                 for(int j=0;j<data.length;j++)
                    f1.write(data[j]);
               FileWriter f2=new FileWriter(s1);
                  f2.write(data);
              f1.close();
              f2.close();
              }
        }
    }
