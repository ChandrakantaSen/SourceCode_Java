import java.io.*;

class highest_digit
{
    public static void main(String args[])throws IOException
    {
      int n;
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the number: ");
      n = Integer.parseInt(in.readLine());
      
      int lst = n % 10;
      n = n / 10;
      
      while(n!=0)
      {
        int d = n%10;
        if(lst<d)
        {
          lst = d;
        }
        n = n/10;
      }
      
      System.out.println("Maximum Digit is: "+lst);
    }
}