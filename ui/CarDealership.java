package ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class CarDealership extends Application{
	
	@Override
    public void start(Stage primaryStage) {
	    System.out.println("Start method invoked"); // Debugging statement

        // Create a Label
        Label label = new Label("JavaFX is working!");

        // Create a StackPane and add the Label to it
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Create a Scene
        Scene scene = new Scene(root, 400, 300);

        // Configure the Stage
        primaryStage.setTitle("JavaFX Test");
        primaryStage.setScene(scene);

        // Show the Stage
        primaryStage.show();
    }
	
	public static void main(String[] args) {
		// This initializes and calls the start() method
	    System.out.println("Start method invoked");
	}

}
