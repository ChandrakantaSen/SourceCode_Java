import java.io.*;
public class disc
    {
        public static void main(String args[])throws IOException
        {
            InputStreamReader read=new InputStreamReader(System.in);
            BufferedReader in=new BufferedReader(read);
            int days;
            double amt=0.0;
            char ch;
            double dis,sp;
            System.out.println("Enter the number of days within which the bill has to be payed");
            days=Integer.parseInt(in.readLine());
            
            System.out.println("Enter the amount of purchase");
             amt=Double.parseDouble(in.readLine());
             System.out.println("Type of customer D for dealer and R for retailer");
            ch=(char)(in.read());
             
            switch(ch)
            {
                case 'D':
               
                if(days<=30)
                {
                    dis=(15/100.00)*amt;
                    sp=amt-dis;
                }
                else if((days>30)&&(days<=45))
                {
                    dis=(10/100.00)*amt;
                    sp=amt-dis;
                }
                else if((days>45)&&(days<=60))
                {
                    dis=(5/100.00)*amt;
                    sp=amt-dis;
                }
                else
                {
                    dis=0;
                    sp=amt;
                }
                System.out.println("Discount="+dis);
                System.out.println("Amount to be payed="+sp);
                break;
                case 'R':
                
                if(days<=30)
                {
                    dis=(10/100.00)*amt;
                    sp=amt-dis;
                }
                else if((days>30)&&(days<=45))
                {
                    dis=(5/100.00)*amt;
                    sp=amt-dis;
                }
                else if((days>45)&&(days<=60))
                {
                    dis=(2/100.00)*amt;
                    sp=amt-dis;
                }
                else
                {
                    dis=0;
                    sp=amt;
                }
                System.out.println("Discount="+dis);
                System.out.println("Amount to be payed="+sp);
                break;
                default:
                {
                System.out.println("Please check your input");
            }
        }
    }
}
            
                
            
                
                
                    
                    
                    
            
                   
                
           
        