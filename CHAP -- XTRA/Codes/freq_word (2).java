import java.io.*;
class freq_word
{                                                     
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s,st,st2,q1;
        int i,j,p=0,q=0,d=0;
        System.out.println("Enter a sentence");
        s=br.readLine();
        s=s.concat(" ");
        int l=s.length();
        q1=s;
        System.out.println("Words\t\tFrequency");
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                st=s.substring(p,i);
                p=i+1;
                q=0;
                //System.out.println(st);
                //
                for(j=0;j<q1.length();j++)
                {
                    if(q1.charAt(j)==' ')
                    {
                        st2=q1.substring(q,j);
                        q=j+1;
                        if(st2.equals(st))
                        {
                            d++;
                        }
                    }
                }
                q1=q1.replace(st,"");
                if(d>0)   
                {
                    System.out.println(st+"\t\t "+d);       
                }
                d=0;
                st2="";
            }
        }
    }
}
