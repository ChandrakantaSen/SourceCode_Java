import java.io.*;
class merge_sort_string_mn
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,j,n,m,k;
        String t;
        System.out.println("Enter the size of the array a:- ");
        n=Integer.parseInt(br.readLine());
        System.out.println("Enter the size of the array b:- ");
        m=Integer.parseInt(br.readLine());
        String a[]=new String[n];
        String b[]=new String[m];
        String c[]=new String[n+m];
        for(i=0;i<n;i++)
        {
            System.out.println("\nEnter the name of the array a "+(i+1));
            a[i]=br.readLine();
            
        }
       System.out.println("\n________________________________________");
        for(i=0;i<m;i++)
        {
            System.out.println("\nEnter the name of the array b "+(i+1));
            b[i]=br.readLine();
        }
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i].length()>a[j].length())
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        for(i=0;i<m-1;i++)
        {
            for(j=i+1;j<m;j++)
            {
                if(b[i].length()>b[j].length())
                {
                    t=b[i];
                    b[i]=b[j];
                    b[j]=t;
                }
            }
        }
                System.out.println("\n________________________________________");
                System.out.println("The names in the array a after selection sorting are : -  ");
                for(i=0;i<n;i++)
                {
                    System.out.print(a[i]+"   ");
                }
                System.out.println("\n________________________________________");
                System.out.println("\n\nThe names in the array b after selection sorting are : -  ");
                for(i=0;i<m;i++)
                {
                    System.out.print(b[i]+"   ");
                }
                /*MERGE SORT*/
                for(i=j=k=0;i<(n+m);)
                {
                    if(a[j].length()<=b[k].length())
                    {
                        c[i++]=a[j++];
                    }
                    else
                    {
                        c[i++]=b[k++];
                    }
                    if((k==m)||(j==n))
                    {
                    break;
                }
            }
            for(;j<n;)
             {
              c[i++]=a[j++];
                    }
                        for(;k<m;)
                        {
                        c[i++]=b[k++];
                    }
                System.out.println("\n________________________________________");
                System.out.println("\nThe sorted array is :-  ");
                for(i=0;i<n+m;i++)
                {
                    System.out.println(c[i]+"   ");
                }
            }
        }