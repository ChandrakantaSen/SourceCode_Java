package All;

import java.io.*;
public class sales
    {
        public static void main(String args[])throws IOException
        {
            InputStreamReader read=new InputStreamReader(System.in);
            BufferedReader in=new BufferedReader(read);
            int i,s;
            double ta,com;
            for(i=1;i<=100;i++)
            {
                System.out.println("Enter the Sales");
                s=Integer.parseInt(in.readLine());
                if((s>=0)&&(s<=50000))
                {
                    com=0;
                    ta=(2/100.00)*s;
                }
                else if((s>50000)&&(s<=100000))
                {
                    com=(10/100.00)*s;
                    ta=(5/100.00)*s;
                }
                else if((s>100000)&&(s<=150000))
                {
                    com=(12/100.00)*s;
                    ta=(8/100.00)*s;
                }
                else
                {
                    com=(15/100.00)*s;
                    ta=(10/100.00)*s;
                }
                System.out.println("Commission="+com);
                System.out.println("Travelling Allowance="+ta);
            }
        }
    }
            
            
                
                    
                