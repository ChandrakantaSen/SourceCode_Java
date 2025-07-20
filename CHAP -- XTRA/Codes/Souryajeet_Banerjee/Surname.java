class Surname
{
 void input(String s)
 {
   int len=s.length();
   int in=0;
   char a;
   int last= s.lastIndexOf(" ");
   int first=s.indexOf(" ");
   String sur=s.substring(last+1);
   String middle= s.substring(first+1, last);
   String firstname= s.substring(0, first);
   System.out.println(sur+ "+firstname+?? "+middle); 
  }
}