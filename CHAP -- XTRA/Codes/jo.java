
  import java.io.*;
  class jo
  { 
  public static void main(String args[])throws IOException
  {  
  InputStreamReader inp=new InputStreamReader(System.in);
  BufferedReader r=new BufferedReader(inp);
  int ch;
  do{
  System.out.println(); 
  System.out.println("menu");
  System.out.println("1. print pattern");
  System.out.println("2. print sum of the Series");
  System.out.println("3. manupulate the strings");
  System.out.println("4. exit");
  System.out.println("enter your choice");
  ch=Integer.parseInt(r.readLine());
  switch(ch)
   { 
   case 1:
   pattern();
   break;

   case 2:
   series();
   break;

   case 3:
   string();
   break;

   case 4:
   System.out.println("exiting the program");
   return;

   default:
   System.out.println("wrong input");
    } 
   } 
while(true);
   } 

public static void pattern()
{
   int r,p,lk,nm,n=4;
     
   lk=n-1;
        
   for(r=1;r<=n;r++)
    {
    
    for(nm=1;nm<=lk;nm++)
     System.out.print(" ");
        
    for(p=1;p<=r;p++)
     System.out.print(p);
        
    for(p=r-1;p>=1;p--)
     System.out.print(p);
     System.out.println();
        
    lk=lk-1;
    }
    
    lk=lk+2;
        
     for(r=n-1;r>=1;r--)
      { 
          
     for(nm=1;nm<=lk;nm++)
      System.out.print(" ");
        
     for(p=1;p<=r;p++)
      System.out.print(p);
        
     for(p=r-1;p>=1;p--)
      System.out.print(p);
      System.out.println();
        
     lk=lk+1;
     }
    }

public static void series()
{ 
   double x,t=1;
   double s=0;
    x=2;
   for(int r=1;r<=6;r++)
    {
    
         t=t*r;
     if(r%2==0)
      s=s-Math.pow(x,r)/t;
     else
      s=s+Math.pow(x,r)/t;
     }
    System.out.println("The sum of the series is..."+s);
}
     
public static void string()throws IOException
{ 
   InputStreamReader inp=new InputStreamReader(System.in);
   BufferedReader r=new BufferedReader(inp);
   System.out.println();
   System.out.println("Menu...");
   System.out.println("1. reverse each word");
   System.out.println("2. count the number of vowels and conconent and special characters");
   System.out.println("3. print the longest word in the sentence");
   System.out.println("4. print the word with maximum vowels");
   System.out.println("5. print the word more than six letters");
   System.out.println("enter your choice");
   int lk=Integer.parseInt(r.readLine());
   System.out.println("Enter the String");
   String s=r.readLine();
   
   switch(lk)
      { 
       case 1:
       reverse(s);
       break;
          
       case 2:
       counter(s);
       break;
       
       case 3:
       longword(s);
       break;
        
       case 4:
       maxivow(s);
       break;
      
       case 5:
       more(s);
       break;
       
       case 6:
       return;
           
       default:
       System.out.println("Wrong input.");
      } 
    
}
public static void reverse(String s)
{ 
  s+=" ";
  int len=s.length();
   int p=0;
   for(int r=0;r<len;r++)
    {
    if(s.charAt(r)==' '||r==len-1)
     {
       for(int nm=r;nm>=p;nm--)
       {
       System.out.print(s.charAt(nm));
       }
       System.out.print(" ");
      p=r+1;
      }
    }
} 

public static void counter(String s)
{ 
  int l,p=0,y=0,t=0,diff,sp=0;
  char chr;
  l=s.length();
  for(int r=0;r<l;r++)
   {
    chr=s.charAt(r);
    if(chr>='a'&&chr<='z'||chr>='A'&&chr<='Z')
    {
        y++;
        
if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u'||chr=='A'||chr=='E'||chr=='I'||chr=='O'||chr=='U')
            p++;
    }
    else
        sp++;
    }
    diff=y-p;

    System.out.println(" NO OF VOWELS..."+p); 
    System.out.println(" NO OF CONSONANT..."+diff); 
    System.out.println(" NO OF SPECIAL CHARACTERS..."+sp); 

    } 

    
    
public static void longword(String str)
    { 
        int sp=0;
        int maxlength=0,p1=0,p2=0;
        str=str+" ";
        
        
        int l=str.length();
        for(int r=0;r<l;r++)
        {
            if(str.charAt(r)==' ')
                {
                    if(maxlength<sp) 
                    {
                        
                        maxlength=sp;
                        p1=r-sp;
                        p2=p1+maxlength;
                       
                    }
                 sp=0;   
                }
                else
                {
                    sp++;
                }
        }
       String s=str.substring(p1,p1+maxlength);
       System.out.println("The Longest word from the String is : "+s);
    }
public static void maxivow(String s)
{ 
  s+=' ';
  int len=s.length();
  int count=0,pos=0,max=0;
  int p=0;
  for(int r=0;r<len;r++)
   {
   char chr=s.charAt(r);
   if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u')
   count++;
    if(chr==' ')
    {
    if(count>max)
    {
    max=count;
    pos=p;
    }
   p=r+1;
   count=0;
}
}
    System.out.print(" THE WORD WITH MAXIMUM VOWELS IS..."); 
   for(int n=pos;s.charAt(n)!=' ';n++)
   System.out.print(s.charAt(n));
   } 


public static void more(String s)
{ //start of the fuction more.................
  s+=' ';
  int len=s.length();
  int p=0;
  System.out.print(" THE WORDS WITH MORE THAN SIX LETTERS ARE...");
  for(int r=0;r<len;r++)
   {
   if(s.charAt(r)==' ')
   {
   if(r-p>6)
   {
    for(int nm=p;nm<=r;nm++)
    {
    System.out.print(s.charAt(nm));
    }
   }
  p=r+1;
  }
}
 }
 
    }                     

