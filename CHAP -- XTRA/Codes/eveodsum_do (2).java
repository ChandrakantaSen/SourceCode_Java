import java.io.*;
class eveodsum_do
{
     public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int i=1,n,se=0,so=0;
            System.out.println("Enter the range of the numbers  ");
            n=Integer.parseInt(br.readLine());
            do
            {
                if(i%2==0)
                {
                    se=se+i;
                    i++;
                }
                else
                {
                    so=so+i;
                    i++;
                }
            }while(i<=n);
            System.out.println("Sum of even numbers =  "+se);
            System.out.println("Sum of odd numbers =  "+so);
        }
}
            