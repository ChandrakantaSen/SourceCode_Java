import java.io.*;
class bubblesort
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,j;
String a[]=new String[10],temp;
System.out.println("enter 10 strings in an array");
for(i=0;i<10;i++)
{
a[i]=br.readLine();
     }
     //sorting the array
         for(i=1;i<10;i++)
         {
             for(j=0;j<10-i;j++)
             {
                 if(a[j].length()>a[j+1].length())
                 {
                     temp=a[j];
                     a[j]=a[j+1];
                     a[j+1]=temp;
                    }
                }
            }
        
        System.out.println("the array in ascending order is");
            for(i=0;i<10;i++)
            {
             System.out.println(a[i]);
            }
        }
    }
        
                
    
    