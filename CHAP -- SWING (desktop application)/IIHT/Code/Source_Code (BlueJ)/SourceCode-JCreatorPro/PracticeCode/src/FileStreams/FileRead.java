import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead
{
    public static void main(String[] args)throws IOException
    {
    	FileReader cf3 = new FileReader("File2.txt");
        BufferedReader bufferedReader = new BufferedReader(cf3);

        String currLine;
		while ((currLine = bufferedReader.readLine()) != null)
        {
        	System.out.println(currLine);
        }
    }
}