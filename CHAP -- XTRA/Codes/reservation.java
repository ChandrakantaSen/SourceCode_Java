import java.io.*;
    public class reservation
    {
    static InputStreamReader isr=new InputStreamReader (System.in);
    static BufferedReader br=new BufferedReader (isr);
    static int pno[]=new int[275];
    static String name[]=new String[275];
    static String phno[]=new String[275];
    static int age[]=new int[275];
    static int cl[]=new int[275];
    static int pcount=0;
    static int pnum=1;
    static int max1=75;
    static int max2=125;
    static int max3=175;
    static int ch;
    public static void doMenu() throws Exception
    {
    ch=0;
    do
    {
    System.out.println("\f");
    head.ing();
    System.out.println("1.Book ticket");
    System.out.println("2.Cancel ticket");
    System.out.println("3.Search passenger");
    System.out.println("4.Reservation chart");
    System.out.println("5.Display unbooked tickets");
    System.out.println("6.Exit");
    System.out.println("Please enter your choice");
    ch=Integer.parseInt(br.readLine());
    switch(ch)
    {
    case 1:booking.book();
    break;
    case 2:cancel.can();
    break;
    case 3:search.src();
    break;
    case 4:disp_list.disp();
    break;
    case 5:disp.unbkd();
    break;
    case 6:exit.ext();
    break;
    default :System.out.println("Invalid choice");
    }
    char e=(char)br.read();
    }while(ch!=6);
    }
}