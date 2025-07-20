import java .io.*;
class perfectSqure
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter the size of Array");
        n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        System.out.println("Enter the values in Array");
         for(int i=0;i<n;i++)
         {
             a[i]=Integer.parseInt(br.readLine());
            }
            System.out.println("perfectSquare of number");
            for(int i=0;i<n;i++)
            {
                for(int j=1;j<=a[i];j++)
                {
                    if(a[i]==j*j)
                    {
                        System.out.println(a[i]+",");
                    }
                }
            }
        }
    }