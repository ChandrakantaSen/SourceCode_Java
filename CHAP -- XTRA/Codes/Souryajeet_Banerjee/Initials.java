import java.io.*;
class Initials
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
char x;
int l;
System.out.print("Enter any sentence: ");
s=br.readLine();
s=" "+s; //adding a space infront of the inputted sentence or a name
s=s.toUpperCase(); //converting the sentence into Upper Case (Capital Letters)
l=s.length(); //finding the length of the sentence</span>
System.out.print("Output = ");
for(int i=0;i<l;i++)
{
x=s.charAt(i); //taking out one character at a time from the sentence
if(x==' ') //if the character is a space, printing the next Character along with a fullstop
System.out.print(s.charAt(i+1)+".");
}
}
}


//Source: http://www.javaforschool.com/47-printing-the-initials-of-a-name-or-first-letters-of-each-word-of-a-sentence/#ixzz2brmkRd4R