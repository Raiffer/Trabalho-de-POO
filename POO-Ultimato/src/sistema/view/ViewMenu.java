package sistema.view;

import sistema.model.*;

import java.io.IOException;
import java.util.Scanner;

public class ViewMenu {
	private ViewMenuController controller;
	private Model model;
	private String email, evento;

    public void initViewMenu(String email, Model model) throws IOException {
		this.model = model;
		this.email = email;
		controller = new ViewMenuController();
		controller.initViewMenuController(model, this);
		controller.interacao(6);
	}

	public void menu() throws IOException {
		Scanner sc = new Scanner(System.in);
		String escolha;
		System.out.println("Menu Principal");
		System.out.println("1 - Ver Lista de Eventos");
		System.out.println("2 - Ver Perfil");
		System.out.println("3 - Criar Evento");
		System.out.println("4 - Pesquisar Evento");
		System.out.println("5 - Desconectar");
		escolha = sc.nextLine();
		switch (escolha) {
			case "1": controller.interacao(1); break;
			case "2": controller.interacao(2); break;
			case "3": controller.interacao(3); break;
			case "4": controller.interacao(4); break;
			case "5": controller.interacao(5); break;
			default: controller.interacao(8);
		}
	}

	public void pesquisar() throws IOException {
		Scanner sc = new Scanner(System.in);
		int escolha;
		System.out.println("Digite o nome do evento: ");
        evento = sc.nextLine();
		if (model.verificarEvento(evento)){
			controller.interacao(4);
		}
	}
	public void criarEvento() throws IOException {// Interaçao 1
		controller.interacao(1);
	}

	public void perfil() throws IOException {// Interaçao 2
		controller.interacao(2);
	}

	public void abrir() throws IOException {// Interaçao 4
		controller.interacao(4);
	}

	public void pesquisarEvento() throws IOException {
		Scanner sc = new Scanner(System.in);
		int escolha;
		System.out.println("Digite o nome do evento: ");
		evento = sc.nextLine();
		if (model.verificarEvento(evento)){
			controller.interacao(7);
		}
	}

	public void goEvento() throws IOException {
		ViewEvento viewEvento = new ViewEvento();
		viewEvento.initViewEvento(email, model, evento);
	}

	public void goPerfil() throws IOException {
		ViewPerfil viewPerfil = new ViewPerfil();
		viewPerfil.initViewPerfil(model, email);
	}

	public void goCriarEvento() throws IOException {
		ViewCriarEvent viewCriarEvento = new ViewCriarEvent();
		viewCriarEvento.initViewCriarEvent(model, email);
	}

	public String getEvento(){
		return evento;
	}

	public void goLogin(Model model) throws IOException {
		ViewLogin viewLogin = new ViewLogin();
		viewLogin.initViewLogin(model);
	}
	public String getEmail() {
		return email;
	}

	public void mensagem(String mensagem) {
		System.out.println(mensagem);
	}
}
