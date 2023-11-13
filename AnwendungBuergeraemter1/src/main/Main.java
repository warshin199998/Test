package main;

import gui.BuergeraemterControl;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		new BuergeraemterControl(primaryStage);
	}	
	
	public static void main(String[] args){
		launch(args);
	}
}
