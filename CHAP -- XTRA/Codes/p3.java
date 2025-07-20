import java.io.*; /*Declaring the input output package*/
class p3          /*Declaring the class*/
{                   /*Opening the class*/
public static void main(String args[])throws IOException   /*Declring the main() function*/
{                   /*Opening the main() function*/
String s,k="";
int i,l,c=0;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in)); /*Declaring the BufferedReader of the class*/
System.out.println("Enter ant text");
s=br.readLine();    /*Input the string of the sentence*/
l=s.length()-1;     /*Generating the loop in reverse order*/
for(i=l-1;i>=0;i--) /*Checking the length of the last character*/
{                   /*Starting the for loop*/
k=k+s.charAt(i);    /*Extracting each charater and soring it in the reverse order*/
    }               /*Closing for loop*/
    System.out.println(k);
}                   /*Closing the main() function*/
    }               /*Closing the class*/

    