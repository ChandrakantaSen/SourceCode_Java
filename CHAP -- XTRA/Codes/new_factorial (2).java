import java.io.*;
class new_factorial                                                                                                                                                                                                                                                                                                                        
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a,b,d=1;
            System.out.println("Enter the Range ");
            a=Integer.parseInt(br.readLine());
            for(b=1;b<=a;b++)
            {
                d=d*b;
            }
            System.out.println("Factorial is "+d);
        }
    }