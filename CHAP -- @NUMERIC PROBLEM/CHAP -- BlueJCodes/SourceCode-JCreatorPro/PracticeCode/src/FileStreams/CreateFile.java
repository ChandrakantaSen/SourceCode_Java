/* * Create File using java.io.File class
 * -- Use File.createNewFile() method to create a file.
 *	  This method returns a boolean value : true if the file is created successfully;
 *	  false if the file is already exists or the operation failed for some reason.
 * */

import java.io.*;

class CreateFile
{
	public static void main (String[] args)throws IOException
	{
		File file = new File("File1.txt");

		//Create the file
		if(file.createNewFile())
		{
			System.out.println("File is created!");
		}
		else
		{
			System.out.println("File already exists.");
		}

		//Write Content
		FileWriter writer = new FileWriter(file);
		writer.write("Test data");
		writer.close();
	}
}