import java.io.*;
class num_word
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int n,i,d,m,rev,c;
void digit(int x)
{
if(x==1)
{
System.out.print("One ");
    }
else if(x==2)
{
System.out.print("Two ");
    }
else if(x==3)
{
System.out.print("Three ");
    }
else if(x==4)
{
System.out.print("Four ");
    }
else if(x==5)
{
System.out.print("Five ");
    }
else if(x==6)
{
System.out.print("Six ");
    }
else if(x==7)
{
System.out.print("Seven ");
    }
else if(x==8)
{
System.out.print("Eight ");
    }
else if(x==9)
{
System.out.print("Nine ");
    }
}
void ty(int x)
{
if(x==2)
{
System.out.print("Twenty ");
    }
else if(x==3)
{
System.out.print("Thirty ");
    }
else if(x==4)
{
System.out.print("Fourty ");
    }
else if(x==5)
{
System.out.print("Fifty ");
    }
else if(x==6)
{
System.out.print("Sixty ");
    }
else if(x==7)
{
System.out.print("Seventy ");
    }
else if(x==8)
{
System.out.print("Eighty ");
    }
else if(x==9)
{
System.out.print("Ninety ");
    }
}
void one(int x)
{
if(x==0)
{
System.out.print("Ten ");
    }
else if(x==1)
{
System.out.print("Eleven ");
    }
else if(x==2)
{
System.out.print("Twenlve ");
    }
else if(x==3)
{
System.out.print("Thirteen ");
    }
else if(x==4)
{
System.out.print("Fourteen ");
    }
else if(x==5)
{
System.out.print("Fifteen ");
    }
else if(x==6)
{
System.out.print("Sixteen ");
    }
else if(x==7)
{
System.out.print("Seventeen ");
    }
else if(x==8)
{
System.out.print("Eighteen ");
    }
else if(x==9)
{
System.out.print("Nineteen ");
    }
}
void main()throws IOException
{
num_word ob=new num_word();
System.out.println("Enter a number (four digit max)");
n=Integer.parseInt(buf.readLine());
rev=0;
c=0;
m=n;
while(m>0)
{
c++;
d=m%10;
rev=rev*10+d;
m=m/10;
    }
    m=rev;
if(c==4)
{
d=rev%10;
digit(d);
System.out.print(" Thousand ");
rev=rev/10;
d=rev%10;
if(d!=0)
{
digit(d);
System.out.print(" Hundred ");
    }
rev=rev/10;
d=rev%10;
if(d==0)
    {
        rev=rev/10;
        d=rev%10;
        digit(d);

}
    
else if(d>1)
{
ty(d);
rev=rev/10;
d=rev%10;
digit(d);
}
      else
      {
          rev=rev/10;
          d=rev%10;
          one(d);
        }
System.out.print("Only");    
}
    else if(c==3)
{
d=rev%10;
if(d!=0)
{
digit(d);
System.out.print(" Hundred ");
    }
rev=rev/10;
d=rev%10;
if(d==0)
    {
        rev=rev/10;
        d=rev%10;
        digit(d);

}
    
else if(d>1)
{
ty(d);
rev=rev/10;
d=rev%10;
digit(d);
}
      else
      {
          rev=rev/10;
          d=rev%10;
          one(d);
        }
System.out.print("Only");    
}
else if(c==2)
{
d=rev%10;
if(d==0)
    {
        rev=rev/10;
        d=rev%10;
        digit(d);

}
    
else if(d>1)
{
ty(d);
rev=rev/10;
d=rev%10;
digit(d);
}
      else
      {
          rev=rev/10;
          d=rev%10;
          one(d);
        }
System.out.print("Only");    
}
else if(c==1)
{
digit(rev%10);
System.out.print("Only");    
}
    else if(c==0)
    {
        System.out.print("Zero");
System.out.print("Only");    
}
    
    else
    {
        System.out.print("Wrong Input");
    }
    
}
    }