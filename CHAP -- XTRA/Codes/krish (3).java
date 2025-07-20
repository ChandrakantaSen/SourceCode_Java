import java.io.*;

class krish {
    public static void main(String args[]) throws IOException {
        int n,temp,sum,i,rem,f;

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter the number: ");
        n = Integer.parseInt(in.readLine());

        temp = n;
        sum=0;
        rem=0;
        while(temp != 0) {
            rem = temp%10;
            f=1;
            for(i=1;i<=rem;i++) {
                f = f*i;
            }
            sum = sum + f;
            temp = temp/10;
        }
       
        if(sum == n) {
            System.out.println("krinamurthy...");
        }
        else{
            System.out.println("not krinamurthy...");
        }
    }
}