import java.io.*;
class String_Sort extends java.lang.Object
{
    public static void main()throws IOException
    { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer q = new StringBuffer();
        System.out.print("Enter the number of terms : ");
        int t = Integer.parseInt(br.readLine());
        String A[] = new String[t];
        System.out.print("Enter the terms : ");
        for(int i = 0; i < t; i++)
        {
            A[i] = br.readLine();
        }
        String tmp = null;
        for(int i = 0; i < t; i++)
        {
            for(int j = 0; j < t - 1; j++)
            {
                if(A[j].compareTo((A[j + 1]))>0)
                {
                    tmp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = tmp;
                }
            }
        }
        System.out.println("\fAscending Order -->");
        for(int i = 0; i < t; i++)
        {
            System.out.println("\t\t" + A[i]);
        }
    }
}