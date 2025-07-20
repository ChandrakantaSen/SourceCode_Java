import java.io.*;   /*PACKAGE DECLARATION*/
class lmb_test      /*CLASS DECLARATION*/
{                   /*CLASS START*/
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   /*DECLARING BufferedReader*/
static String s,k="",p="",t; /*DECLARING String VARIABLE*/
static  int l,c,i,j,r,d,n,x,fact,ch1,ch2,u;  /*DECLARING INTEGER VARIABLE*/
static  double s1=0;                         /*DECLARING double VARIABLE*/
static char ch;                              /*DECLARING charater VARIABLE*/
public static void reverse()throws IOException  /*DECLARING FUNCTION*/
{                                               /*FUNCTION START*/
System.out.println("Enter any text :----  ");
s=br.readLine();                                /*TAKING STRING AS A INPUT*/
l=s.length();                               /*TAKING OUT THE LENGTH*/
System.out.println("\nReverse String  ");
for(i=l-1;i>=0;i--)                         
{
if(s.charAt(i)!=' ')                     /*CHECKING FOR SPACES*/
{
p=p+s.charAt(i);
System.out.print(s.charAt(i));
}
}
}                                              /*END OF FUNCTION*/
public static void vowels()throws IOException  /*DECLARING FUNCTION*/
{                                              /*FUNCTION START*/
System.out.println("Enter any text :----  ");
s=br.readLine();                           /*TAKING STRING AS A INPUT*/
l=s.length();                              /*TAKING OUT THE LENGTH*/
for(i=0;i<l;i++)                           
{                                          /*START OF LOOP*/
ch=s.charAt(i);
if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')||(ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
{
c++;
}
else if((ch=='b')||(ch=='B')||(ch=='c')||(ch=='C')||(ch=='d')||(ch=='D')||(ch=='f')||(ch=='F')||(ch=='g')||(ch=='G')||(ch=='h')||(ch=='H')||(ch=='j')||(ch=='J')||(ch=='k')||(ch=='K')||(ch=='l')||(ch=='L')||(ch=='m')||(ch=='M')||(ch=='n')||(ch=='N')||(ch=='p')||(ch=='P')||(ch=='q')||(ch=='Q')||(ch=='r')||(ch=='R')||(ch=='s')||(ch=='S')||(ch=='t')||(ch=='T')||(ch=='v')||(ch=='V')||(ch=='w')||(ch=='W')||(ch=='x')||(ch=='X')||(ch=='y')||(ch=='Y')||(ch=='z')||(ch=='Z'))
{
r++;
}
else
{
d++;
}
}                                                /*END OF LOOP*/
System.out.println("Number of vowels =  "+c);
System.out.println("Number of consonants =  "+r); 
System.out.println("Number of special characters =  "+d); 
}                                                  /*END OF FUNCTION*/
public static void pattern()throws IOException     /*DECLARING FUNCTION*/    
{                                                  /*FUNCTION START*/
System.out.println("Enter the range : ");
n=Integer.parseInt(br.readLine());            /*INPUT THE RANGE*/
for(i=1;i<=n;i++)
{
for(j=1;j<=n-i;j++)
{
System.out.print(" ");
}
for(j=1;j<=i;j++)
{
System.out.print(j);
}
for(j=i-1;j>0;j--)
{
System.out.print(j);
}
System.out.println();
}
for(i=1;i<=n-1;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(" ");
}
for(j=1;j<=n-i;j++)
{
System.out.print(j);
}
for(j=n-i-1;j>0;j--)
{
System.out.print(j);
}
System.out.println();
}
}                                             /*END OF FUNCTION*/
public static void longest()throws IOException      /*FUNCTION START*/
{
System.out.println("Enter any text :-  ");
s=br.readLine();                          /*INPUT THE STRING*/
s=s+" ";
c=0;
r=0;
l=s.length();                             /*LENGTH OF THE STRING*/
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ' )
{
k=s.substring(c,i);                /*EXTRACTING EACH WORD*/
d=k.length();
if(d>r)
{
p=k;
r=d;
}
c=i+1;
}
}
System.out.println("The longest word is  :-  "+p);          
}                                             /*END OF FUNCTION*/
public static void max_vowel()throws IOException  /*FUNCTION DECLARATION*/
{                                                 /*START OF FUNCTION*/
System.out.println("Enter any text :----  ");
s=br.readLine();                               /*INPUT THE STRING*/
l=s.length();                                  /*LENGTH OF THE STRING*/
r=0;
c=0;
d=0;
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')  
{
k=s.substring(c,i);                  /*EXTRACTING EACH WORD */
for(j=0;j<k.length();j++)
{
ch=k.charAt(j);
if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')||(ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
{
d++;
}
}
if(d>r)
{
p=k;
r=d;
}
c=i+1;   
}
}
System.out.println("The word with maximum vowel is  :-  "+p);                          
}                                   /*END OF FUNCTION*/
public static void letter()throws IOException /*DECLARATION OF FUNCTION*/
{                                             /*START OF FUNCTION*/
System.out.println("Enter any text :-  ");
s=br.readLine();                          /*INPUT THE STRING*/
s=s+" ";
c=0;
r=0;
l=s.length();                             /*MEASURING THE LENGTH*/
System.out.println("The words more than six letters are as follows : - ");          
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ' )                 /*CHECKING THE SPACES*/
{
k=s.substring(c,i);                /*EXTARCTING EACH WORD*/
d=k.length();
if(d>6)
{
System.out.println(k);                     
}
c=i+1;
}
}
}                                     /*END OF FUNCTION*/
public static void series()throws IOException     /*DECLARATION OF FUNCTION*/
{                                      /*START OF FUNCTION*/
x=2;
System.out.println("Enter the range : ");
n=Integer.parseInt(br.readLine());        /*INPUT THE RANGE*/       
for(i=1;i<=n;i++)
{
fact=1;
for(j=1;j<=i;j++)
{
fact=fact*j;                      /*EACH NUMBER'S FACTORIAL*/
}
if(i%2==0)                            /*CHECK FOR EVEN DIGITS*/
{
s1=s1-Math.pow(x,i)/fact;         
}
else                                /*CHECK FOR ODD DIGITS*/
{
s1=s1+Math.pow(x,i)/fact;
}
}
System.out.println("The sum of the series is : - "+s1);/*PRINTING THE SUM OF THE SERIES*/
}                                           /*END OF FUNCTION*/
public static void stringmain()throws IOException   /*DECLARATION OF STRINGMAIN() FUNCTION*/
{                                             /*FUNCTION START*/
r=0;
do                                                  
{                                                   /*LOOP SATART*/
System.out.println("----------MENU-------------");         
System.out.println("PRESS 1 FOR REVERSE ANY STRING : - ");         
System.out.println("PRESS 2 FOR COUNT THE NUMBER OF VOWELS CONSONANTS AND SPECIAL CHARACTER : - ");
System.out.println("PRESS 3 FOR LONGEST WORD : - ");
System.out.println("PRESS 4 FOR WORD WITH MAXIMUM VOWElS: - ");
System.out.println("PRESS 5 FOR WORD WITH MORE THAN SIX LETTERS: - ");
System.out.println("PRESS 6 FOR EXIT: - ");
System.out.println("ENTER YOUR CHOICE : - ");
ch1=Integer.parseInt(br.readLine());                /*INPUT THE CHOICES*/
switch(ch1)                                         /*DECLARATION OF SWITCH CASE*/
{                                                   /*CASE SATRT*/
case 1:
reverse();                                          /*CALLS THE reverse() FUNCTION*/
break;
case 2:
vowels();                                       /*CALLS THE vowels() FUNCTION*/                        
break;
case 3:
longest();                                      /*CALLS THE longest() FUNCTION*/
break;
case 4:
max_vowel();                                    /*CALLS THE max_vowel() FUNCTION*/
break;
case 5:
letter();                                       /*CALLS THE letter() FUNCTION*/
break;
case 6:
System.exit(0);                                 /*EXIT FROM THE LOOP*/
default:
System.out.println("Wrong Choice ");
}
System.out.println("Press 1 to continue :  ");    
r=Integer.parseInt(br.readLine());                 /*INPUT TO CONTINUE THE LOOP*/ 
}                                              /*END OF SWITCH CASE*/ 
while(r==1);                                   /*CONDITION*/ 
}                                          /*END OF FUNCTION*/ 
public static void main(String args[])throws IOException  /*DECLARATION OF main() FUNCTION*/
{                                            /*START OF FUNCTION*/
lmb_test ob=new lmb_test();               /*OBJECT DECLARATION*/
u=0;                                      /*INTIALIZING THE VARIABLE*/
do      
{                                                   /*START OF LOOP*/   
System.out.println("----------MENU-------------");         
System.out.println("PRESS 1 FOR SERIES : - ");         
System.out.println("PRESS 2 FOR PATTERN - ");
System.out.println("PRESS 3 FOR STRING : - ");
System.out.println("PRESS 4 FOR EXIT: - ");
System.out.println("ENTER YOUR CHOICE : - ");
ch2=Integer.parseInt(br.readLine());                /*INPUT THE CHOICES FOR SWITCH CASE*/
switch(ch2)
{                                                   /*CASE START*/
case 1:
ob.series();                                       /*CALLS THE series() FUNCTION*/
break;
case 2:
ob.pattern();                                      /*CALLS THE pattern() FUNCTION*/
break;
case 3:
ob.stringmain();                                   /*CALLS THE stringmain() FUNCTION*/
break;
case 4:
System.exit(0);                                     /*EXIT FROM THE LOOP*/
break;
default:
System.out.println("Wrong Choice ");
}
System.out.println("Press 1 to continue :  ");    
u=Integer.parseInt(br.readLine());                  /*INPUT TO CONTINUE THE LOOP*/ 
}                                               /*END OF SWITCH CASE*/ 
while(u==1);                                    /*CONDITION*/ 
}                                             /*END OF main()*/ 
}                                                   /*END OF class*/     
        