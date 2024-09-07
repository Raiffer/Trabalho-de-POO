package sistema.view;

import sistema.model.*;

public class ViewEditarPerfilController {
	private ViewEditarPerfil view;
	private Model model;
	
	public void initViewEditarPerfilController(Model model, ViewEditarPerfil view) {
		this.view = view;
		this.model = model;
	}
	
	public void interacao(int caso) {
		switch (caso) {
		case 1: model.setEmail(view.getEmail(), view.getNewEmail());
        case 2: model.setSenha(view.getEmail(),view.getSenha());
        case 3: model.setNome(view.getEmail(), view.getNome());
        case 4: model.setTelefone(view.getEmail(),view.getTelefone());
        case 5: model.setCep(view.getEmail(), view.getCep());
        case 6: view.goPerfil();
		}
	}
}
