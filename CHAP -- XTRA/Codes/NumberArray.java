import java.io.*;
class NumberArray
{
    public void reverse()throws IOException
    {
        int j = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[5];
        int b[] = new int[5];
        for(int i = 0;i < 5;i++)
        {
            System.out.print("Enter the String to be reversed : ");
            a[i] = Integer.parseInt(br.readLine());
        }
        for(int i = a.length-1;i > 0;i--)
        {
            int s = a[i];
            b[j] = a[i];
            j++;
        }
        for(int i = 0;i < a.length;i++)
        {
            System.out.println("\f" + b[i]);
        }
    }

    public static void main()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        NumberArray s = new NumberArray();
        s.reverse();
    }
}        