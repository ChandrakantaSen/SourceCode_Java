import java.io.*;
public class vowels
{
 public static void main(String args[])throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter the string");
     String s=br.readLine();
     int l=s.length();int v=0;char w;
     for(int i=0;i<l;i++)
     {  
          w=s.charAt(i);
        
        if((w=='a')||(w=='e')||(w=='i')||(w=='o')||(w=='u'))
            v++;
        
    } System.out.println("The number of vowels are="+v);
}
}

            