import java.io.*;
class LinearSearch
{
    public static void main(String args[])throws IOException
    {
        int flag=0,sh=0;
        int m[]=new int[10];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Array:");
        for (int i=0;i<10;i++)
        {
        m[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("enter the element to be searched");
        sh=Integer.parseInt(br.readLine());
        for(int i=0;i<10;i++)
        {
            if(m[i]==sh)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        System.out.println("MiLL Gaya");
        else
        System.out.println("Jaaa Nhi MiLLa");
    }
}
        
        
        