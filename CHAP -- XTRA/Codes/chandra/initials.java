import java.io.*;

class initials

{

    public static void main(String urgs[])throws IOException

    {

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        String s,t="";

        int i,l,count=0;

        char a,b=' ';

        System.out.println("Enter the name ");

        s=br.readLine();            //string input

        l=s.length();

        t+=s.charAt(0);

        for(i=0; i<l; i++)

        {

            a = s.charAt(i);

            if(a==' ')

            {

                b=s.charAt(i+1);

                t=t+'.'+b;

            }

        }//end of for

        System.out.print("The new string is = "+t);

    }//end of main()

}//end of class