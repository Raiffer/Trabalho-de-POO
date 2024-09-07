package sistema.view;

import java.util.Scanner;

import sistema.model.*;

public class ViewLogin {
	private ViewLoginController controller;
	private Model model;
	private String email, senha;

	public void initViewLogin(Model model) {
		this.model = model;
		controller = new ViewLoginController();
		controller.initViewLoginController(model, this);
		logar();
	}

	public void logar() { // Interaçao 1
		Scanner sc = new Scanner(System.in);
		email = sc.nextLine();
		senha = sc.nextLine();
		controller.interacao(1);
		sc.close();
	}

	public void redefinirSenha() { // Interaçao 2
		controller.interacao(2);
	}

	public void cadastrar() { // Interaçao 3
		controller.interacao(3);
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