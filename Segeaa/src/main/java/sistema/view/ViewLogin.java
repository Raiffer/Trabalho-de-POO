package sistema.view;

import java.util.Scanner;

import javafx.fxml.FXMLLoader;
import sistema.model.*;

public class ViewLogin {

	private FXMLLoader fxmlLoader;
	private Model model;
	private String email, senha;

	public ViewLogin() {
		//dps passar pra ca
	}

	public void initViewLogin(Model model) {
		this.model = model;
		this.fxmlLoader = new FXMLLoader(getClass().getResource("ViewLogin.fxml"));
		this.fxmlLoader.setControllerFactory(param -> new ViewLoginController(this.model));

		//controller.initViewLoginController(model, this);
	}

	public FXMLLoader getFxmlLoader() {
		return fxmlLoader;
	}

	public void logar() { // Interaçao 1
		Scanner sc = new Scanner(System.in);
		email = sc.nextLine();
		senha = sc.nextLine();
		//controller.interacao(1);
		sc.close();
	}

	public void redefinirSenha() { // Interaçao 2
		//controller.interacao(2);
	}

	public void cadastrar() { // Interaçao 3
		//controller.interacao(3);
	}

	public void mensagem(String mensagem) {
		// So para que o codigo nao de erro, isso vai ser integrado ao JavaFX
		System.out.println(mensagem);
	}

	public void goMenu(String email) {
		ViewMenu viewMenu = new ViewMenu();
		viewMenu.initViewMenu(this.email, this.model);
	}

	public void goCadastro() {
		ViewCadastro viewCadastro = new ViewCadastro();
		viewCadastro.initViewCadastro(model);
	}

	public void goRedefinirSenha() {
		ViewNovaSenha viewNovaSenha = new ViewNovaSenha();
		viewNovaSenha.initViewNovaSenha(model);
	}

	public String getSenha() {
		return this.senha;
	}

	public String getEmail() {
		return this.email;
	}
}