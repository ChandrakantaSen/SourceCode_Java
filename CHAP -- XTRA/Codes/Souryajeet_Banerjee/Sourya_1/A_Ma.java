import java.io.*;
class A_Ma
{
    public static void main(String args[])throws IOException
    {
        String  s[]=new String [5];
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int [5],m=0,w;
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter the name: ");
            s[i]=br.readLine();
            System.out.print("Enter the computer marks ");
            a[i]=Integer.parseInt(br.readLine());
        }
        w=a[0];
        for(int i=0;i<5;i++)
        {
            if(a[i]>w)
            {
                w=a[i];
                m=i;
            }
        }
        System.out.print(s[m]+"the highest marks "+w+".");
    }
}