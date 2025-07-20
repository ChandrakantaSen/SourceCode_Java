import java.io.*;
class Sort extends java.lang.Object
{
    public static void main()throws IOException
    { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of terms : ");
        int t = Integer.parseInt(br.readLine());
        int A[] = new int[t];
        System.out.print("Enter the terms : ");
        for(int i = 0; i < t; i++)
        {
            A[i] = Integer.parseInt(br.readLine());
        }
        int tmp = 0;
        for(int i = 0; i < t; i++)
        {
            for(int j = 0; j < t - 1; j++)
            {
                if(A[j] > A[j + 1])
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
