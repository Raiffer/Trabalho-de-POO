package sistema.view;

import sistema.model.*;

public class ViewAtividade {
	private Model model;
	private ViewAtividadeController controller;

	public void iniViewAtividade(Model model) {// Inicia a instancia da Tela de Atividade.
		this.model = model;
		controller = new ViewAtividadeController();
		controller.iniViewAtividadeController(model, this);
	}

}
