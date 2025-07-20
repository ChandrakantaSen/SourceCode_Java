import java.io.*;
class binary1
{
  public static void main(String args[])throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int i,n,j,t,k,min,max,mid,flag=0;
      System.out.println("Enter the size of the array : ");
      n=Integer.parseInt(br.readLine());
      int a[]=new int[n];
      System.out.println("Enter the values in the array : ");
      for(i=0;i<n;i++)
      {
          a[i]=Integer.parseInt(br.readLine());
        }
        for(i=1;i<n;i++)
        {
            for(j=0;j<n-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("The values after sorting are : ");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Enter the value to be found : ");
        k=Integer.parseInt(br.readLine());
        min=0;
        max=n-1;
        mid=0;
        while(min<=max)
        {
            mid=(max+min)/2;
            if(a[mid]>k)
            {
                max=mid-1;
            }
            else if(a[mid]<k)
            {
                min=mid+1;
            }
            else
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println(k+" is found in the "+(mid+1)+" th position");
        }
        else
        {
            System.out.println(k+" is not found in the array ");
        }
    }
}