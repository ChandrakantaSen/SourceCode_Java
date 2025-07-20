import java.io.*;
class s1
{
 public static void main()throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     String s;
     int l,i,co=0;
     char c;
     System.out.println("Enter a string");
     s=br.readLine();
     l=s.length();
     for(i=0;i<l;i++)
     {
         co=0;
         c=s.charAt(i);
         if(c==' ')
         {
             co=0;
            }
            else
            {
                co++;
            }
            System.out.println("frequency of c="+co);
            
        }
    }
}

           