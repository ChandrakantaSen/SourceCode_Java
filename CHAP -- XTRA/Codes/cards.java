import java.io.*;
class cards
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("CARDS NO.\tTYPE OF CARDS");
        System.out.println("=========\t=============");
        String a="";int d;
        for(int i=1;i<=10;i++)
        {
            int x=(int)((Math.random()*52)+1);
            if(x>=1 && x<=13)
            a="SPADE";
            else if(x>=14 && x<=26)
            a="HEART";
            else if(x>=27 && x<=39)
            a="DIAMOND";
            else if(x>=40 && x<=52)
            a="CLUB";
            if (x==1 || x==14 || x==27 || x==40)
            System.out.println(x+"\t\t"+"ACE of "+a);
            else if (x==11 || x==24 || x==37 || x==50)
            System.out.println(x+"\t\t"+"JOKER of "+a);
            else if (x==12 || x==25 || x==38 || x==51)
            System.out.println(x+"\t\t"+"QUEEN of "+a);
            else if (x==13 || x==26 || x==39 || x==52)
            System.out.println(x+"\t\t"+"KING of "+a);
            else if (x>1 && x<11)
            System.out.println(x+"\t\t"+x+" of "+a);
            else if (x>14 && x<24)
            System.out.println(x+"\t\t"+(x-13)+" of "+a);
            else if (x>27 && x<37)
            System.out.println(x+"\t\t"+(x-26)+" of "+a);
            else if (x>37 && x<47)
            System.out.println(x+"\t\t"+(x-39)+" of "+a);
        }
    }
}
              
            