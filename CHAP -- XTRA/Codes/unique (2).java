import java.io.*;
class unique
{
 public static void main()throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int m,n,rem,i,j,c=100,b,k,flag;
     int ch[]=new int[c];
     System.out.println("Enter a number");
     m=Integer.parseInt(br.readLine());
     System.out.println("Enter a number");
     n=Integer.parseInt(br.readLine());
   System.out.println("The unique numbers from "+m+" to "+n+" are as follows : ");
             for(i=m;i<=n;i++)
             {
                 flag=0;
                 c=0;
                 j=0;
                 b=i;
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
     System.out.println(i);                        
    }
        }
    }
}

    