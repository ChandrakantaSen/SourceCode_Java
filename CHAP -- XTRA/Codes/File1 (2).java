/*Modifying to include total and percentage*/
    import java.io.*;
public class file1
    {
        public static void main(String args[])throws IOException
        {
        FileReader f=new FileReader("Stud.txt");
        BuffredReader buf=new BuffereadReader(f);
        FileWriter fout=new Filewriter("NewStud.txt");
        BuffereadWriter buf1=new bufferedWriter(fout);
        PrintWriter pr=new PrintWriter(buf);
        String h;
        while(h=buf.readLine()!=null)
        {
        String mr1=buf.readLine();
        String mr2=buf.readLine();
        String mr3=buf.readLine();
        int mk1=Integer.parseInt(mr1);
        int mk2=Integer.parseInt(mr2);
        int mk3=Integer.parseInt(mr3);
        int tot=mk1+m2+m3;
        double per=tot/3.0;
        pr.println(h);
        pr.println(mk1);
        pr.println(mk2);
        pr.println(mk3);
        pr.println(tot);
        pr.println(per);
        }
        f.close();
        pr.close();
    }
}
