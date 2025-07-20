/*
 * Passing Objects to methods can be a bit tricky...
 */
 

/**
 * @author Fritz
 */
class Letter {
    char c;
}

public class PassObject {
    static void f(Letter y) {
        y.c='z';
    } 
    public static void main(String args[]) {
        Letter x = new Letter();
        x.c='a';
        System.out.println("1: x.c:\t"+x.c);
        f(x);
        System.out.println("2: x.c:\t"+x.c);
    }
}
