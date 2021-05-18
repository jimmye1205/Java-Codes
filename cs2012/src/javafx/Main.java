package javafx;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application{
	@Override
	public void start(Stage stage) {
		try {
			Label label = new Label("0 x 0");
			Label label1 = new Label("0 x 1");
			Label label2 = new Label("0 x 2");
			Label label3 = new Label("0 x 3");
			Label label4 = new Label("0 x 4");
			Label label5 = new Label("0 x 5");
			Label label6 = new Label("0 x 6");
			Label label7 = new Label("0 x 7");
			Label label8 = new Label("0 x 8");
			Label label9 = new Label("0 x 9");
			Label label10 = new Label("0 x 10");

			grid.add(label, 0, 0);
			grid.add(label1, 0, 1);
			grid.add(label2, 0, 2);
			grid.add(label3, 0, 3);
			grid.add(label4, 0, 4);
			grid.add(label5, 0, 5);
			grid.add(label6, 0, 6);
			grid.add(label7, 0, 7);
			grid.add(label8, 0, 8);
			grid.add(label9, 0, 9);
			grid.add(label10, 0,10);

		
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	GridPane grid = new GridPane();
	Scene scene = new Scene(grid, 400, 400);
	
	public static void Main(String[] args) {
		launch(args);
		
	}
	
}
