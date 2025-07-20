import java.io.*;
class String_Frequency
{
public static void main (String args[]) throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
String s,p="  ";
int i,j=0,l,c=0,fr=0,flag=0;
System.out.println ("Enter any text");
s=br.readLine();
s=s+" ";
l=s.length();
for (i=0;i<1;i++)
{
if (s.charAt(i)==' ') 
{
    c++;
}
    }
    String a[]=new String [c];
    for (i=0;i<1;i++)
    {
        if (s.charAt(i)!=' ')
        {
            p=p+s.charAt(i);
        }
        else
        {
            a[j++]=p;
            p=" ";
        }
    }
    int k;
    System.out.println (" WORDS \t FREQUENCY ");
    for (i=0;i<j;i++)
    {
        for (k=0;k<j;k++)
        {
            if (a[i].equals (a[k]))
            {
                fr++;
            }
        }
        for (k=i-1;k>=0;k--)
        {
             if (a[i].equals (a[k]))
             {
                 flag=1;
                }
            }
            if (flag!=1)
            {
                System.out.println (a[i]+"      "+fr);
            }
            fr=0;
            flag=1;
        }
    }   
}