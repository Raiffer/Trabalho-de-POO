package sistema.view;

import sistema.model.*;

import java.io.IOException;

public class ViewEditarPerfilController {
	private ViewEditarPerfil view;
	private Model model;
	
	public void initViewEditarPerfilController(Model model, ViewEditarPerfil view) {
		this.view = view;
		this.model = model;
	}
	
	public void interacao(int caso) throws IOException {
		switch (caso) {
			case 1: view.menu(); break;
			case 2:
				view.mudarEmail();
				view.goPerfil();
				break;
			case 3:
				view.mudarNome();
				view.goPerfil();
				break;
			case 4:
				view.mudarSenha();
				view.goPerfil();
				break;
			case 5:
				view.mudarCep();
				view.goPerfil();
				break;
			case 6:
				view.mudarTelefone();
				view.goPerfil();
				break;
			case 7:
				view.goPerfil();
				break;
			case 8:
				view.mensagem("Opcao Invalida! - Pressione Enter para continuar.");
				System.in.read();
				view.menu();
				break;
		}
	}
}
