package MazeSolver;
import java.util.*;
public class RecursiveAltDFSSolverStrategy implements MazeSolverStrategy{
	private Maze maze;
	
	public RecursiveAltDFSSolverStrategy(Maze maze) {
		this.maze = maze;
	}
	public boolean solve(int row, int column) {
		Random rand1 = new Random();
		Random rand2 = new Random();
		Random rand3 = new Random();
		Random rand4 = new Random();
		int rowRandom = rand1.nextInt(3);
		int rowRandom2 = rand2.nextInt(3);
		int colRandom = rand3.nextInt(3);
		int colRandom2 = rand4.nextInt(3);
		int oneOrZero = rowRandom%2;
		int oneOrZero2 = rowRandom2%2;
		int oneOrZero3 = colRandom%2;
		int oneOrZero4 = colRandom2%2;

		boolean done = false;
		if (maze.isValid(row, column)) {
			System.out.println("curr = " + row + ", " + column);			
			maze.setCell(row, column, 3); // cell has been tried
			maze.printMaze();
			if (row == maze.getNumRows() - 1 && column == maze.getNumCols() - 1)
				done = true; // maze is solved
			else {
				done = solve(row + 1, column); // down
				if (!done)
					done = solve(row, column + 1); // right
				if (!done)
					done = solve(row - 1 + oneOrZero3, column); // up
				if (!done)
					done = solve(row, column - 1 +oneOrZero4); // left
			}
			
			if (done) // part of the final path
				maze.setCell(row, column, 7);
		}
		else maze.showWhyInvalid(row, column);

		return done;

	}
}
