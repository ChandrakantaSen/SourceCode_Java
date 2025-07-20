import java.io.*;
class special
{
 public static void main(String args[])throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int a,j=0,x=0,y=0,z=0;
     char i=' ';
     System.out.println("ENTER A SENTENCE");
     String s=br.readLine();
     int l=s.length();
      
     for(j=0;j<l;j++)
     {
    i= s.charAt(j);
     a=(int)i;
     
         if(a>=97 && a<=122)
         {
         x=x+1;
        
        }
        else if(a>=65 && a<=90)
         {
        y=y+1;
         
        }
         else
         {
        z++;
        
        }
        
        } 
         System.out.println("lower case="+x);
         System.out.println("upper case="+y);
          System.out.println("special characters="+z);
    }
}