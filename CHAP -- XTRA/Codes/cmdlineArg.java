/* Input through Command Line Argument */

class cmdlineArg {
    public static void main(String args[]) throws IOException {
        int a,b;
        double p;

        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        p = Math.pow((a+b),3)/(a-b);

        System.out.println("the value of the expression is: "+p);
    }
}