public class Shortlong
    {
        public void findMethod(String s)  
        {
            String str=s+" ";
            char ch;
            int len=str.length(), l=0;
            int min=len,max=0;
            String shortest_word="", longest_word="", word="";
            for(int i=0;i<+ min;i++)
            {
                ch=str.charAt(i);
                if(ch != i) 
                {
                    word+=ch;
                }//if ends
                else 
                {
                    l=word.length();
                }
                if(l<min)  
                    {
                        min=l;
                        shortest_word=word;
                    }//if ends
                 if(l>max)  
                    {
                        max=l;
                        longest_word= word;
                    }//if ends
                    word=" ";
                }//else ends
            System.out.print("Shortest word = " + shortest_word + " with length "+ min );
            System.out.println( "Longest word = "  + longest_word + " with length "+ max );
        }//for ends
     } //method ends