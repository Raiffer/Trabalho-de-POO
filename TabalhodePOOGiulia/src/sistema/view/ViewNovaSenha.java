package sistema.view;

import java.util.Scanner;

import sistema.model.*;

public class ViewNovaSenha {
	private ViewNovaSenhaController controller;
	private Model model;
	private String senha1, senha2, email;

	public void initViewNovaSenha(Model model) {
		this.model = model;
		controller = new ViewNovaSenhaController();
		controller.initViewNovaSenhaController(model, this);
		novaSenha();
	}

	public void novaSenha() { // Interaçao 1
		Scanner sc = new Scanner(System.in);
		email = sc.nextLine();
		senha1 = sc.nextLine();
		senha2 = sc.nextLine();
		controller.interacao(1);
		sc.close();
	}

	public void voltar() { // Interaçao 2
		controller.interacao(2);
	}

	public void goLogin() {
		ViewLogin viewLogin = new ViewLogin();
		viewLogin.initViewLogin(model);
	}

	public void mensagem(String mensagem) {
		// So para que o codigo nao de erro, isso vai ser integrado ao JavaFX
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
