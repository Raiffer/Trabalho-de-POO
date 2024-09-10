package sistema.view;

import sistema.model.*;

import java.io.IOException;
import java.util.Scanner;

public class ViewEvento {
	private ViewEventoController controller;
	private Model model;
	private String email, evento, atividade;
	// Nao sei ainda como definir o nome do evento, verificar JavaFX.

	public void initViewEvento(String email, Model model, String evento) throws IOException {
		this.model = model;
		this.email = email;
		this.evento = evento;
		controller = new ViewEventoController();
		controller.initViewEventoController(model, this);
		controller.interacao(1);
	}

	public void menuPart() throws IOException {
		Scanner sc = new Scanner(System.in);
		int escolha;
		System.out.println("Evento: " + evento);
		System.out.println("O que deseja fazer?");
		System.out.println("1 - Pesquisar Atividade");
		System.out.println("2 - Voltar para o Menu");
		System.out.println("3 - Lista de Atividades");
		escolha = sc.nextInt();
		switch (escolha){
			case 1:
				controller.interacao(2);
				break;
			case 2:
				controller.interacao(3);
				break;
			case 3:
				controller.interacao(3);
				break;
			default:
				controller.interacao(5);
				break;
		}
	}

	public void menuOrg() throws IOException {
		Scanner sc = new Scanner(System.in);
		int escolha;
		System.out.println("Evento: " + evento);
		System.out.println("O que deseja fazer?");
		System.out.println("1 - Criar Atividade");
		System.out.println("2 - Deletar Atividade");
		System.out.println("3 - Lista de Atividades");
		System.out.println("4 - Pesquisar Atividade");
		System.out.println("5 - Voltar para o Menu");
		escolha = sc.nextInt();
		switch (escolha){
			case 1:
				controller.interacao(4);
				break;
			case 2:
				controller.interacao(3);
				break;
			case 3:
				controller.interacao(3);
				break;
			default:
				controller.interacao(5);
				break;
		}
	}
	public void criarAtividade() throws IOException {// Interaçao 1
		controller.interacao(1);
	}

	public void entrar() throws IOException {// Interaçao 3
		controller.interacao(3);
	}

	public void detetar() throws IOException {// Interaçao 4
		controller.interacao(4);
	}

	public void voltar() throws IOException { // Interaçao 5
		controller.interacao(5);
	}

	public void atividade() throws IOException { // Interaçao 6
		controller.interacao(6);
	}

	public void mensagem(String mensagem) {
		System.out.println(mensagem);
	}

	public String getEmail() {
		return email;
	}

	public String getAtividade() {
		return atividade;
	}

	public String getEvento() {
		return evento;
	}

	public void goAtividade() {
		ViewAtividade view = new ViewAtividade();
		view.initViewAtividade(model, email, atividade, evento);
	}

	public void goCriarAtividade() {
		ViewCriarAtividade view = new ViewCriarAtividade();
		view.initViewCriarAtividade(model, email, evento);
	}

	public void goMenu() throws IOException {
		ViewMenu viewMenu = new ViewMenu();
		viewMenu.initViewMenu(this.email, this.model);
	}

}
