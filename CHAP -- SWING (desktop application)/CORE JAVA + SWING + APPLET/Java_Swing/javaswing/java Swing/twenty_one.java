     import java.io.*;
     import java.lang.*;


        class procedure
           {
               int i;
               public int setValue(int a)throws Exception
                  {
                    int m=1;                       
                      while(a>0)
                        {                          
                          m=m*a;
                          a--;
                        }                            
                           return m;                   
                  }             
           }


           class consumer extends procedure
              {
                public int Result(int z)
                    {
                       int z1=z;
                       System.out.println("Multipication="+z);
                       return z;
                    }
                 
              }


               class twenty_one
                  {
       public static void main(String ar[])throws Exception
         {
             procedure p1=new procedure();
             consumer r=new consumer();
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           System.out.print("Enter Number :: ");
                try{
           int x=Integer.parseInt(br.readLine());
           System.out.println();
            p1.i=p1.setValue(x);
            r.Result(p1.i);
                    }catch(NumberFormatException e){
                     System.out.println("Multiplication value is not set");
                    }
         }
                    
                  }

