import java.io.*;
class ArrayMAXmin
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,j,min,max;
        int m[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("number dallo");
            m[i]=Integer.parseInt(br.readLine());
        }
        max=m[0];min=m[0];
        for(i=0;i<10;i++)
        {
            if(max<m[i])
            max=m[i];
            if(min>m[i])
            min=m[i];
        }
        System.out.println("max "+max);
        System.out.println("min "+min);
    }
}