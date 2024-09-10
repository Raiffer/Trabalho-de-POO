package sistema.view;

import sistema.model.Model;

import java.io.IOException;

public class ViewAtividadeController {
	private Model model;
	private ViewAtividade view;
	
	public void initViewAtividadeController(Model model, ViewAtividade view) {
		this.model = model;
		this.view = view;
		
	}
	
	public void interacao(int caso) throws IOException {
		switch (caso){
			case 1:
				view.menu();
				break;
			case 2:
				view.goEvento();
				break;
			case 3:
				view.mensagem("Opcao Invalida! - Pressione Enter para continuar.");
				System.in.read();
				view.menu();
				break;
		}
	}

}