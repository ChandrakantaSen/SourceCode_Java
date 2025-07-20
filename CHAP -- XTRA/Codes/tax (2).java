package All;

import java.io.*;
public class tax
    {
        public static void main(String args[])throws IOException
        {
            InputStreamReader read=new InputStreamReader(System.in);
            BufferedReader in=new BufferedReader(read);
            double sal,sav,it,ti;
            System.out.println("Enter the monthly salary");
            sal=Integer.parseInt(in.readLine());
            System.out.println("Enter the monthly savings");
            sav=Integer.parseInt(in.readLine());
            if(sal<=100000)
            {
                it=0;
                ti=sal;
            }
            else if((sal>100000)&&(sal<=150000))
            {
                it=(10/100.00)*(sal-100000);
                ti=sal-it;
            }
            else if((sal>150000)&&(sal<=250000))
            {
                it=5000+(20/100.00)*(sal-150000);
                ti=sal-it;
            }
            else
            {
                it=25000+(30/100.00)*(sal-250000);
                ti=sal-it;
            }
            System.out.println("Taxable income="+ti);
            System.out.println("Income tax="+it);
            if(ti>1000000)
            {
                System.out.println("Surcharge="+(10/100.00)*sal);
            }
            if(sav<15000)
            {
                System.out.println("Rebate in tax="+(20/100.00)*sav);
            }
            if(sav>15000)
            {
                System.out.println("Rebate in tax="+(20/100.00)*15000);
            }
            System.out.println("Enducation cess="+(2/100.00)*it);
        }
        
    }
    
                
            
            
               
            
            
        