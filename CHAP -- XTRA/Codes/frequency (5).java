import java.io.*;
class frequency
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String st;
        int l,i,j,flag=0,fr=0;
        System.out.println("Enter a sentence:");
        st=br.readLine();
        l=st.length();
        System.out.println("Characters \t Frequency");
        for(i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
            if(st.charAt(i)==st.charAt(j))
            fr=fr+1;
            for(j=i-1;j>=0;j--)
            if(st.charAt(i)==st.charAt(j))
            flag=1;
            if(flag!=1)
            System.out.println(st.charAt(i)+"\t\t"+fr);
            fr=0;
            flag=0;
        }
    }
}