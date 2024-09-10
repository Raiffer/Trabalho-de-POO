package sistema.view;

import java.io.IOException;
import java.util.Scanner;

import sistema.model.*;

public class ViewCriarEvento {
	private ViewCriarEventoController controller;
	private Model model;
	private String email, nome, local, dataInicio, dataFim;

	public void initViewCriarEvento(Model model, String email) throws IOException {
		this.model = model;
		this.email = email;
		controller = new ViewCriarEventoController();
		controller.initViewCriarEventoController(model, this);
		criar();
	}

	public void menu() throws IOException {
		Scanner sc = new Scanner(System.in);
		int escolha;
		System.out.println("Crie seu evento!");
		System.out.println("O que deseja fazer?");
		System.out.println("1 - Criar Evento");
		System.out.println("2 - Voltar para o Menu");
		escolha = sc.nextInt();
		switch (escolha){
			case 1:
				controller.interacao(2);
				break;
			case 2:
				controller.interacao(3);
				break;
			default:
				controller.interacao(4);
				break;
		}{

	}

	public void criar() throws IOException { // Interaçao 1
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do evento:");
		nome = sc.nextLine();
		System.out.println("Digite o local do evento:");
		local = sc.nextLine();
		System.out.println("Digite a data de inicio :");
		dataInicio = sc.nextLine();
		System.out.println("Digite a data de encerramento:");
		dataFim = sc.nextLine();
		controller.interacao(5);
		sc.close();
	}

	public void menu() throws IOException { // Interaçao 2
		controller.interacao(2);
	}

	public void goEvento() {
		ViewEvento view = new ViewEvento();
		view.initViewEvento(email, model, nome);
	}

	public void goMenu() throws IOException {
		ViewMenu view = new ViewMenu();
		view.initViewMenu(email, model);
	}

	public String getEmail() {
		return email;
	}

	public String getNome() {
		return nome;
	}

	public String getLocal() {
		return local;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

}
