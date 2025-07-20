import java.lang.*;
import java.io.*;
class project
{
    public static void main(String[]args)throws IOException
    {
    int F=0,ac;
    int h;
    String ab;
    do
    {
    System.out.println("           ***WELCOME TO THE PIZZA HUT***");
    System.out.println("           ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println();
    System.out.println("           PAN & STUFFED CRUST MENU");
    System.out.println("         **************************");
    System.out.println();
    String it[]=new String[50];
    int ct[]=new int[50];
    System.out.println("SPECIAL OFFER");
    System.out.println("-------------");
    System.out.println("1 spicy veggie, 1 veggie delight, 1 veggie crunch worth Rs.200");
    System.out.println("Pay Rs. 25 more and get 4 flavours of creambell icecream");
    System.out.println();
    System.out.println();
    System.out.println("Vegetarian      Persnal     Medium      Large");
    System.out.println();
    System.out.println("Simply Veg      Rs.50       Rs.95       Rs.195");
    System.out.println("Veggie Crunch   Rs.50       Rs.95       Rs.195");
    System.out.println("Cheezy Cheeze   Rs.70       Rs.130      Rs.230");
    System.out.println("Veggie Lovers   Rs.70       Rs.130      Rs.230");
    System.out.println("Spicy Indian    Rs.70       Rs.130      Rs.230");
    System.out.println("Country Feast   Rs.95       Rs.185      Rs.285");
    System.out.println("Spicy Paneer    Rs.95       Rs.185      Rs.285");
    System.out.println("Veggie Supreme  Rs.95       Rs.185      RS.285");
    System.out.println("Exotica         Rs.95       Rs.185      Rs.285");
    System.out.println("Veggie Tama-Tam Rs.70       Rs.130      Rs.230");
    System.out.println("Paneer Punjabi  Rs.95       Rs.185      Rs.280");
    System.out.println();
    System.out.println("```Non Veg```   Personal    Medium      Large");
    System.out.println();
    System.out.println("Teekha Chicken  Rs.70       Rs.130     Rs.230");
    System.out.println("Chicken Tikkia  Rs.90       Rs.175     Rs.275");
    System.out.println("Chick 'n'Spicy  Rs.90       Rs.175     Rs.275");
    System.out.println("Chicken Supreme Rs.110      Rs.195     Rs.295");
    System.out.println("Pepperoni       Rs.110      Rs.195     Rs.295");
    System.out.println("Supreme         Rs.110      Rs.195     Rs.295");
    System.out.println("Murg Mazedar    Rs.90       Rs.175     Rs.275");
    System.out.println("Supreme TandooriRs.110      Rs.195     Rs.295");
    System.out.println();
    System.out.println();
    System.out.println("Beverages");
    System.out.println("Pepsi,Diet Pepsi(500ml bottle)");
    System.out.println("Miranda,7UP(can)");
    System.out.println("Beverages to be sold on M.R.P");
    System.out.println();
    BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
    System.out.println();
    System.out.println("Enter your name plz");
    String nam=buf.readLine();
    System.out.println();
    System.out.println();
    int i=0,S=0;
    do
    {
    System.out.println("Enter item name");
    String x=buf.readLine();
    it[i]=x;
    if(x.equalsIgnoreCase("Simply veg")==true);
    {
    F=1;
    System.out.println("enter 1 for personsl");
    System.out.println("enter 2 for medium");
    System.out.println("enter 3 for large");
    System.out.println();
    String c=buf.readLine();
    int ch=Integer.parseInt(c);
    switch(ch)
    {
    case 1: ct[i]=50;
        S=S+50;
        break;
    case 2: ct[i]=95;
        S=S+95;
        break;
    case 3: ct[i]=195;
        S=S+195;
        break;
        default: System.out.println("wrong choice");
    }
}
if(x.equalsIgnoreCase("Vegie Crunch")==true)
{
    F=1;
    System.out.println("enter 1 for personal");
    System.out.println("enter 2 for personal");
    System.out.println("enter 3 for personal");
    System.out.println();
    String c=buf.readLine();
     int ch=Integer.parseInt(c);
     switch(ch)
     {
     case 1: ct[i]=50;
        S=S+50;
        break;
     case 2: ct[i]=95;
        S=S+95;
        break;
     case 3: ct[i]=195;
        S=S+195;
        break;
     default:System.out.println("wrong choice");
    }
}
if(x.equalsIgnoreCase("Cheezy Cheeze")==true)
{
    F=1;
    System.out.println("enter 1 for personal");
    System.out.println("enter 2 for personal");
    System.out.println("enter 3 for large");
    System.out.println();
    String c=buf.readLine();
    int ch=Integer.parseInt(c);
    switch(ch)
    {
    case 1: ct[i]=70;
        S=S+70;
        break;
    case 2: ct[i]=130;
        S=S+130;
        break;
    case 3: ct[i]=230;
        S=S+230;
        break;
    default:System.out.println("wrong choice");
    }
}
if(x.equalsIgnoreCase("Veggie Lovers")==true)
{
    F=1;
    System.out.println("enter 1 for personal");
    System.out.println("enter 2 for personal");
    System.out.println("enter 3 for large");
    System.out.println();
    String c=buf.readLine();
    int ch=Integer.parseInt(c);
    switch(ch)
    {
    case 1: ct[i]=70;
        S=S+70;
        break;
    case 2: ct[i]=130;
        S=S+130;
        break;
    case 3: ct[i]=230;
        S=S+230;
        break;
    default:System.out.println("wrong choice");
    }
}
if(x.equalsIgnoreCase("SPECIAL OFFER")==true)
{
    F=1;
    S=S+200;
    ct[i]=200;
    }
    if(x.equalsIgnoreCase("Spicy Indian")==true)
    {
    F=1;
    System.out.println("enter 1 for personal");
    System.out.println("enter 2 for personal");
    System.out.println("enter 3 for large");
    System.out.println();
    String c=buf.readLine();
    int ch=Integer.parseInt(c);
    switch(ch)
    {
    case 1: ct[i]=70;
        S=S+70;
        break;
    case 2: ct[i]=130;
        S=S+130;
        break;
    case 3: ct[i]=230;
        S=S+230;
        break;
    default: System.out.println("wrong choice");
    }
}
if(x.equalsIgnoreCase("Country Feast")==true)
{
    F=1;
    System.out.println("enter 1 for personal");
    System.out.println("enter 2 for personal");
    System.out.println("enter 3 for large");
    System.out.println();
    String c=buf.readLine();
    int ch=Integer.parseInt(c);
    switch(ch)
    {
    case 1: ct[i]=90;
        S=S+90;
        break;
    case 2: ct[i]=185;
        S=S+185;
        break;
    case 3: ct[i]=285;
        S=S+285;
        break;
    default:System.out.println("wrong choice");
    }
}
if(x.equalsIgnoreCase("Spicy Paneer")==true)
{
    F=1;
    System.out.println("enter 1 for personal");
    System.out.println("enter 2 for personal");
    System.out.println("enter 3 for large");
    System.out.println();
    String c=buf.readLine();
    int ch=Integer.parseInt(c);
    switch(ch)
    {
    case 1: ct[i]=90;
        S=S+90;
        break;
    case 2: ct[i]=185;
        S=S+185;
        break;
    case 3: ct[i]=285;
        S=S+285;
        break;
    default:System.out.println("wrong choice");
    }
}
if(x.equalsIgnoreCase("Veggie Supreme")==true)
{
    F=1;
    System.out.println("enter 1 for personal");
    System.out.println("enter 2 for personal");
    System.out.println("enter 3 for large");
    System.out.println();
    String c=buf.readLine();
    int ch=Integer.parseInt(c);
    switch(ch)
    {
    case 1: ct[i]=95;
        S=S+95;
        break;
    case 2: ct[i]=185;
        S=S+185;
        break;
    case 3: ct[i]=285;
        S=S+285;
        break;
    default:System.out.println("wrong choice");
    }
}
if(x.equalsIgnoreCase("Exotica")==true)
{
    F=1;
    System.out.println("enter 1 for personal");
    System.out.println("enter 2 for personal");
    System.out.println("enter 3 for large");
    System.out.println();
    String c=buf.readLine();
    int ch=Integer.parseInt(c);
    switch(ch)
    {
    case 1: ct[i]=110;
        S=S+110;
        break;
    case 2: ct[i]=195;
        S=S+195;
        break;
    case 3: ct[i]=295;
        S=S+295;
        break;
    default:System.out.println("wrong choice");
    }
}
if(x.equalsIgnoreCase("Veggie Tamma-Tam")==true)
{
    F=1;
    System.out.println("enter 1 for personal");
    System.out.println("enter 2 for personal");
    System.out.println("enter 3 for large");
    System.out.println();
String c=buf.readLine();
    int ch=Integer.parseInt(c);
    switch(ch)
    {
    case 1: ct[i]=70;
        S=S+50;
        break;
    case 2: ct[i]=130;
        S=S+50;
        break;
    case 3: ct[i]=285;
        S=S+230;
        break;
    default:System.out.println("wrong choice");
    }
}
if(x.equalsIgnoreCase("Panner Panjabi")==true)
{
    F=1;
    System.out.println("enter 1 for personal");
    System.out.println("enter 2 for personal");
    System.out.println("enter 3 for large");
    System.out.println();
String c=buf.readLine();
    int ch=Integer.parseInt(c);
    switch(ch)
    {
    case 1: ct[i]=95;
        S=S+95;
        break;
    case 2: ct[i]=185;
        S=S+185;
        break;
    case 3: ct[i]=280;
        S=S+280;
        break;
    default:System.out.println("wrong choice");
    }
}
if(x.equalsIgnoreCase("Teekha Chicken")==true)
{
    F=1;
    System.out.println("enter 1 for personal");
    System.out.println("enter 2 for personal");
    System.out.println("enter 3 for large");
    System.out.println();
String c=buf.readLine();
    int ch=Integer.parseInt(c);
    switch(ch)
    {
    case 1: ct[i]=70;
        S=S+70;
        break;
    case 2: ct[i]=130;
        S=S+130;
        break;
    case 3: ct[i]=230;
        S=S+230;
        break;
    default:System.out.println("wrong choice");
    }
}
if(x.equalsIgnoreCase("Chicken Tikia")==true)
{
    F=1;
    System.out.println("enter 1 for personal");
    System.out.println("enter 2 for personal");
    System.out.println("enter 3 for large");
    System.out.println();
String c=buf.readLine();
    int ch=Integer.parseInt(c);
    switch(ch)
    {
    case 1: ct[i]=90;
        S=S+90;
        break;
    case 2: ct[i]=175;
        S=S+175;
        break;
    case 3: ct[i]=275;
        S=S+275;
        break;
    default:System.out.println("wrong choice");
    }
}
if(x.equalsIgnoreCase("Chick'n' Spicy")==true)
{
    F=1;
    System.out.println("enter 1 for personal");
    System.out.println("enter 2 for personal");
    System.out.println("enter 3 for large");
    System.out.println();
String c=buf.readLine();
    int ch=Integer.parseInt(c);
    switch(ch)
    {
    case 1: ct[i]=90;
        S=S+90;
        break;
    case 2: ct[i]=175;
        S=S+175;
        break;
    case 3: ct[i]=275;
        S=S+275;
        break;
    default:System.out.println("wrong choice");
    }
}
if(x.equalsIgnoreCase("Chicken Supreme")==true)
{
    F=1;
    System.out.println("enter 1 for personal");
    System.out.println("enter 2 for personal");
    System.out.println("enter 3 for large");
    System.out.println();
String c=buf.readLine();
    int ch=Integer.parseInt(c);
    switch(ch)
    {
    case 1: ct[i]=100;
        S=S+110;
        break;
    case 2: ct[i]=195;
        S=S+195;
        break;
    case 3: ct[i]=295;
        S=S+295;
        break;
    default:System.out.println("wrong choice");
    }
}
if(x.equalsIgnoreCase("Pepperoni")==true)
{
    F=1;
    System.out.println("enter 1 for personal");
    System.out.println("enter 2 for personal");
    System.out.println("enter 3 for large");
    System.out.println();
String c=buf.readLine();
    int ch=Integer.parseInt(c);
    switch(ch)
    {
    case 1: ct[i]=110;
        S=S+110;
        break;
    case 2: ct[i]=195;
        S=S+185;
        break;
    case 3: ct[i]=295;
        S=S+295;
        break;
    default:System.out.println("wrong choice");
    }
}
if(x.equalsIgnoreCase("Supreme")==true)
{
    F=1;
    System.out.println("enter 1 for personal");
    System.out.println("enter 2 for personal");
    System.out.println("enter 3 for large");
    System.out.println();
String c=buf.readLine();
    int ch=Integer.parseInt(c);
    switch(ch)
    {
    case 1: ct[i]=90;
        S=S+90;
        break;
    case 2: ct[i]=185;
        S=S+185;
        break;
    case 3: ct[i]=285;
        S=S+285;
    break;
    default:System.out.println("wrong choice");
    }
}
if(x.equalsIgnoreCase("Supreme")==true)
{
    F=1;
    System.out.println("enter 1 for personal");
    System.out.println("enter 2 for personal");
    System.out.println("enter 3 for large");
    System.out.println();
String c=buf.readLine();
    int ch=Integer.parseInt(c);
    switch(ch)
    {
    case 1: ct[i]=110;
        S=S+110;
        break;
    case 2: ct[i]=195;
        S=S+195;
        break;
    case 3: ct[i]=295;
        S=S+295;
        break;
    default:System.out.println("wrong choice");
    }
}
if(x.equalsIgnoreCase("Murg Mazedar")==true)
{
    F=1;
    System.out.println("enter 1 for personal");
    System.out.println("enter 2 for personal");
    System.out.println("enter 3 for large");
    System.out.println();
String c=buf.readLine();
    int ch=Integer.parseInt(c);
    switch(ch)
    {
    case 1: ct[i]=90;
        S=S+90;
        break;
    case 2: ct[i]=175;
        S=S+175;
        break;
    case 3: ct[i]=275;
        S=S+275;
        break;
    default:System.out.println("wrong choice");
    }
}
if(x.equalsIgnoreCase("Supreme Tandoori")==true)
{
    F=1;
    System.out.println("enter 1 for personal");
    System.out.println("enter 2 for personal");
    System.out.println("enter 3 for large");
    System.out.println();
String c=buf.readLine();
    int ch=Integer.parseInt(c);
    switch(ch)
    {
    case 1: ct[i]=90;
        S=S+90;
        break;
    case 2: ct[i]=175;
        S=S+175;
        break;
    case 3: ct[i]=275;
        S=S+275;
        break;
    default:System.out.println("wrong choice");
    }
}
if(x.equalsIgnoreCase("Pepsi")==true)
{
    F=1;
    S=S+20;
    ct[i]=20;
}
if(x.equalsIgnoreCase("Diet Pepsi")==true)
{
    F=1;
    S=S+20;
    ct[i]=20;
}
if(x.equalsIgnoreCase("Miranda")==true)
{
    F=1;
    S=S+25;
    ct[i]=25;
}
if(x.equalsIgnoreCase("7UP")==true)
{
    F=1;
    S=S+25;
    ct[i]=25;
}
if(F==0)
{
    System.out.println("Please check the spelling of Item Or the item is not Available.");
    System.out.println("*******     SORRY       ! **********");
    }
    System.out.println("if you want more enter 1 or enter 2");
    String y=buf.readLine();
    h=Integer.parseInt(y);
    i++;
    } while(h==1);
    System.out.println();
    System.out.println("_________  BILL  ___________");
    System.out.println("        ***************     ");
    System.out.println();
    System.out.println("    "+nam);
    System.out.println("    ~~~~~~");
    for(int g=0;g<=i-1;g++)
    {
    System.out.println();
    System.out.println(it[g]+"__________>"+ct[g]);
    }
    System.out.println("Total price="+"___________>"+S);
    System.out.println();
    double q=5.0/100*S;
    System.out.println("Sales tax 5%"+"___________>"+q);
    System.out.println();
    double w=S+q;
    System.out.println("Total Amount _____________>"+w);
    System.out.println();
    double r=10.0/100*w;
    System.out.println("Discount 10%"+"___________>"+r);
    System.out.println();
    double t=w-r;
    System.out.println("Net Amount _______________>"+t);
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("Is there any more customer");
    System.out.println("If yes enter 2, if no enter 1");
    ab=buf.readLine();
    ac=Integer.parseInt(ab);
    }
    while(ac==2);
    System.out.println("         THANKS FOR YOUR VISIT");
    System.out.println("         ~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println();
    System.out.println("         HOPE YOU ENJOYED THE SERVICE");
    System.out.println("       **************************************");
    System.out.println();
    System.out.println(                                                       "WAITING FOR YOUR NEXT VISIT");
    System.out.println();
    System.out.println("        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println();
    }
}