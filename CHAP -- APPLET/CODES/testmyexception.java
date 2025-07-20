import java.lang.Exception;

class myexception extends Exception {
    myexception (String message) {
        super(message);
    }
}

class testmyexception {
    public static void main(String args[]) {
        int x=5,y=1000;

        try {
            float z=(float) x/ (float)y;
            if(z<=0.01) {
                throw new myexception("no. is too small...");
            }
        }
        catch(myexception e) {
            System.out.println("caught myexception...");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("i am always here...");
        }
    }
}