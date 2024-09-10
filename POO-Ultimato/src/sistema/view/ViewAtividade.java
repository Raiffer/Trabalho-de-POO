package sistema.view;

import sistema.model.*;

import java.io.IOException;
import java.util.Scanner;

public class ViewAtividade {
	private Model model;
	private ViewAtividadeController controller;
	private String email ,atividade, evento;

	public void initViewAtividade (Model model, String email,String atividade, String evento) throws IOException {// Inicia a instancia da Tela de Atividade.
		this.model = model;
		this.email = email;
		this.atividade = atividade;
		this.evento = evento;
		controller = new ViewAtividadeController();
		controller.initViewAtividadeController(model, this);
		controller.interacao(1);
	}
	public void menu() throws IOException {
		Scanner sc = new Scanner(System.in);
		String escolha;
		System.out.println("Atividade: " + atividade);
		System.out.println("1 - Voltar");
		escolha = sc.nextLine();
		switch (escolha) {
			case "1":
				controller.interacao(2);
				break;
			default:
				controller.interacao(3);
		}
	}
	public void voltar() throws IOException { //Interaçao 1
		controller.interacao(1);
	}
	
	public void goEvento() throws IOException {
		ViewEvento view = new ViewEvento();
		view.initViewEvento(email, model, evento);
	}

	public String getEmail() {
		return email;
	}

	public void mensagem(String mensagem) {
		System.out.println(mensagem);
	}
}
