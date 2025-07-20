import java.io.*;
class sorting_string
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a[]=new String [10];
        System.out.println("enter the name of ten people");
        for(int i=0;i<10;i++)
        {
            a[i]=br.readLine();
        }
        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
               if(a[i].compareTo(a[j])>0)
               {
                   String t=a[i];
                   a[i]=a[j];
                   a[j]=t;
                }
            }
        }
           for(int i=0;i<10;i++)
        {
            System.out.print(""+a[i]);
        }
}
}