package sistema.view;

import java.util.Scanner;

import sistema.model.*;

public class ViewCriarAtividade {
	private ViewCriarAtividadeController controller;
	private Model model;
	private String email, nome, data, horaInicio, horaFim, evento;

	public void initViewCriarAtividade(Model model, String email) {
		this.model = model;
		this.email = email;
		controller = new ViewCriarAtividadeController();
		controller.initViewCriarAtividadeController(model, this);
		criar();
	}

	public void criar() {
		Scanner sc = new Scanner(System.in); // Interaçao 1
		nome = sc.nextLine();
		data = sc.nextLine();
		horaInicio = sc.nextLine();
		horaFim = sc.nextLine();
		evento = sc.nextLine();
		controller.interacao(1);
		sc.close();
	}

	public void voltar() { // Interaçao 2
		controller.interacao(2);
	}

	public void goEvento() {
		ViewEvento view = new ViewEvento();
		view.initViewEvento(email, model);
	}

	public void goAtividade() {
		ViewAtividade view = new ViewAtividade();
		view.initViewAtividade(model, email);
	}

	public String getEmail() {
		return email;
	}

	public String getNome() {
		return nome;
	}

	public String getData() {
		return data;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public String getHoraFim() {
		return horaFim;
	}

	public String getEvento() {
		return evento;
	}

}
