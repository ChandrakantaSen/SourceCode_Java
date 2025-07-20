import java.io.*;
class loop3
                                                                                                                                                                                                                                                                                                                        
    {
        public static void main(String args[])
        {
            
            int i=1,sev=0,sod=0;
            while(i<=20)
            {
                if(i%2==0)
                sev=sev+i;
                else
              sod=sod+i;
              i++;
            }
              System.out.println("sum of even number is "+sev);
            System.out.println("sum of odd number is "+sod);
        }
    }
               