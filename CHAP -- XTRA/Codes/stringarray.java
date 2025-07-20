import java.io.*;
class stringarray
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        String n[]=new String[10];
        int i,f=0;
        for (i=0;i<10;i++)
        {
        System.out.println ("Enter a name");
        n[i]=br.readLine();
    }
    System.out.println ("Enter a name to be searched");
    String s=br.readLine();
    for (i=0;i<10;i++)
    {
        if (s.equals(n[i])==true)
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

    