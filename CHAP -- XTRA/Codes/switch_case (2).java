/* Illustrate of  Switch Case Example */
import java.io.*;
class switch_case {
    public static void main(String args[])throws IOException {
        int ch;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("**** Menu Driven Programme ****");
        System.out.println("Press 1 -> Good Morning");
        System.out.println("Press 2 -> Good Afternoon");
        System.out.println("Press 3 -> Good Evening");
        System.out.println("Press 4 -> Good Night");
        System.out.println("Press 5 -> Exit");


        while(true) {
            System.out.println();
            System.out.print("Enter your choice:");
            ch = Integer.parseInt(in.readLine());

            switch(ch) {
                case 1: System.out.println("Good Morning");    break;
                case 2: System.out.println("Good Afternoon");    break;
                case 3: System.out.println("Good Evening");    break;
                case 4: System.out.println("Good night");    break;
                case 5: System.exit(0);
                default: System.out.println("Wrong Choice");
            }
        }
    }
}