package sistema.view;

import sistema.model.*;

import java.io.IOException;

public class ViewAtividade {
	private Model model;
	private ViewAtividadeController controller;
	private String email ,atividade, evento;

	public void initViewAtividade (Model model, String email,String atividade, String evento) {// Inicia a instancia da Tela de Atividade.
		this.model = model;
		this.email = email;
		this.atividade = atividade;
		this.evento = evento;
		controller = new ViewAtividadeController();
		controller.initViewAtividadeController(model, this);
	}
	
	public void voltar() { //Interaçao 1
		controller.interacao(1);
	}
	
	public void goEvento() throws IOException {
		ViewEvento view = new ViewEvento();
		view.initViewEvento(email, model, evento);
	}

	public String getEmail() {
		return email;
	}
}
