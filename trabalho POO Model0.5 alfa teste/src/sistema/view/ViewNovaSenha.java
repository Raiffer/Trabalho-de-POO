package sistema.view;

import java.io.IOException;
import java.util.Scanner;

import sistema.model.*;

public class ViewNovaSenha {
	private ViewNovaSenhaController controller;
	private Model model;
	private String senha1, senha2, email;

	public void initViewNovaSenha(Model model) throws IOException {
		this.model = model;
		controller = new ViewNovaSenhaController();
		controller.initViewNovaSenhaController(model, this);
		controller.interacao(4);
	}
	public void menu() throws IOException {
		Scanner sc = new Scanner(System.in);
		int escolha;
		System.out.println("Esqueceu Sua Senha?");
		System.out.println("1 - Criar Nova Senha");
		System.out.println("2 - Voltar");
		switch (escolha = sc.nextInt()) {
			case 1: controller.interacao(5); break;
			case 2: controller.interacao(2); break;
			default: controller.interacao(3); break;
		}
		sc.close();
	}

	public void novaSenha() throws IOException { // Interaçao 1
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu Email: ");
		email = sc.nextLine();
		System.out.println("Digite sua Senha: ");
		senha1 = sc.nextLine();
		System.out.println("Confirme Sua Nova Senha: ");
		senha2 = sc.nextLine();
		controller.interacao(1);
		sc.close();
	}

	public void goLogin() throws IOException {
		ViewLogin viewLogin = new ViewLogin();
		viewLogin.initViewLogin(model);
	}

	public void mensagem(String mensagem) {
		System.out.println(mensagem);
	}

	public String getEmail() {
		return email;
	}

	public String getSenha1() {
		return senha1;
	}

	public String getSenha2() {
		return senha2;

	}
}
