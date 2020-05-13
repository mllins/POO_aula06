package edu.curso;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Layouts extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane bpn = new BorderPane();
		Scene scn = new Scene(bpn, 600, 400);
		
		Label ld = new Label("Direita");
		Label le = new Label("Esquerda");
		Label lc = new Label("Cima");
		Label lb = new Label("Baixo");
		Label lcentro = new Label("Centro");
		
		bpn.setRight(ld);
		bpn.setLeft(le);
		bpn.setTop(lc);
//		bpn.setBottom(lb);
		bpn.setCenter(lcentro);
		
		BorderPane.setAlignment(ld, Pos.CENTER_RIGHT);
		BorderPane.setAlignment(le, Pos.CENTER_LEFT);
		BorderPane.setAlignment(lb, Pos.BOTTOM_CENTER);
		BorderPane.setAlignment(lc, Pos.TOP_CENTER);
		
		FlowPane fp = new FlowPane();
		fp.setStyle("-fx-background-color: red");
		fp.getChildren().add(new Button("Botão 1"));
		fp.getChildren().add(new Button("Botão 2"));
		fp.setMaxWidth(200);
		
		bpn.setBottom(fp);
		
		stage.setScene(scn);
		stage.setTitle("Teste de Layouts");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(Layouts.class, args);
	}

}
