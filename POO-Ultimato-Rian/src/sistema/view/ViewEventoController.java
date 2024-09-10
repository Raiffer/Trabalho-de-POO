package sistema.view;

import sistema.model.*;

public class ViewEventoController {
	private ViewEvento view;
	private Model model;

	// Inicializa o controlador com a view e o modelo
	public void initViewEventoController(Model model, ViewEvento view) {
		this.view = view;
		this.model = model;
	}

	// Processa as interações baseadas no caso fornecido
	public void interacao(int caso) {
		switch (caso) {
			case 1:
				// Verifica se o usuário é o organizador do evento antes de permitir a criação de atividades
				if (model.getUsuario(view.getEmail()) == model.getOrganizador(view.getEvento())) {
					view.goCriarAtividade(); // Redireciona para a tela de criação de atividade
				} else {
					view.mensagem("Apenas Organizadores podem criar Atividades"); // Mensagem de erro se não for organizador
				}
				break; 

			case 2:
				// Verifica se o usuário é o organizador do evento antes de permitir a edição do evento
				if (model.getUsuario(view.getEmail()) == model.getOrganizador(view.getEvento())) {
					view.goEditarEvento(view.getEmail()); // Redireciona para a tela de edição de evento
				} else {
					view.mensagem("Apenas Organizadores podem editar o evento"); // Mensagem de erro se não for organizador
				}
				break; 

			case 3:
				// Permite que o usuário entre em um evento
				model.entrarEvento(view.getEmail(), view.getEvento());
				break; 

			case 4:
				// Remove um evento
				model.removerEvento(view.getEvento()); // Remove o evento do modelo
				view.goMenu(); // Redireciona para o menu principal
				break; 

			case 5:
				// Volta para o menu principal
				view.goMenu();
				break; 

			case 6:
				// Redireciona para a tela de atividades
				view.goAtividade();
				break; 
		}
	}
}
