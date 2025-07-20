import java.io.*;
public class A_H_Mark
{
   public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int [50],g=0,w=0,t=0;
        String name[]=new String[50];
        for(int i=0;i<=49;i++)
        {
            System.out.print("Enter the name ");
            name[i]=br.readLine();
            System.out.print("Enter the number ");
            a[i]=Integer.parseInt(br.readLine());
        }
        w=a[0];
        for(int i=0;i<=49;i++)
        {
            if(a[i]>w)
            {
                w=a[i];
                t=i;
            }
            g=a[i]+g;
        }
        double avarage=g/5;
        System.out.println("Avarage = "+avarage);
        System.out.println(name[t]+" got the highest marks "+w+" .");
    }
}