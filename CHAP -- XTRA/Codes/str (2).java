package All;

class str
{
    public static void main(String args[]) 
    {
        String s= "mADAM";            
        int o = s.length();
        int n = s.indexOf('A');
        int m = s.lastIndexOf('M');
        char p = s.charAt(4);
        String q = s.substring(2);
        String r = s.toLowerCase();
        String t = s.toUpperCase();
        
        
        System.out.println("Value is: "+n);
        System.out.println("Value is: "+m);
        System.out.println("Value is: "+o);
        System.out.println("Value is: "+p);
        System.out.println("Value is: "+q);
        System.out.println("Value is: "+r);
        System.out.println("Value is: "+t);
    }
}
