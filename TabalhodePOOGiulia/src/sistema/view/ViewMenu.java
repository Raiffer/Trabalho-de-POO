package sistema.view;

import sistema.model.*;

public class ViewMenu {
	private ViewMenuController controller;
	private Model model;
	private String email;

	public void initViewMenu(String email, Model model) {
		this.model = model;
		this.email = email;
		controller = new ViewMenuController();
		controller.initViewMenuController(model, this);
	}

	public void criarEvento() {// Interaçao 1
		controller.interacao(1);
	}

	public void perfil() {// Interaçao 2
		controller.interacao(2);
	}

	public void abrir() {// Interaçao 4
		controller.interacao(4);
	}

	public void goEvento(String email) {
		ViewEvento viewEvento = new ViewEvento();
		viewEvento.initViewEvento(email, model);
	}

	public void goPerfil(String email) {
		ViewPerfil viewPerfil = new ViewPerfil();
		viewPerfil.initViewPerfil(model, email);
	}

	public void goCriarEvento(String email) {
		ViewCriarEvento viewCriarEvento = new ViewCriarEvento();
		viewCriarEvento.initViewCriarEvento(model, email);
	}

	public String getEmail() {
		return email;
	}
}
