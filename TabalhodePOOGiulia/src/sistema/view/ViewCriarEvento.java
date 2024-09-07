package sistema.view;

import java.util.Scanner;

import sistema.model.*;

public class ViewCriarEvento {
	private ViewCriarEventoController controller;
	private Model model;
	private String email, nome, local, dataInicio, dataFim;

	public void initViewCriarEvento(Model model, String email) {
		this.model = model;
		this.email = email;
		controller = new ViewCriarEventoController();
		controller.initViewCriarEventoController(model, this);
		criar();
	}

	public void criar() { // Interaçao 1
		Scanner sc = new Scanner(System.in);
		nome = sc.nextLine();
		local = sc.nextLine();
		dataInicio = sc.nextLine();
		dataFim = sc.nextLine();
		controller.interacao(1);
		sc.close();
	}

	public void menu() { // Interaçao 2
		controller.interacao(2);
	}

	public void goEvento() {
		ViewEvento view = new ViewEvento();
		view.initViewEvento(email, model);
	}

	public void goMenu() {
		ViewMenu view = new ViewMenu();
		view.initViewMenu(email, model);
	}

	public void mensagem(String mensagem) {
		// So para que o codigo nao de erro, isso vai ser integrado ao JavaFX
		System.out.println(mensagem);
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
