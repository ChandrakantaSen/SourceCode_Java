import java.io.*;
class uniquenumber
{
 public static void main(String args[])throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int n,rem,i,j,b,k,c,flag;
     int ch[]=new int[10];
     System.out.println("Enter a number to check whether it is unique or not ");
     n=Integer.parseInt(br.readLine());
                    flag=0;
                 c=0;
                 j=0;
                 b=n;
                 while(b>0)
                 {
                rem=b%10;
                b=b/10;
                c++;
                ch[j]=rem;
                j++;
            }
         for(k=0;k<c-1;k++) 
            {
         for(j=k+1;j<c;j++)
                {
                if(ch[k]==ch[j])
                {
                    flag=1;
                    break;
                }
        
            }
        }
        if(flag==0)
        {
     System.out.println(n+" is an unique number");                        
    }
    else
    {
     System.out.println(n+" is not an unique number");                        
        }
    }
}

