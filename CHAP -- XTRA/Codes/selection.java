import java.io.*;
class selection
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int temp=0,i,j;
int a[]=new int[10];
System.out.println("Enter the values in the array");
for(i=0;i<10;i++)
{
a[i]=Integer.parseInt(br.readLine());
     }
     for(i=0;i<10-1;i++)
         {
             for(j=i+1;j<10;j++)
             {
                 if(a[i]>a[j])
                 {
                     temp=a[i];
                     a[i]=a[j];
                     a[j]=temp;
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