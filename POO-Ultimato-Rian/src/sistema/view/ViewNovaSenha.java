package sistema.view;

import java.io.IOException;
import java.util.Scanner;

import sistema.controller.ViewNovaSenhaController;
import sistema.model.Model;

public class ViewNovaSenha {
	private ViewNovaSenhaController controller;
	private Model model;
	private String senha1, senha2, email;

	// Inicializa a view de nova senha
	public void initViewNovaSenha(Model model) throws IOException {
		this.model = model;
		controller = new ViewNovaSenhaController();
		controller.initViewNovaSenhaController(model, this);
		menu(); // Inicia o menu
	}

	// Exibe o menu para redefinir a senha
	public void menu() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int opcao = -1;

		while (opcao != 3) { // Continua no loop até o usuário escolher a opção 3
			desenharMenu(); // Exibe o menu
			System.out.print("\033[1;32m>> Escolha uma opção:\033[0m ");
			opcao = scanner.nextInt(); // Captura a escolha do usuário
			scanner.nextLine(); // Consome a nova linha após a escolha
			tratarEscolha(opcao, scanner); // Passa a escolha para o controlador
		}

		System.out.println("\033[1;31mPrograma encerrado.\033[0m");
		scanner.close();
	}

	// Desenha o menu na tela
	private void desenharMenu() {
		System.out.println("\033[1;36m╔══════════════════════════════════════════════╗\033[0m");
		System.out.println("\033[1;36m║                REDEFINIR SENHA               ║\033[0m");
		System.out.println("\033[1;36m╠══════════════════════════════════════════════╣\033[0m");
		System.out.println("\033[1;33m║ O que deseja fazer?                          ║\033[0m");
		System.out.println("\033[1;36m╠══════════════════════════════════════════════╣\033[0m");
		System.out.println("\033[1;32m║ 1 - Redefinir Senha                          ║\033[0m");
		System.out.println("\033[1;32m║ 2 - Voltar para o Login                      ║\033[0m");
		System.out.println("\033[1;32m║ 3 - Sair                                     ║\033[0m");
		System.out.println("\033[1;36m╚══════════════════════════════════════════════╝\033[0m");
	}

	// Trata a escolha do usuário e delega ao controlador
	private void tratarEscolha(int opcao, Scanner scanner) throws IOException {
		switch (opcao) {
			case 1:
				System.out.println("\033[1;33mDigite seu email:\033[0m ");
				email = scanner.nextLine();
				System.out.println("\033[1;33mDigite sua nova senha:\033[0m ");
				senha1 = scanner.nextLine();
				System.out.println("\033[1;33mConfirme sua nova senha:\033[0m ");
				senha2 = scanner.nextLine();
				novaSenha(); // Chama o método de redefinir senha
				break;
			case 2:
				voltar(); // Retorna para a tela de login
				break;
			case 3:
				System.out.println("\033[1;31mSaindo...\033[0m");
				break;
			default:
				System.out.println("\033[1;31mOpção inválida! Tente novamente.\033[0m");
				break;
		}
	}

	// Método para redefinir a senha
	public void novaSenha() throws IOException {
		controller.interacao(1);
	}

	// Método para voltar para o login
	public void voltar() throws IOException {
		controller.interacao(2);
	}

	// Método para exibir mensagens
	public void mensagem(String mensagem) {
		System.out.println(mensagem);
	}

	// Getters
	public String getEmail() {
		return email;
	}

	public String getSenha1() {
		return senha1;
	}

	public String getSenha2() {
		return senha2;
	}

	// Método para redirecionar para a tela de login
	public void goLogin() throws IOException {
		ViewLogin viewLogin = new ViewLogin();
		viewLogin.initViewLogin(model);
	}
}
