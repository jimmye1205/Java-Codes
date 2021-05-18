package javafx;

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;



public class cool extends Application {
	
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage)throws Exception{
		primaryStage.setTitle("Title of Window");
		button = new Button();
		button.setText("click me");
		
		button.setOnAction(e -> {
				System.out.println("meatballs");
				});
	
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 500, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}
}
 