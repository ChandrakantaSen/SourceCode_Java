import java.io.*;
class path
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s,path,fname,file,ext;
        int j,i;
        s="C:/Users/admin/Pictures/flower.jpg";
        i=s.lastIndexOf('/');
        path=s.substring(0,i-1);
        fname=s.substring(i+1);
        j=fname.indexOf('.');
        ext=fname.substring(j+1);
        System.out.println("Path:"+path);
        System.out.println("File name:"+fname);
        System.out.println("Extension:"+ext);
    }
}

        