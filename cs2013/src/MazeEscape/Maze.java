package MazeEscape;

public class Maze {
	public static void main(String[] args) {
		MazeRunner jimmy = new MazeRunner();
		if(jimmy.solve(1,1))
			System.out.println("Maze Runner made it out");
		else
			System.out.print("Maze runner is still in the maze");
		jimmy.printMaze();
	}
}
