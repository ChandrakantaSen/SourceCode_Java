import java.io.*;
class merge2_Sort1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,n,t,k;
System.out.println("Enter the size of the array :-");
n=Integer.parseInt(br.readLine ());
int a[]=new int[n];
int b[]=new int[n];
int c[]=new int[n+n];
System.out.println("Enter the numbers in an arrary A : - ");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine ());
    }
System.out.println("The values in the array A are as follows : -");  
for(i=0;i<n;i++)
    {
        System.out.println(a[i]);
    }
   System.out.println("Enter the numbers in an arrary B : - ");
for(i=0;i<n;i++)
{
b[i]=Integer.parseInt(br.readLine ());
    }
System.out.println("The values in the array B are as follows : -");  
for(i=0;i<n;i++)
    {
        System.out.println(b[i]);
    } 
       /**starting of sorting the array**/
       for(i=0;i<n;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
                if(b[j]>b[j+1])
                {
                    t=b[j];
                    b[j]=b[j+1];
                    b[j+1]=t;
                }
            }
        }
             System.out.println("______________________________________________________");
                System.out.println("The numbers in the array A after  sorting are : -  ");
                for(i=0;i<n;i++)
                {
                    System.out.println(a[i]+" ");
                }
             System.out.println("_______________________________________________________");
                 System.out.println("The numbers in the array B after  sorting are : -  ");
                for(i=0;i<n;i++)
                {
                    System.out.println(b[i]+" ");
                }
               System.out.println("______________________________________________________");
               /****Starting of Merge Sort****/
                for(i=j=k=0;i<(n+n);)
                {
                    if(a[j]<=b[k])
                    {
                        c[i++]=a[j++];
                    } 
                    else
                    {
                        c[i++]=b[k++];
                    }
                    if((k==n)||(j==n))
                    {
                    break;
                }
            }
            for(;j<n;)
             {
              c[i++]=a[j++];
                    }
                        for(;k<n;)
                        {
                        c[i++]=b[k++];
                    }
               System.out.println("The sorted array is :-  ");
                for(i=0;i<n+n;i++)
                {
                    System.out.println(c[i]);
                }
            }
        }

       
        