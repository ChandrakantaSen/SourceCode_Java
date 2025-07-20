import java.io.*;
class Piglatin
{
   static void main()throws IOException
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String a;int i;
       System.out.println("Enter the string");
       a=br.readLine();
       for(i=0;i<a.length();i++)
       { 
           char c=a.charAt(i);
           
           if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
           
           break;
       }
        System.out.println(a.substring(i)+a.substring(0,i)+"ay");
        System.out.flush();
   }
}