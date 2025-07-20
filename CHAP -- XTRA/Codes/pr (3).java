import java.io.*;
class pr
{
 int isFact(int n)
 {int fat=1;
     for(int i=1;i<=n;i++)
     { fat*=i;
        } return fat;
    }    
     void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());
        {int c=x,y,s=0;
            while(c>0)
            {
             y=c%10;
             s+=isFact(y);
             c/=10;
        }
             
             if(x==s)
             System.out.println("it is  Krishana murthyno.");
             else
             System.out.println("it is  not Krishana murthy  no.");
            }
        }
    }
