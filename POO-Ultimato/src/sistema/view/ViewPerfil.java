package sistema.view;

import sistema.model.*;

import java.io.IOException;
import java.util.Scanner;

public class ViewPerfil {
	private ViewPerfilController controller;
	private Model model;
	private String email;

	public void initViewPerfil(Model model, String email) throws IOException {
		this.model = model;
		this.email = email;
		controller = new ViewPerfilController();
		controller.initViewPerfilController(model, this);
		controller.interacao(1);

	}

	public void menu() throws IOException {
		Scanner sc = new Scanner(System.in);
		int escolha;
		System.out.println("Perfil de " + model.getUsuario(email));
		System.out.println("Email: " + model.getUsuarioEmail(email));
		System.out.println("Telefone: " + model.getUsuarioTelefone(email));
		System.out.println("CEP: " + model.getUsuarioCep(email));
		System.out.println("CPF: " + model.getUsuarioCpf(email));
		System.out.println("Data de Nascimento: " + model.getUsuarioDataNascimento(email));
		System.out.println();
		System.out.println("1 - Editar Perfil ");
		System.out.println("2 - Deslogar Perfil");
		System.out.println("3 - Deletar Perfil");
		System.out.println("4 - Voltar para o Menu");
		escolha = sc.nextInt();
		switch (escolha) {
			case 1: controller.interacao(2); break;
			case 3: controller.interacao(3); break;
			case 4: controller.interacao(4); break;
			default: controller.interacao(5);
		}
		sc.close();
	}

	public void logout() throws IOException { // Interaçao 1
		controller.interacao(1);
	}

	public void editar() throws IOException { // Interaçao 2
		controller.interacao(2);
	}

	public void voltar() throws IOException { // Interaçao 3
		controller.interacao(3);
	}

	public String getEmail() {
		return email;
	}

	public void goLogin() throws IOException {
		ViewLogin view = new ViewLogin();
		view.initViewLogin(model);
	}

	public void goEditarPerfil() throws IOException {
		ViewEditarPerfil view = new ViewEditarPerfil();
		view.initiViewEditarPerfil(model, email);
	}

	public void goMenu() throws IOException {
		ViewMenu view = new ViewMenu();
		view.initViewMenu(email, model);
	}

	public void mensagem(String mensagem) {
		System.out.println(mensagem);
	}
}
