package hw6;

import java.util.*;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class reverseMult extends Application{
	public void start(Stage primaryStage) {
	
		
		GridPane gp = new GridPane();
		Scene sc = new Scene(gp, 1000, 500);
		BorderPane bpTop = new BorderPane();
		Button button = new Button("Find Problems");
		Text answer = new Text();
		TextField text = new TextField();
		answer.setText("Enter Answer: ");

		button.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				for(int i = 1; i <= 10; i++) {
					for(int j = 1; j <= 10; j++) {
						int product = i * j;
						Label multiply = new Label();
						multiply.setText(String.valueOf(i + "*" + j));
						
						int answerPicked = Integer.parseInt(text.getText());
						if(answerPicked == product) {
							
							gp.add(multiply, i, j);
							}
						}
					}
			} 
			
		});
		/*
		 * 
		 * 			THE CODE WORKS BUT DOES NOT REFRESH OR HIGHLIGHT FOR EVER INPUT 
		 * 
		 */
		
		gp.add(answer, 3, 0);
		gp.add(text, 4, 0);
		gp.add(button, 5 , 0);
		primaryStage.setTitle("Reverse Multiplication Table");
		primaryStage.setScene(sc);
		primaryStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
