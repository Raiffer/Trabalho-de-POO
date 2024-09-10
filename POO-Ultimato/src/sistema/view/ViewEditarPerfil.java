package sistema.view;

import java.io.IOException;
import java.util.Scanner;

import sistema.model.*;

public class ViewEditarPerfil {
	private ViewEditarPerfilController controller;
	private Model model;
	private String email, newEmail, senha, nome, cep;
	private int telefone;

	public void initiViewEditarPerfil(Model model, String email) throws IOException {
		this.model = model;
		this.email = email;
		this.newEmail = email;
		controller = new ViewEditarPerfilController();
		controller.initViewEditarPerfilController(model, this);
		controller.interacao(1);

	}

	public void menu() throws IOException {
		Scanner cs = new Scanner(System.in);
		int escolha;
		System.out.println("Editor de Perfil.");
		System.out.println("O que deseja alterar?");
		System.out.println("1 - Email");
		System.out.println("2 - Nome de Usuario");
		System.out.println("3 - Senha");
		System.out.println("4 - CEP");
		System.out.println("5 - Telefone");
		System.out.println("0 - Voltar");
		escolha = cs.nextInt();
		switch (escolha){
			case 1:
				controller.interacao(2);
				break;
			case 2:
				controller.interacao(3);
				break;
			case 3:
				controller.interacao(4);
				break;
			case 4:
				controller.interacao(5);
				break;
			case 5:
				controller.interacao(6);
				break;
			case 0:
				controller.interacao(7);
				break;
			default:
				controller.interacao(8);
				break;
		}
	}

	public void mudarEmail() throws IOException { // Interaçao 1
		Scanner sc = new Scanner(System.in);
		System.out.println("Novo Email: ");
		newEmail = sc.nextLine();
		model.setEmail(email, newEmail);
		goPerfil();
	}

	public void mudarSenha() throws IOException { // Interaçao 2
		Scanner sc = new Scanner(System.in);
		System.out.println("Nova Senha: ");
		senha = sc.nextLine();
		model.setSenha(email, senha);

	}

	public void mudarNome() throws IOException { // Interaçao 3
		Scanner sc = new Scanner(System.in);
		System.out.println("Novo Nome: ");
		nome = sc.nextLine();
		model.setNome(email, nome);
	}

	public void goLogin(Model model) throws IOException {
		ViewLogin viewLogin = new ViewLogin();
		viewLogin.initViewLogin(model);
	}

	public void mudarTelefone() throws IOException { // Interaçao 4
		Scanner sc = new Scanner(System.in);
		System.out.println("Novo Telefone: ");
		telefone = Integer.parseInt(sc.nextLine());
		model.setTelefone(email, telefone);
	}

	public void mudarCep() throws IOException { // Interaçao 5
		Scanner sc = new Scanner(System.in);
		System.out.println("Novo CEP: ");
		cep = sc.nextLine();
		model.setCep(email, cep);
	}

	public void goPerfil() throws IOException {
		ViewPerfil view = new ViewPerfil();
		view.initViewPerfil(model, newEmail);
	}

	public void mensagem(String mensagem) {
		System.out.println(mensagem);
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
