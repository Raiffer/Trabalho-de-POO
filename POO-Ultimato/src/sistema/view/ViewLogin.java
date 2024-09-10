package sistema.view;

import java.io.IOException;
import java.util.Scanner;

import sistema.model.*;

public class ViewLogin {
	private ViewLoginController controller;
	private Model model;
	private String email, senha;

	public void initViewLogin(Model model) throws IOException {
		this.model = model;
		controller = new ViewLoginController();
		controller.initViewLoginController(model, this);
		controller.interacao(4);
	}

	public void menu() throws IOException {
		Scanner sc = new Scanner(System.in);
		int escolha;
		System.out.println("Bem Vindo ao SEGEA!");
		System.out.println("O que deseja fazer?");
		System.out.println("1 - Logar Conta");
		System.out.println("2 - Cadastrar Usuario");
		System.out.println("3 - Esqueci Minha Senha");
		System.out.println("4 - Sair");
		escolha = sc.nextInt();
		switch (escolha){
			case 1:
				controller.interacao(1);
				break;
			case 2:
				controller.interacao(2);
				break;
			case 3:
				controller.interacao(3);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				controller.interacao(5);
				break;
		}
		sc.close();

	}
	public void logar() throws IOException { // Interaçao 1
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu e-mail: ");
		email = sc.nextLine();
		System.out.println("Digite sua senha: ");
		senha = sc.nextLine();
		controller.interacao(1);
		sc.close();
	}

	public void redefinirSenha() throws IOException { // Interaçao 2
		controller.interacao(2);
	}

	public void cadastrar() throws IOException { // Interaçao 3
		controller.interacao(3);
	}

	public void mensagem(String mensagem) {
		// So para que o codigo nao de erro, isso vai ser integrado ao JavaFX
		System.out.println(mensagem);
	}

	public void goMenu(String email) throws IOException {
		ViewMenu viewMenu = new ViewMenu();
		viewMenu.initViewMenu(this.email, this.model);
	}

	public void goCadastro() throws IOException {
		ViewCadastro viewCadastro = new ViewCadastro();
		viewCadastro.initViewCadastro(model);
	}

	public void goRedefinirSenha() throws IOException {
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