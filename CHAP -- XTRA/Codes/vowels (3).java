import java.io.*;
class vowels
{
    public static void main (String srgs[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        int l,i,j,c;
        String word;
        String str=br.readLine();
       l=str.length();
        int volno=0,maxvolno=0;
        for(i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch!=' ')
            {
                word=word+ch;
            }
            else
            {
                l=word.length();
            }
            for(j=0;j<l;j++)
            {
                c=word.charAt(j);
                if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'|| c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U')
                volno= volno+1;
                {
                    System.out.println("word="+word+"no. of vowels"+volno);
                    if(volno>maxvolno)
                    {
                        maxvolno=volno;
                    }
                    word= " ";
                    volno=0;
                }
                System.out.println("Maximum vowel word="+maxvolword);
                System.out.println("no.of vowel in that word="+maxvolno);
            }
        }
    }
}

                
            
        

