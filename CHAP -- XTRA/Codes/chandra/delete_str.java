class delete_str
{
    public static void main(String str)
    {
        String str1="";
        char b;
        int l,l1;

        l = str.indexOf(' ');
        l1 = str.lastIndexOf(' ');
        
        str1 = str.substring(0,l)+" "+str.substring(l1+1);
        
        System.out.println("New String: "+str1);
    }
}