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
		exibirCabecalho(); // Exibe o cabeçalho animado
		menu(); // Exibe o menu de login
	}

	// Exibe um cabeçalho animado com efeito de digitação
	public static void exibirCabecalho() throws InterruptedException {
		String titulo = "************** SEGEA 2024 **************";
		String carregando = "Carregando o sistema";

		System.out.println();
		for (char c : titulo.toCharArray()) {
			System.out.print("\033[1;36m" + c + "\033[0m");
			Thread.sleep(50); // Efeito de digitação
		}
		System.out.println();

		for (int i = 0; i < 3; i++) {
			System.out.print("\033[1;33m" + carregando + "\033[0m");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.println(".");
			Thread.sleep(300);
		}
		System.out.println();
	}

	// Exibe o menu principal de login com opções para o usuário
	public void menu() throws IOException {
		Scanner sc = new Scanner(System.in);
		int escolha;

		// Exibe o menu de login com opções
		desenharMenu();
		System.out.print("\033[1;32m>> Escolha uma opção:\033[0m ");
		escolha = sc.nextInt(); // Lê a opção escolhida pelo usuário
		sc.nextLine(); // Limpa o buffer do scanner

		// Processa a opção escolhida pelo usuário
		switch (escolha) {
			case 1:
				logar(); // Interação para login
				break;
			case 2:
				cadastrar(); // Interação para cadastro
				break;
			case 3:
				redefinirSenha(); // Interação para redefinir senha
				break;
			case 4:
				System.exit(0); // Encerra o programa
				break;
			default:
				System.out.println("\033[1;31mOpção inválida! Tente novamente.\033[0m");
				menu(); // Volta ao menu se a opção for inválida
		}
	}

	// Desenha o menu de login
	public static void desenharMenu() {
		System.out.println("\033[1;36m╔══════════════════════════════════════════════╗\033[0m");
		System.out.println("\033[1;36m║                  MENU DE LOGIN               ║\033[0m");
		System.out.println("\033[1;36m╠══════════════════════════════════════════════╣\033[0m");
		System.out.println("\033[1;33m║ O que deseja fazer?                          ║\033[0m");
		System.out.println("\033[1;36m╠══════════════════════════════════════════════╣\033[0m");
		System.out.println("\033[1;32m║ 1 - Logar Conta                              ║\033[0m");
		System.out.println("\033[1;32m║ 2 - Cadastrar Usuario                        ║\033[0m");
		System.out.println("\033[1;32m║ 3 - Esqueci Minha Senha                      ║\033[0m");
		System.out.println("\033[1;32m║ 4 - Sair                                     ║\033[0m");
		System.out.println("\033[1;36m╚══════════════════════════════════════════════╝\033[0m");
	}

	// Realiza o login do usuário
	public void logar() throws IOException { // Interação 1
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu e-mail: ");
		email = sc.nextLine(); // Lê o e-mail do usuário
		System.out.println("Digite sua senha: ");
		senha = sc.nextLine(); // Lê a senha do usuário
		controller.interacao(1); // Aciona a interação de login no controlador
	}

	// Inicia o processo de redefinição de senha
	public void redefinirSenha() throws IOException { // Interação 2
		controller.interacao(2); // Aciona a interação de redefinição de senha no controlador
	}

	// Inicia o processo de cadastro de um novo usuário
	public void cadastrar() throws IOException { // Interação 3
		controller.interacao(3); // Aciona a interação de cadastro no controlador
	}

	// Exibe uma mensagem no console
	public void mensagem(String mensagem) {
		System.out.println(mensagem); // Mensagem para o usuário (para integração com JavaFX)
	}

	// Navega para o menu principal após o login
	public void goMenu(String email) {
		ViewMenu viewMenu = new ViewMenu();
		viewMenu.initViewMenu(this.email, this.model); // Inicializa a view do menu com o e-mail e o modelo
	}

	// Navega para a tela de cadastro de um novo usuário
	public void goCadastro() throws IOException {
		ViewCadastro viewCadastro = new ViewCadastro();
		viewCadastro.initViewCadastro(model); // Inicializa a view de cadastro com o modelo
	}

	// Navega para a tela de redefinição de senha
	public void goRedefinirSenha() throws IOException {
		ViewNovaSenha viewNovaSenha = new ViewNovaSenha();
		viewNovaSenha.initViewNovaSenha(model); // Inicializa a view de redefinição de senha com o modelo
	}

	// Métodos de acesso aos atributos
	public String getSenha() {
		return this.senha; // Retorna a senha informada pelo usuário
	}

	public String getEmail() {
		return this.email; // Retorna o e-mail informado pelo usuário
	}
}
