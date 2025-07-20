import java.io.*;
public class Magicsentence {
    public static void main(String args[])throws IOException
    
  {
     
      BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
       String word= " ",rev= " ";// empty string declaration
       
      
       System.out.println(" -----------------MAGIC SENTENCE --------------- ");
 
      System.out.println(" Enter the String ");
        String s=br.readLine();
        int i=0;
        s=" "+s;
        int l=s.length();
        for(i=0;i<l;i++)
        {
          char ch=s.charAt(i);
          if(ch==' ')
          {
             word=word+s.charAt(i+1); 
          }
        }
        word=word.trim();
        int l1=word.length();
        for( int m=l-1;m>0;m--)
        {
            rev=rev+word.charAt(m);
            
        }
        rev=rev.trim();
        
        if(word.equalsIgnoreCase(rev)==true)
            System.out.println("It is a Magc Sentence");
        else
            System.out.println("Not a Magic Sentence");
                    
    }
}
