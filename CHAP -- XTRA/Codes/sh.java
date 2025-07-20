import java.io.*;
class sh
{
public static void  main()throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     String s,a="";
     int i,p=0,l,le,j=0,co=0;
     char c;
     System.out.println("Enter a String");
     s=br.readLine();
     s=s+" ";
     l=s.length();
     for(i=0;i<l;i++)
     {
         c=s.charAt(i);
         if(c==' ')
         {
             co++;
            }
             
        }
        String ar[]=new String[co];
        //System.out.println(co);
        for(i=0;i<l;i++)
     {
         c=s.charAt(i);
         if(c==' ')
         {
             a=s.substring(p,i);
             ar[j]=a;
             j++;
             p=i+1;
            }
                     a="";
    }
      /*for(i=0;i<co;i++)
     {
         System.out.println(ar[i]);
        }*/
        for(i=0;i<co;i++)
     {
        for(j=i+1;j<co;j++)
        { 
            if(ar[i].compareTo(ar[j])==0)
            {
                ar[j]="";
            }
        }
    }
     for(i=0;i<co;i++)
     {
         System.out.print(ar[i]+" ");
        }
    }
    }
