class string_function1
{
    void main(String str)
    {
        //find the length of a string
        int k = str.length();
        //find the character position of a string
        char c = str.charAt(3);
        //find the position number of a string
        int n = str.indexOf(3,'L');
        //find the last position number of a string
        int m = str.lastIndexOf('T'); 
        //breaks the string into a substring
        String s = str.substring(4);
        //change a string into lower case
        String a = str.toLowerCase();
        //change a string into upper case
        String b = str.toUpperCase();
        //replace a character with another
        String d = str.replace('A','q');
        //concat two strings
        String g =" in Tibet...";
        String z = str.concat(g);
        //print section
        System.out.println("Required string is: "+str);
        System.out.println("Length of a String: "+k);
        System.out.println("Character Position of a String: "+c);
        System.out.println("Indexof position of a String: "+n);
        System.out.println("Last Indexof position of a String: "+m);
        System.out.println("Substring of a String: "+s);
        System.out.println("Convert a String to LowerCase: "+a);
        System.out.println("Convert a String to UpperCase: "+b);
        System.out.println("Replace a character with another: "+d);
        System.out.println("Concat of two String: "+z);
        //chaeck two string are equal or not
        if(str.equals(g))
        {
            System.out.println("String are same...");
        }
        else
        {
            System.out.println("String are not same...");
        }
        //check two string are equal or not ignore the case
        if(str.equalsIgnoreCase(g))
        {
            System.out.println("String are same...");
        }
        else
        {
            System.out.println("String are not same...");
        }
        //compare two string 
        int t = str.compareTo(g);
        if(n==0)
        {
            System.out.println("Compared two string are same...");
        }
        else if(n>0)
        {
            System.out.println("Compared two string are not same...");
        }
        String l = str.trim();
            System.out.println("Trimmed :"+l);
    }
}
