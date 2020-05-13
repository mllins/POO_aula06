package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HelloFX extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane pan = new Pane();
		Scene scn = new Scene(pan, 600, 400);
		
		Label lblWelcome = new Label("Bem-vindo ao JavaFX");
		pan.getChildren().add(lblWelcome);
		Button btnOk = new Button("Ok");
		pan.getChildren().add(btnOk);
		double x = (600-btnOk.getWidth())/2;
		double y = (400-btnOk.getHeight())/2;
		btnOk.relocate(x, y);
		TextField txt = new TextField("");
		pan.getChildren().add(txt);
		txt.relocate(x, y+30);
		
		stage.setScene(scn);
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(HelloFX.class, args);
	}
}
