package MazeEscape;

public class MazeRunner {
	int[][] grid = {	
			{1,1,0,1,1},
			{0,1,1,1,0},
			{1,0,1,1,0},
			{1,0,1,0,1},
			{1,0,1,1,0},
			{0,0,1,0,0}
	};
	
	
	public void printMaze() {
		for(int row = 0; row < grid.length; row++) {
			for(int column = 0; column < grid[row].length; column++)
					System.out.print(grid[row][column]);
			System.out.println();
		}
		System.out.println();
	}
	
	
	public boolean solve(int row, int column) {
		boolean done = false;
		if(isValid(row, column)) {
			System.out.println("curr = " + row + "," + column);
			grid[row][column] = 5;
			printMaze();
			if(row == grid.length - 1 && column == grid[0].length - 1)
				done = true;
			else {
				done = solve(row + 1, column);
				if(!done)
					done = solve(row,column + 1);
				if(!done)
					done = solve(row - 1, column);
				if(!done)
					done = solve(row, column -1);
			}
			if(done)
				grid[row][column] = 6;
		}
		else showWhyInvalid(row,column);
		return done;
	}
	
	
	private void showWhyInvalid(int row, int column) {
		if(row < 0  || row >= grid.length || column < 0 ||column >=grid[0].length)
			System.out.println(row + "," + column + " is off the grid\n");
		else {
			System.out.println("square at " + row + "," + column+" is ");
			if(grid[row][column] == 0)
				System.out.println("a wall\n\n");
			if(grid[row][column] == 5)
				System.out.println("already explored\n\n");
			
		}
	}
	
	
	private boolean isValid(int row, int column) {
		boolean result = false;
		if(row >= 0 && row < grid.length && column >= 0 && column < grid[0].length)
			if(grid[row][column] == 1)
				result = true;
		return result;
	}
}
