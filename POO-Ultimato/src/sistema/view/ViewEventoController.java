package sistema.view;

import sistema.model.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
			System.out.println("Usuario Logado: " + view.getEmail());
			System.out.println("Organizador: " + model.getOrganizador(view.getEvento()));
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
			model.removerEvento(view.getEvento());
			view.goMenu();
			break;
		case 6: view.goMenu(); break;
		case 7:
			Map<String,String> atividades = new HashMap<>();
			atividades = model.mostrarAtividades();
			int x = 1;
			System.out.println();
			for (Map.Entry<String,String> evento : atividades.entrySet()) {
				System.out.println(x + " - " + evento.getValue());
				x++;
			}
			System.out.println();
			interacao(1);
			break;
		case 8:
			view.mensagem("Opcao Invalida! - Pressione Enter para continuar.");
			System.in.read();
			interacao(1);
			break;
		case 9:
			view.goAtividade();
		}
	}
}
