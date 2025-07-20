import java.io.*;
class Repeatprog1
{
   public static void main(String args[]) throws IOException
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("E N T E R    L E N G T H    OF    STRING");
       int n=Integer.parseInt(br.readLine());
       int a[]=new int[n];
       int b[]=new int[n];
       int i,j,bp=0,c=0;
       for(i=0;i<n;i++)
       {
           System.out.println("E N T E R    V A L U E");


        }
        for(i=0;i<n;i++)
        {
         c=0;
         if(i>0)
         {
             for(j=0;j<bp;j++)
             {
                 if(a[i]==b[bp])
                 break;
                }
            
                if(j<bp)
                continue;
            }
         for(j=0;j<n;j++)
         if(a[i]==a[j])
         c++;
        
        if(c>1)
        {
            b[bp]=a[i];
            bp++;
        }
        System.out.println("F R E Q U E N C Y    O F    "+a[i]+"    I S    "+c);
    }
}
    }