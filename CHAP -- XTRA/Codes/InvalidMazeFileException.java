package Maze;

class InvalidMazeFileException extends Exception
{
	public InvalidMazeFileException(String msg, int n)
	{
	    super(msg + n);
	}
}