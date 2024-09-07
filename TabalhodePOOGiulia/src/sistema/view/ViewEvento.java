package sistema.view;

import sistema.model.*;

public class ViewEvento {
	private ViewEventoController controller;
	private Model model;
	private String email, evento, atividade;
	// Nao sei ainda como definir o nome do evento, verificar JavaFX.

	public void initViewEvento(String email, Model model) {
		this.model = model;
		this.email = email;
		controller = new ViewEventoController();
		controller.initViewEventoController(model, this);
	}

	public void criarAtividade() {// Interaçao 1
		controller.interacao(1);
	}

	public void entrar() {// Interaçao 3
		controller.interacao(3);
	}

	public void detetar() {// Interaçao 4
		controller.interacao(4);
	}

	public void voltar() { // Interaçao 5
		controller.interacao(5);
	}

	public void atividade() { // Interaçao 6
		controller.interacao(6);
	}

	public void mensagem(String mensagem) {
		// So para que o codigo nao de erro, isso vai ser integrado ao JavaFX
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
