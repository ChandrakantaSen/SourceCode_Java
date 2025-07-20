import java.io.*;
class lineararray
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        int n[]=new int[10];
        int i,s,f=0;
        for (i=0;i<10;i++)
        {
        System.out.println ("Enter a nuber");
        n[i]=Integer.parseInt (br.readLine());
    }
    System.out.println ("Enter a number to be searched");
    s=Integer.parseInt (br.readLine());
    for (i=0;i<10;i++)
    {
        if (s==n[i])
        {
            f=1;
            break;
        }
    }
    if (f==1)
    System.out.println ("Found at pocket number"+(i+1));
    else
    System.out.println ("Number is not found");
}
}

    