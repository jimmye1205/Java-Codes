package demo;

import java.time.LocalDateTime;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class demo extends Application{
	
		public void start(Stage primaryStage) {
				StackPane s = new StackPane();
				Scene sc = new Scene(s, 300, 300);
				sc.getStylesheets().add("styles/styles.css");
				Label l = new Label("Hello");
				
				boolean am = getAm();
				
				if(am) l.getStyleClass().add("amstyle");
				else l.getStyleClass().add("pmstyle");
				
				s.getChildren().add(l);
				primaryStage.setScene(sc);
				primaryStage.show();
	}
		
		private boolean getAm() {
			LocalDateTime d = LocalDateTime.now();
			if(d.getHour() < 12) return true;
			else return false;
		}
}
