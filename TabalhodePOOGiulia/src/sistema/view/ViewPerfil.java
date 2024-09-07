package sistema.view;

import sistema.model.*;

public class ViewPerfil {
	private ViewPerfilController controller;
	private Model model;
	private String email;

	public void initViewPerfil(Model model, String email) {
		this.model = model;
		this.email = email;
		controller = new ViewPerfilController();
		controller.initViewPerfilController(model, this);
	}

	public void logout() { // Interaçao 1
		controller.interacao(1);
	}

	public void editar() { // Interaçao 2
		controller.interacao(2);
	}

	public void voltar() { // Interaçao 3
		controller.interacao(3);
	}

	public String getEmail() {
		return email;
	}

	public void goLogin() {
		ViewLogin view = new ViewLogin();
		view.initViewLogin(model);
	}

	public void goEditarPerfil() {
		ViewEditarPerfil view = new ViewEditarPerfil();
		view.initiViewEditarPerfil(model, email);
	}

	public void goMenu() {
		ViewMenu view = new ViewMenu();
		view.initViewMenu(email, model);
	}
}
