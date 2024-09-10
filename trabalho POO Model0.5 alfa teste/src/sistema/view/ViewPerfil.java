package sistema.view;

import sistema.model.*;

import java.io.IOException;

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

	public void logout() throws IOException { // Interaçao 1
		controller.interacao(1);
	}

	public void editar() throws IOException { // Interaçao 2
		controller.interacao(2);
	}

	public void voltar() throws IOException { // Interaçao 3
		controller.interacao(3);
	}

	public String getEmail() {
		return email;
	}

	public void goLogin() throws IOException {
		ViewLogin view = new ViewLogin();
		view.initViewLogin(model);
	}

	public void goEditarPerfil() {
		ViewEditarPerfil view = new ViewEditarPerfil();
		view.initiViewEditarPerfil(model, email);
	}

	public void goMenu() throws IOException {
		ViewMenu view = new ViewMenu();
		view.initViewMenu(email, model);
	}
}
