package sistema.view;

import java.util.Scanner;

import sistema.model.*;

public class ViewEditarPerfil {
	private ViewEditarPerfilController controller;
	private Model model;
	private String email, newEmail, senha, nome, cep;
	private int telefone;

	public void initiViewEditarPerfil(Model model, String email) {
		this.model = model;
		this.email = email;
		controller = new ViewEditarPerfilController();
		controller.initViewEditarPerfilController(model, this);

	}

	public void mudarEmail() { // Interaçao 1
		Scanner sc = new Scanner(System.in);
		newEmail = sc.nextLine();
		controller.interacao(1);
		sc.close();
	}

	public void mudarSenha() { // Interaçao 2
		Scanner sc = new Scanner(System.in);
		senha = sc.nextLine();
		controller.interacao(2);
		sc.close();
	}

	public void mudarNome() { // Interaçao 3
		Scanner sc = new Scanner(System.in);
		nome = sc.nextLine();
		controller.interacao(3);
		sc.close();
	}

	public void mudarTelefone() { // Interaçao 4
		Scanner sc = new Scanner(System.in);
		// telefone = sc.nextLine();
		controller.interacao(4);
		sc.close();
	}

	public void mudarCep() { // Interaçao 5
		Scanner sc = new Scanner(System.in);
		cep = sc.nextLine();
		controller.interacao(5);
		sc.close();
	}

	public void perfil() { // Interaçao 6
		controller.interacao(6);
	}

	public void goPerfil() {
		ViewPerfil view = new ViewPerfil();
		view.initViewPerfil(model, email);
	}

	public String getEmail() {
		return email;
	}

	public String getNewEmail() {
		return newEmail;
	}

	public String getSenha() {
		return senha;
	}

	public String getNome() {
		return nome;
	}

	public String getCep() {
		return cep;
	}

	public int getTelefone() {
		return telefone;
	}

}
