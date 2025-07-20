/** Using java.io.FileOutputStream Class
 * -- FileOutputStream.write() method automatically create a new file
 *	  and write content to it.
 **/

import java.io.*;

class CreateFile2
{
	public static void main (String[] args)throws IOException
	{
		String data = "Hello World...!";
		FileOutputStream out = new FileOutputStream("File2.txt");

		out.write(data.getBytes());
		out.close();
	}
}