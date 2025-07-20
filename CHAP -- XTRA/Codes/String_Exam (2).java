import java.io.*;
class String_Exam
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s,k="",c="",p="",d="";
        int l,i;
        char ch;
        System.out.println("Enter a word :  ");
        s=br.readLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if((ch=='a')||(ch=='A')||(ch=='e')||(ch=='E')||(ch=='i')||(ch=='I')||(ch=='o')||(ch=='O')||(ch=='u')||(ch=='U'))
            {
                k=s.substring(0,i);
                p=s.substring(i);
                c=p+k;
                d=c.concat("y");
                break;
            }
            
        }
        System.out.println(d);
    }
}
        
