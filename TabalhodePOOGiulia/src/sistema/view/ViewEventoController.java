package sistema.view;

import sistema.model.*;

public class ViewEventoController {
	private ViewEvento view;
	private Model model;

	public void initViewEventoController(Model model, ViewEvento view) {
		this.view = view;
		this.model = model;
	}

	public void interacao(int caso) {
		switch (caso) {
		case 1:
			if (model.getUsuario(view.getEmail()) == model.getOrganizador(view.getEvento())) {
				view.goCriarAtividade();
			} else {
				view.mensagem("Apenas Organizadores podem criar Atividades");
			}
			
		//case 2:
			//if (model.getUsuario(view.getEmail()) == model.getOrganizador(view.getEvento())) {
				//view.goEditarEvento(view.getEmail());
			//} else {
				//view.mensagem("Apenas Organizadores podem editar o evento");
			//}
				//Ainda a decidir como faremos editar usuario.

		case 3:
			model.entrarEvento(view.getEmail(), view.getEvento());

		case 4:
			model.removerEvento(view.getEvento());
			view.goMenu();
			
		case 5:
			view.goMenu();
			
		case 6:
			view.goAtividade();
			
		}
	}
}
