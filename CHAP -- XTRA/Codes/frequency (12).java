import java.io.*;
class frequency
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string ");
        String s=br.readLine();int a=0;
        int l=s.length();
             String word=" ";
             for(int i=97;i<=122;i++)
             {
                 for( i=0;i<l;i++)
                 {
                     char c=s.charAt(i);
                     if(c==" ")
                     {
                         continue;
                        }else
                     if((int)(c)==i)
             {
             word=word+c;
            }
        }}
        
            if(c>1)
             {
              a++;
             System.out.println("character present ="+a);
            }
            else
             {
                 System.out.println("character present 1 times");
            }
        
            
        }
    }
    

            