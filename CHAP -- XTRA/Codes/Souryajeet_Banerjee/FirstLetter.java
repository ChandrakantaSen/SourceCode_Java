class FirstLetter
    { 
        void input(String s)
            { 
                s=" "+s;
                int len=s.length();
                char a; String s2="";
                for(int i=0;i<len;i++)
                {
                    a=s.charAt(i);
                    if(a==i)
                    s2=s2+(s.charAt(i+1));
                }
                System.out.println("The new word –> "+s2);
            }
     }