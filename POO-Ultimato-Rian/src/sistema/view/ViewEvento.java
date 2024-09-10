package sistema.view;

import java.io.IOException;
import java.util.Scanner;

import sistema.model.*;

public class ViewEvento {
	private ViewEventoController controller;
	private Model model;
	private String email, evento, atividade;

	// Inicializa a view do evento com o email do usuário e o modelo
	public void initViewEvento(String email, Model model) throws IOException{
		this.model = model;
		this.email = email;
		controller = new ViewEventoController();
		controller.initViewEventoController(model, this);
		menu(); // Exibe o menu quando a view é inicializada
	}

	// Classe interna para gerenciamento do menu gráfico
	public class MenuGrafico {
		public static void main(String[] args) throws InterruptedException {
			Scanner scanner = new Scanner(System.in);
			int opcao = -1;

			// Exibe um cabeçalho animado com efeito de digitação
			exibirCabecalho();

			// Loop para exibir o menu e processar a escolha do usuário
			while (opcao != 5) {  // Continua no loop até o usuário escolher a opção 5
				desenharMenu(); // Desenha o menu na tela
				System.out.print("\033[1;32m>> Escolha uma opção:\033[0m ");
				opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário

				// Processa a opção escolhida pelo usuário
				switch (opcao) {
					case 1:
						System.out.println("\033[1;34mVocê escolheu Criar Atividade.\033[0m");
						break;
					case 2:
						System.out.println("\033[1;34mVocê escolheu Inscrever-se no evento.\033[0m");
						break;
					case 3:
						System.out.println("\033[1;34mVocê escolheu Ir para atividade.\033[0m");
						break;
					case 4:
						System.out.println("\033[1;34mVocê escolheu Voltar para o menu.\033[0m");
						break;
					case 5:
						System.out.println("\033[1;34mVocê escolheu Deletar Evento.\033[0m");
						break;
					default:
						System.out.println("\033[1;31mOpção inválida! Tente novamente.\033[0m");
				}

				// Delay para não poluir a tela imediatamente após cada ação
				Thread.sleep(1000);
			}

			System.out.println("\033[1;31mPrograma encerrado.\033[0m");
			scanner.close();
		}

		// Exibe um cabeçalho animado com efeito de digitação
		public static void exibirCabecalho() throws InterruptedException {
			String titulo = "************** EVENTO 2024 **************";
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

		// Desenha o menu principal com opções para o usuário
		public static void desenharMenu() {
			System.out.println("\033[1;36m╔══════════════════════════════════════════════╗\033[0m");
			System.out.println("\033[1;36m║                  MENU PRINCIPAL              ║\033[0m");
			System.out.println("\033[1;36m╠══════════════════════════════════════════════╣\033[0m");
			System.out.println("\033[1;33m║ O que deseja fazer?                          ║\033[0m");
			System.out.println("\033[1;36m╠══════════════════════════════════════════════╣\033[0m");
			System.out.println("\033[1;32m║ 1 - Criar Atividade                          ║\033[0m");
			System.out.println("\033[1;32m║ 2 - Inscrever-se no evento                   ║\033[0m");
			System.out.println("\033[1;32m║ 3 - Ir para atividade                        ║\033[0m");
			System.out.println("\033[1;32m║ 4 - Voltar para o menu                       ║\033[0m");
			System.out.println("\033[1;32m║ 5 - Deletar Evento                           ║\033[0m");
			System.out.println("\033[1;36m╚══════════════════════════════════════════════╝\033[0m");
		}

		// Menu de opções para interação com o usuário
		public void Menu() throws IOException {
			// Usa o Scanner para ler a entrada do usuário e processar a opção escolhida
			Scanner sc = new Scanner(System.in);
			int escolha = sc.nextInt();
			switch (escolha) {
				case 1:
					criarAtividade();
					break;
				case 2:
					entrar();
					break;
				case 3:
					atividade();
					break;
				case 4:
					voltar();
					break;
				case 5:
					detetar();
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
			}
		}

	}

	// Métodos que acionam as interações apropriadas no controlador
	public void criarAtividade() { // Interação 1
		controller.interacao(1);
	}

	public void entrar() { // Interação 3
		controller.interacao(3);
	}

	public void detetar() { // Interação 4
		controller.interacao(4);
	}

	public void voltar() { // Interação 5
		controller.interacao(5);
	}

	public void atividade() { // Interação 6
		controller.interacao(6);
	}

	// Exibe uma mensagem no console
	public void mensagem(String mensagem) {
		System.out.println(mensagem);
	}

	// Métodos de acesso aos atributos
	public String getEmail() {
		return email;
	}

	public String getAtividade() {
		return atividade;
	}

	public String getEvento() {
		return evento;
	}

	// Navegação para outras views
	public void goAtividade() {
		ViewAtividade view = new ViewAtividade();
		view.initViewAtividade(model, email);
	}

	public void goCriarAtividade() {
		ViewCriarAtividade view = new ViewCriarAtividade();
		view.initViewCriarAtividade(model, email);
	}

	public void goMenu() {
		ViewMenu viewMenu = new ViewMenu();
		viewMenu.initViewMenu(this.email, this.model);
	}

}
