package sistema.view;

import sistema.model.Model;

public class ViewCriarAtividadeController {
    private ViewCriarAtividade view;
    private Model model;


    public void initViewCriarAtividadeController(Model model, ViewCriarAtividade view) {
        this.model = model;
        this.view = view;
    }

    public void interacao(int caso){
        switch (caso){
            case 1://criar nova atividade - danilo
                model.criarAtividade(view.getNome(), view.getData(),  view.getHoraInicio(), view.getHoraFim(), view.getEvento());
                view.goAtividade();
            case 2: //voltar para tela do evento - danilo
                view.goEvento();
        }
    }
}