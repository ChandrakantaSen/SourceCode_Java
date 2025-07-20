package Maze;

import java.io.*;
import java.util.*;

public class Maze
{
    char[][] maze;
    static int numRows, numCols;
    Position startp, finishp;
    
    public Maze(String filename)
    {
        /**
         * filename = name of maze file
         * # = wall
         * s = start
         * f = finish
         * reads + constructs maze from file
         */
        
        int lineNum = 0;
        
        BufferedReader mazeFile = null;
        
        StringTokenizer lineTokenizer = null;
        int token1, token2, lctr = 0;
        String line = null;
        
        try {
            mazeFile = new BufferedReader(new FileReader(filename));
            while ((line = mazeFile.readLine()) != null)
            {
                int ntokens = 0;
                lineTokenizer = new StringTokenizer(line);
                ntokens = lineTokenizer.countTokens();
                
                for (int i = 0; i < ntokens; i += 2)
                {
                    lctr++;
                    token1 = new Integer(lineTokenizer.nextToken()).intValue();
                    token2 = new Integer(lineTokenizer.nextToken()).intValue();
                    
                    if (lctr == 1)
                    {
                        if (token1 <= 1 || token2 <= 1)
                            throw new InvalidMazeFileException("Maze file invalid at line : ", lctr);
                        numRows = token1;
                        numCols = token2;
                        maze = new char[numRows][numCols];
                        
                        for(int row = 0; row < numRows; row++)
                        {
                            for(int col = 0; col < numCols; col++)
                            {
                                maze[row][col] = '#';
                            }
                        }
                    }
                    else if (lctr == 2) //starting position
                    {
                        if (token1 < 0 || token1 >= numRows || token2 < 0 || token2 >= numCols)
                        	throw new InvalidMazeFileException("Maze file invalid at line : ", lctr);
                        startp = new Position(token1, token2);
                        System.out.println("Starting position : " + token1 + " , " + token2);
                        maze[token1][token2] = 's';
                    }
                    else if (lctr == 3) //ending position
                    {
                        if (token1 < 0 || token1 >= numRows || token2 < 0 || token2 >= numCols)
                        	throw new InvalidMazeFileException("Maze file invalid at line : ", lctr);
                        finishp = new Position(token1, token2);
                        System.out.println("Finishing position : " + token1 + " , " + token2);
                        maze[token1][token2] = 'f';
                    }
                    else if (lctr == 3)
                    {
                        if (token1 < 0 || token1 >= numRows || token2 < 0 || token2 >= numCols)
                        	throw new InvalidMazeFileException("Maze file invalid at line : ", lctr);
                        maze[token1][token2] = ' ';
                    }
                }
            }
            
            System.out.println();
            System.out.println("Now the given maze is : ");
            for(int row = 0; row < numRows; row++)
            {
                for(int col = 0; col < numCols; col++)
                {
                    System.out.print(maze[row][col]);
                }
                System.out.println();
            }
        } catch(Exception e) {
            System.out.println("Exception takes me out !");
        }
    }
    
    public void visit(Position p)
    {
        //p = position in maze  cell at pos p to be visited
        if (maze[p.row][p.col] == 's')
        	maze[p.row][p.col] = 'S';
        else if (maze[p.row][p.col] == 'f')
        	maze[p.row][p.col] = 'F';
        else if (maze[p.row][p.col] == ' ')
        	maze[p.row][p.col] = 'v';
    }
    
    public boolean isVisited(Position p)
    {
        //returns if pos p is visited
        if (maze[p.row][p.col] == 'v' || maze[p.row][p.col] == 'S' || maze[p.row][p.col] == 'F')
        	return true;
        else
        	return false;
    }
    
    public Position start()
    {
        return startp;
    }
    
    public Position finish()
    {
        return finishp;
    }
    
    public boolean isClear(Position p)
    {
        if ((p.row >=0 && p.row < numRows) && (p.col >=0 && p.col < numCols))
        	if (maze[p.row][p.col] != '#')
        		return true;
        	else
        		return false;
        else
        	return false;
    }
    
    public void PrintMaze()
    {
        for(int row = 0; row < numRows; row++)
        {
            for(int col = 0; col < numCols; col++)
            {
                System.out.print(maze[row][col]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
        boolean solved = false;
        Maze m = new Maze(args[0]);	//the maze
        Position goal = m.finish();	//finish position
        Position square = null;	//current position
        arrayStackPos todo = new arrayStackPos(numRows * numCols);
        								//linear structure to manage search
        								//begin by priming the queue(stack) starting position
        todo.add(m.start());
        while (!todo.isEmpty())
        {
            square = todo.remove();
            if (m.isVisited(square)) continue;
            if(square.equals(goal))
            {
                solved = true;
                m.visit(square);
                System.out.println("Solved maze is given below. v shows path from S to F");
                m.PrintMaze();
                break;
            }
            m.visit(square);
            if (m.isClear(square.north())) todo.add(square.north());
            if (m.isClear(square.west())) todo.add(square.west());
            if (m.isClear(square.south())) todo.add(square.south());
            if (m.isClear(square.east())) todo.add(square.east());
        }
        if(!solved)
        	System.out.println("No solution for this maze !!");
    }
}