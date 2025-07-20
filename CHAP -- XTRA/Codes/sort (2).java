import java.io.*;
class sort
  {
      public static void main(String args[])throws IOException
        {
            int n;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the size of the array  : - ");
            n=Integer.parseInt(br.readLine());
            String a[]=new String [n];
            int i,j,k=0;
            String temp;
            System.out.println("Enter the names in the array : - ");
            for(i=0;i<n;i++)
            {
            a[i]=br.readLine();
        }
        System.out.println("The names in the array are as follows : - ");
            for(i=0;i<5;i++)
            {
              System.out.println(a[i]);
        }
              for(i=0;i<n-1;i++)
              {
              for(j=i+1;j<n;j++)
               {
                while(a[i].charAt(k)==a[j].charAt(k))
                {
                 k++;   
                }
                if((int)(a[i].charAt(k))>(int)(a[j].charAt(k)))
                {
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
                }
                k=0;
                            }
                        }
            System.out.println("The names in the array are as follows : - ");
            for(i=0;i<5;i++)
            {
              System.out.println(a[i]);
        }
    }
}