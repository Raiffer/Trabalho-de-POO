package sistema.view;

import sistema.model.Model;

public class ViewAtividadeController {
	//private Model model;
	private ViewAtividade view;
	
	public void initViewAtividadeController(Model model, ViewAtividade view) {
		//this.model = model;
		this.view = view;
		
	}
	
	public void interacao(int caso) {
		switch (caso){
			case 1:
				view.goEvento();
		}
	}

}