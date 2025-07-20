import java.io.*;
class maxVowel
{
    public static void main(String args[])throws IOException
    {
        String str,str1="",str2="";
        char b;
        int len,len1,i,j,c=0,max=0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string: ");
        str = in.readLine();
        str = str+" ";
        len = str.length();
        for(i=0;i<len;i++)
        {
            b = str.charAt(i);
            if(b!=' ')
            {
                str1 = str1 + b;
                len1=str1.length();
                for(j=0;j<len1;j++)
                {
                    b = str1.charAt(j);
                    if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u')
                    {
                        c++;
                    }
                    if(max<c)
                    {
                        max = c;
                        str2=str1;
                    }
                    c=0;
                }
                str1="";
            }
        }
        System.out.println("The maximum number of vowels in the word is: "+str2);
    }
}