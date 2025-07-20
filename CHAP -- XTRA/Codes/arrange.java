
import java.io.*;
class arrange
{
 public static void main()throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     String s,a;
     int i,l,le,j,k=0,t=0,p=0;

     System.out.println("Enter a string");
     s=br.readLine();
     l=s.length();
     s=s+" ";
     for(i=0;i<l;i++)
     {
         if(s.charAt(i)==' ')
         {
             a=s.substring(p,i);
             le=a.length();
             if(le<t)
             {
                 t=le;
                 
                }
               System.out.println(le);
            }
            p=i+1;    
    }
        
    }
}

             
             

             
             

            
        
    

             
