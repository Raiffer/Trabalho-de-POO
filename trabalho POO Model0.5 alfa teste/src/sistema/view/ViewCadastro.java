package sistema.view;

import java.io.IOException;
import java.util.Scanner;

import sistema.model.*;

public class ViewCadastro {
	private ViewCadastroController controller;
	private Model model;
	private String email, nome, cep, cpf, senha, telefone;
	private int dataNascimento;

	public void initViewCadastro(Model model) throws IOException {
		this.model = model;
		controller = new ViewCadastroController();
		controller.initViewCadastroController(model, this);
		controller.interacao(4);
	}

	public void menu() throws IOException {
		Scanner sc = new Scanner(System.in);
		int escolha;
		System.out.println("Cadastrar Novo Usuario?");
		System.out.println("1 - Cadastrar Usuario");
		System.out.println("2 - Voltar");
		escolha = sc.nextInt();
		switch (escolha) {
			case 1: controller.interacao(3); break;
			case 2: controller.interacao(2); break;
			default: controller.interacao(5); break;
		}
		sc.close();
	}

	public void cadastrar() throws IOException { // Interaçao 1
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.println("Digite seu Email: ");
		email = sc.nextLine();
		System.out.println("Digite seu Senha: ");
		senha = sc.nextLine();
		System.out.println("Digite seu CPF: ");
		cpf = sc.nextLine();
		System.out.println("Digite sua Data de Nascimento: ");
		dataNascimento = Integer.parseInt(sc.nextLine());
		System.out.println("Digite seu CEP: ");
		cep = sc.nextLine();
		System.out.println("Digite seu Telefone: ");
		telefone = sc.nextLine();
		controller.interacao(1);
		sc.close();
	}

	public void goLogin() throws IOException {
		ViewLogin viewLogin = new ViewLogin();
		viewLogin.initViewLogin(model);
	}

	public String getEmail() {
		return email;
	}

	public String getNome() {
		return nome;
	}

	public String getCep() {
		return cep;
	}

	public String getCpf() {
		return cpf;
	}

	public String getSenha() {
		return senha;
	}

	public int getDataNascimento() {
		return dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void mensagem(String mensagem) {
		// So para que o codigo nao de erro, isso vai ser integrado ao JavaFX
		System.out.println(mensagem);
	}

}
