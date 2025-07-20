import java.io.*;
class prog31
{
void main()throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    double d;
    System.out.println("input name");
    String n=br.readLine();   
    System.out.println("input address");
    String a=br.readLine(); 
    System.out.println("input amount of purchase");
    double p=Double.parseDouble(br.readLine()); 
    System.out.println("input type of purchase l=laptop;s=desktop");
    char t=(char)br.read();
    double s=0.0;
    if(t=='l')
          
    { if(p<=25000)
            d=0;
        else if(p<=57000)
        {
          d= 0.05*p;
          s=p-d;
        }
          else if(p<=100000)
                { d=0.075*p; s=p-d;}
              else 
                 {d=0.1*p; s=p-d;}
                 System.out.println("tthe price"+s);
                }
                else if(t=='d') 
                {if(p<=25000) 
         { d= 0.05*p; s=p-d;}
          else if(p<=57000)
                 {d=0.075*p; s=p-d;}
              else if(p<=100000)
                 {d=0.1*p; s=p-d;}
                else 
                     { d=0.15*p; s=p-d;}     
                    }System.out.println("tthe price"+s);
                }
            }
