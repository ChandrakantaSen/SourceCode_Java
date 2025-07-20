import java.io.*;
class pali
{
public static void main(String args[])throws IOException
{
    
    
    BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
    String line;
    char a[]=new char[15];
    char b[]=new char[15];
    int i,k,l,c,j,p;
    i=0;l=0;k=0;c=0;p=0;j=0;
    System.out.println("\nEnter a line : ");
    
    line.concat(line," ");
    l=strlen(line);
    for (i=0;i<=l;i++)
    {
      if (line[i]!=' ')
         a[k++]=line[i];
      else
      { a[k]='\0';
        p=strlen(a);
        for(j=p-1;j>=0;j--)
         {  b[c++]=a[j];
         }
          b[c]='\0';
         if (strcmpi(a,b)==0)
          { printf("\n %s",b);}
         k=0;c=0;

      }
    }
    getch();
}
    }