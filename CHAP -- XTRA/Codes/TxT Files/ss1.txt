import java.io.*;
public class SS
{
  public static void main(String args[])throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int i,j,t,beg,mid,end,no;boolean found=false;
      int A[]=new int[10];
      for(i=0;i<10;i++)
      {
          System.out.println("Enter a number");
          A[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the number to be search");
        no=Integer.parseInt(br.readLine());
        for(i=0;i<10;i++)
        {
            for(j=0;j<9-i;j++)
            {
                if(A[j]>A[j+1])
                {
                    t=A[j];
                    A[j]=A[j+1];
                    A[j+1]=t;
                }
            }
        }
        beg=0;
        end=9;
        mid=(beg+end)/2;
        while(mid>=beg)
        {
            if(A[mid]==no)
            {
                found=true;
               break;
            }
            else if(A[mid]>no)
            {
                beg=mid+1;
            }
            else if(A[mid]<no)
            {
                end=mid-1;
            }
            mid=(beg+end)/2;
        }
        if(found==true)
        {
            System.out.println("number is present");
        }
        else 
        {
          System.out.println("number not present");
         }
    }
    }