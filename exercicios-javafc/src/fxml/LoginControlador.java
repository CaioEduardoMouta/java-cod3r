package fxml;
import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;

public class LoginControlador {
	
	@FXML
	private TextField campoEmail;
	
	@FXML
	private PasswordField campoSenha;
	
	public void entrar() {
		boolean emailValido = campoEmail.getText().equals("alunos@cod3r.com.br");
		boolean senhaValida = campoSenha.getText().equals("1234");
		
		if(emailValido && senhaValida) {
			Notifications.create()
				.position(Pos.TOP_RIGHT)
				.title("Login FXML")
				.text("Login efetuado com sucesso")
				.showInformation();
		} else {
			Notifications.create()
				.position(Pos.TOP_RIGHT)
				.title("Login FXML")
				.text("Usuário ou Senha Inválidos")
				.showError();
		}
	}
}

