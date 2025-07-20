import java.io.*;
class ArrayReverse
{
    public static void main(String args[])throws IOException
    {
        int j;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int[5];
        
        
        for(int i=0;i<5;i++)
        {
            System.out.println("Number Dallo");
        a[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("the reverse Array is : ");
            for( j=4;j>=0;j--)
            {
                System.out.println(" "+a[j]);
            }
            
        }
    }
        
        