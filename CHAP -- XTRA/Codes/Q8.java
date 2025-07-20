//Create a file for the libary of a school which should store the records of members as their name,member number,address,book issued.
//Your program should also be able to give the following output:
//(a)The number of members.
//(b)The number of members Whose address is "New Delhi".

import java.io.*;
public class Q8
{
    public static void main(String args[])throws IOException
    {
    FileWriter fout=new FileWriter("Library.txt");
    BufferedWriter buf=new BufferedWriter(fout);
    PrintWriter pr=new PrintWriter(buf);
    BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
    BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));
    char ch='y';
    int cnt=0,ctr=0;
    for(;ch=='y';)
    {
    cnt +=1;
    System.out.println("Enter name,member no.,addres,book issued");
    String nam=inp.readLine();
    String mno=inp.readLine();
    String add=inp.readLine();
    String bk=inp.readLine();
    pr.println(nam);
    pr.println(mno);
    pr.println(add);
    pr.println(bk);
    if(add.compareTo("New Delhi")==0) ctr +=1;
    System.out.println("Do u Want to add a record?Press'y'For yes:");
    ch=(char) bb.read();
}
pr.close();
    System.out.println("The number of members of library are:"+cnt);
    System.out.println("The number of members of New Delhi are"+ctr);
}
    }
    