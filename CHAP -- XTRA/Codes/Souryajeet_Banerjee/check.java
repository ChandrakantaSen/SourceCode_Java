    import java.io.*;
    class check
    {
        void input()throws IOException
        {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence");
        String s=br.readLine();
        System.out.println("Enter the letter ");
        char a=(char)br.read();
        int len=s.length();int c=0;char x;
        for(int i=0;i<=len;i++)
        {
            x=Character.toLowerCase(s.charAt(i));
            if(x==a)
            {
                c=c+1;
            }
        }
        System.out.println("Frequency of the letter  "+a+" in the sentence "+s+" is "+c);
    }
}