package sistema.view;

import java.io.IOException;
import java.util.Scanner;

import sistema.model.*;

public class ViewCadastro {
	private ViewCadastroController controller;
	private Model model;
	private String email, nome, cep, cpf, senha, dataNascimento;
	private int telefone;

	public void initViewCadastro(Model model) throws IOException {
		this.model = model;
		controller = new ViewCadastroController();
		controller.initViewCadastroController(model, this);
		cadastrar();
	}

	public void cadastrar() throws IOException { // Interaçao 1
		Scanner sc = new Scanner(System.in);
		email = sc.nextLine();
		senha = sc.nextLine();
		cpf = sc.nextLine();
		dataNascimento = sc.nextLine();
		nome = sc.nextLine();
		cep = sc.nextLine();
		// scan telefone;
		controller.interacao(1);
		sc.close();
	}

	public void voltar() throws IOException {
		controller.interacao(2); // Interaçao 2
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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public int getTelefone() {
		return telefone;
	}

	public void mensagem(String mensagem) {
		// So para que o codigo nao de erro, isso vai ser integrado ao JavaFX
		System.out.println(mensagem);
	}

}
