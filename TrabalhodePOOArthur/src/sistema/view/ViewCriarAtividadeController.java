package sistema.view;

import sistema.model.Evento;
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
                model.criarAtividade(view.getNome(), view.getLocal(), view.getData(),  view.getHoraInicio(), view.getHoraFim, model.getEvento(view.getEvento()));
            case 2: //voltar para tela do evento - danilo
                view.goEvento(view.getEmail());
        }
    }
}
