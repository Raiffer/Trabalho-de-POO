package sistema.view;

import sistema.model.*;

import java.io.IOException;

public class ViewEventoController {
	private ViewEvento view;
	private Model model;

	public void initViewEventoController(Model model, ViewEvento view) {
		this.view = view;
		this.model = model;
	}

	public void interacao(int caso) throws IOException {
		switch (caso) {
		case 1:
			if (view.getEmail().equals(model.getOrganizador(view.getEvento()))) {
				view.menuOrg();
			}else if (model.verificarParticipante(view.getEmail(),view.getEvento())) {
				view.menuPart();
			}else {
				view.menu();
			}
			break;
		case 2:
			model.entrarEvento(view.getEmail(),view.getEvento());
			view.menuPart();
			break;
		case 3:
			view.pesquisarAtividade();
			break;
		case 4:
			view.goCriarAtividade();
			break;
		case 5:
			model.removerAtividade(view.getEmail());
		}
	}
}
