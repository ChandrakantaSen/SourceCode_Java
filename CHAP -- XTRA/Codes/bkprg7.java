import java.io.*;
class bkprg7
{
public static void main(String args[])throws IOException
{
String n[]=new String[5];
int t[]=new int[5];
String temp;
int i,j,k,p;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the name of the customers : - ");
for(i=0;i<5;i++)
{
n[i]=br.readLine();
    }
System.out.println("Enter the telephone numbers of the customers : - ");
for(i=0;i<5;i++)
{
t[i]=Integer.parseInt(br.readLine());
    }    
    k=0;
        for(i=0;i<5-1;i++)
              {
              for(j=i+1;j<5;j++)
               {
                while(n[i].charAt(k)==n[j].charAt(k))
                {
                 k++;   
                }
                if((int)(n[i].charAt(k))>(int)(n[j].charAt(k)))
                {
                   temp=n[i];
                   n[i]=n[j];
                   n[j]=temp;
                   p=t[i];
                   t[i]=t[j];
                   t[j]=p;
                }
                k=0;
                            }
                        }
System.out.println("The name and telephone numbers of the customers in alphabetical order are as folows : - ");
System.out.println("The name Telephone Numbers ");
for(i=0;i<5;i++)
{
System.out.println(n[i]+"\t\t\t"+t[i]);
    }                   
}
    }