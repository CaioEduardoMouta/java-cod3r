package basico;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Contador extends Application {
	
	private int contador = 0;
	
	private void atualizarLabelNumero(Label label) {
		label.setText(Integer.toString(contador));
		
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelha");
		
		if (contador > 0) {
			label.getStyleClass().add("verde");
		} else if (contador < 0) {
			label.getStyleClass().add("vermelha");
		}
		
	}

	@Override 
	public void start(Stage primaryStage) throws Exception {
		
		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("titulo");
		
		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");
		
		Button botaoDecremento = new Button("-");
		botaoDecremento.getStyleClass().add("botoes");
		botaoDecremento.setOnAction(e -> {
			contador--;
			atualizarLabelNumero(labelNumero);
			
		});
		
		Button botaoIncremento = new Button("+");
		botaoIncremento.getStyleClass().add("botoes");
		botaoIncremento.setOnAction(e -> {
			contador++;
			atualizarLabelNumero(labelNumero);
						
		});
		
		
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		
		VBox boxConteudo = new VBox();
		boxConteudo.getStyleClass().add("conteudo");
		boxConteudo.setSpacing(10);
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.getChildren().add(labelTitulo); 
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotoes);

		String caminhoDoCss = getClass()
				.getResource("/basico/Contador.css")
				.toExternalForm();
		
		Scene cenaPrincipal = new Scene(boxConteudo, 400,400);
		cenaPrincipal.getStylesheets().add(caminhoDoCss);
		cenaPrincipal.getStylesheets().add(
				"preconnect\" href=\"https://fonts.gstatic.com\">\r\n"
				+ "<link href=\"https://fonts.googleapis.com/css2"
				+ "?family=Inconsolata:wght@300&display=swap\" rel=\"stylesheet");
		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
