package MazeSolver;

//heavily adapted from example by Katy Borner, Indiana University

//http://info.ils.indiana.edu/~katy/teaching/Examples/Maze_Search.java
import java.util.*;
public class MazeSearch {

	public static void main(String[] args) {

		Maze maze = new Maze();		// create 

		RecursiveDFSSolverStrategy solver = new RecursiveDFSSolverStrategy(maze);
		RecursiveAltDFSSolverStrategy solver2 = new RecursiveAltDFSSolverStrategy(maze);
		
		
		
		System.out.println("How would you like to get out of the maze? ");
		System.out.println("Dept first Solver: type 1 then press enter");
		System.out.println("Alternate Dept first solver: type 2 then press enter");
		System.out.println("Breadth first Solver: type 3 then press enter");
		System.out.println();
		Scanner in = new Scanner(System.in);
		int usr = in.nextInt();

	if(usr == 1) {
		System.out.println("Recursive Dept-First Solver was selected");
		if (solver.solve(0, 0))
			System.out.println("Maze solved!");
		else
			System.out.println("No solution.");
		maze.printMaze();
		}
	else if(usr == 2) {
		System.out.println("Recursive Alt Dept-First Solver was selected");
		if(solver2.solve(0, 0))
			System.out.println("Maze solved!");
		else
			System.out.println("No solution");
		maze.printMaze();
		}
	else if(usr == 3) {
		System.out.println("Breadth first solver was selected");
	}
	}
}