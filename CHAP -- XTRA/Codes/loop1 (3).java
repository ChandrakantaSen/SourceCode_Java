import java.io.*;
class loop1                                                                                                                                                                                                                                                                                                                        
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a,b,c,ch;
            System.out.println("Enter the range");
            a=Integer.parseInt(br.readLine());
            for(b=a;b>=1;b--)
            {
              System.out.println("value is "+b); 
            }
        }
    }
               