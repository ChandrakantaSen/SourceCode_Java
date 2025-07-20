class PatternTwo
{ void input(String s)
  {
     char a; int j;
     int l=s.length();
     for(int i=0;i<l;i++)
     {  a=s.charAt(i);
         for(j=l-1;j>=i;j--)
         {
         System.out.print(a);
         System.out.println();
        }
      }
   }
}