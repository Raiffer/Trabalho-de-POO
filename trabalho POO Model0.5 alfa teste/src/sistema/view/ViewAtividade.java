package sistema.view;

import sistema.model.*;

public class ViewAtividade {
	private Model model;
	private ViewAtividadeController controller;
	private String email ,atividade;

	public void initViewAtividade (Model model, String email,String atividade) {// Inicia a instancia da Tela de Atividade.
		this.model = model;
		this.email = email;
		this.atividade = atividade;
		controller = new ViewAtividadeController();
		controller.initViewAtividadeController(model, this);
	}
	
	public void voltar() { //Interaçao 1
		controller.interacao(1);
	}
	
	public void goEvento() {
		ViewEvento view = new ViewEvento();
		view.initViewEvento(email, model);
	}

	public String getEmail() {
		return email;
	}
}
