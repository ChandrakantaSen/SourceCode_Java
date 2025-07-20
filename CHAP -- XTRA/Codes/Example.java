import java.io.*;
class Example {
    public static void main(String args[]) throws IOException {
        InputStreamReader stdin = new InputStreamReader(System.in);
        BufferedReader console = new BufferedReader(stdin);

        String str;
        int a,b;

        System.out.println("Enter two  nos.:");
        str = console.readLine();
        a = Integer.parseInt(str);

        str = console.readLine();
        b = Integer.parseInt(str);

        if(a>b) {
            System.out.println(a+" is greater");
            System.out.println( b+" is smaller");
        }
        else {
            System.out.println(a+" is smaller or equal");
            System.out.println( b+" is greater or equal");
        }
    }
}