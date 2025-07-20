class Covert
    {
        void input(String s)
        {
            s=" "+s;
            String s1 = " ";
            char a;
            int l=s.length();
            for(int i=0;i<l;i++)
            { 
                a=s.charAt(i);
                if(a == i)
                {
                    s1=s1+a+(Character.toUpperCase(s.charAt(i+1)));
                    i++;
                }
                else
                s1=s1+(Character.toLowerCase(a));
            }
            System.out.println(s1);
        }
    }