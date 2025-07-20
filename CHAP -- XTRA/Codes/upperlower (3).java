                                                                                                                                     import java.io.*;
class upperlower
{
public static void main(String args[]) throws IOException 
{
 String s;
 System.out.println(" ENTER your choice ....");
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
 String s1=br.readLine();     
 int n=Integer.parseInt(s1);
 switch(n)    
 {
 case 1: 
 System.out.println("ENTER A SENTENCE ...."); 
 BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
 s=br1.readLine();
 System.out.println(s.toUpperCase());
 break;
 case 2:           
 System.out.println("ENTER A SENTENCE ....");
 BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
 s=br2.readLine();
System.out.println(s.toLowerCase());
 break;
default:
System.out.println("Please choose correct option number");
break;
}
}
}
