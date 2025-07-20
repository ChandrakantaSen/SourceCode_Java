import java.io.*;
import java.lang.*;
class String_proj
{
    
    public static void main(String args[]) throws IOException 
    {
      int l;
      boolean ans=true;       // boolean variable initialized  
      String s;
      while(ans==true)
      {
       // System.out.println("\f\t\t        <<< STRING PROJECT >>>");
        //System.out.println("\t-----------------------------------------------------------");   
        //System.out.println();
        System.out.println("\t\t\t 1.   Upper Case ");
        System.out.println();
        System.out.println("\t\t\t 2.   Lower Case ");
        System.out.println();
        System.out.println("\t\t\t 3.   No of Words ");
        System.out.println();
        System.out.println("\t\t\t 4.   No of Vowels ");
        System.out.println();
        System.out.println("\t\t\t 5.   No of Characters ");
        System.out.println();
        System.out.println("\t\t\t 6.   Replace a Substring ");
            
        System.out.println("       ENTER your choice ....");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        String s1=br.readLine();     
                      
        int n=Integer.parseInt(s1);
                
        switch(n)    
        {
          case 1:         // convert to uppercase
            System.out.println("ENTER A SENTENCE ...."); 
            BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
            s=br1.readLine();
            System.out.println(s.toUpperCase());
            break;
      
          case 2:       // convert to lowercase
            System.out.println("ENTER A SENTENCE ....");
            BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
            s=br2.readLine();
            System.out.println(s.toLowerCase());
            break;

          case 3:      // count number of words in a sentence
            System.out.println("ENTER A SENTENCE ....");
            BufferedReader br3=new BufferedReader(new InputStreamReader(System.in));
            s=br3.readLine();
            l=s.length();
            int d=0;
            for(int i=0;i<l;i++)
            {
                 char c=s.charAt(i);
                 if(c==' ')
                 d=d+1;
            }
            System.out.println(" The number of words are "+(d+1));
            break;
         
          case 4:            // count no of vowels
            System.out.println("ENTER A SENTENCE ....");
            BufferedReader br4=new BufferedReader(new InputStreamReader(System.in));
            s=br4.readLine();
            l=s.length();
            int vow=0;
            for(int i=0;i<l;i++)
            {
                char c=s.charAt(i);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                    vow=vow+1;
            }
            System.out.println(vow);
            break;
        
          case 5:     // count no of characters in a sentence
            System.out.println("ENTER A SENTENCE ");
            BufferedReader br5=new BufferedReader(new InputStreamReader(System.in));
            s=br5.readLine();
            l=s.length();
            int d1=0;
            for(int i=0;i<l;i++)
            {
                char c=s.charAt(i);
                if(c==' ')
                    d1=d1+1;
            }
            int c1=l-d1;
            System.out.println(" The number of characters are "+c1);
            break;

          case 6:     // substring replacement
            System.out.println("ENTER A SENTENCE ");
            BufferedReader br6=new BufferedReader(new InputStreamReader(System.in));
            String str3=br6.readLine();
            System.out.println("Enter Substring to be Replaced: ");
            BufferedReader br7=new BufferedReader(new InputStreamReader(System.in));
            String s2=br7.readLine();
            int ch = str3.indexOf(s2);
            if(ch<0)
            {
                System.out.println("Substring not found. ");
                break;
            }
            System.out.println("Enter NEW Substring : ");
            BufferedReader br8=new BufferedReader(new InputStreamReader(System.in));
            String s3=br8.readLine();
            int ls1=str3.length();
            int ls2=s2.length();
            String fp = str3.substring(0,ch);   
                        
            String ep = str3.substring(ch+ls2,ls1);
                        
            String ne = fp+s3+ep;
            System.out.println("New sentence is:");
            System.out.println("   "+ne);
            break;
        
          default:
            System.out.println("Please choose correct option number");
            break;
       }  // end of switch case
       
       System.out.print(" Press y to continue else press n for exit  ");
       BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
       String si= bi.readLine();
       ans=(si.charAt(0)=='y'||si.charAt(0)=='Y')? true: false;
     
     }
     System.out.println("\n Good Bye"); 
   }

}
