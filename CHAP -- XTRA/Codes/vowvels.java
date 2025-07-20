class vowvels
 {
     public static void main(String str)
     {
       int c=0,con=0,d=0,sp=0;
        int l=str.length();
         System.out.println(l);
           for (int i=0;i<l;i++)
           {
               char  ch=str.charAt(i);
               if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
               c++;
               
               if (ch>='0'&& ch<='9')
                      d++;
               if(ch==' ')
                sp++;
                
        }
        con=l-(c+d+sp);
        con++;
        
          System.out.print("Number of vowvels"+c);
        System.out.print("Number of consonents"+con);
        System.out.print("Number of digits"+d);
        System.out.print("Number of spaces"+sp);
    }
}
  



        