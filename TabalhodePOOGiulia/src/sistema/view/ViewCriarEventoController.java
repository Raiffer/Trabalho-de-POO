package sistema.view;

import sistema.model.*;

public class ViewCriarEventoController {
    private ViewCriarEvento view;
    private Model model;

    public void initViewCriarEventoController(Model model, ViewCriarEvento view) {
        this.model = model;
        this.view = view;
    }

    public void interacao(int caso) {
        switch (caso) {
            case 1:
                if (model.verificarEvento(view.getNome(), view.getLocal(), view.getDataInicio(), view.getDataFim())) {
                    model.criarEvento(view.getNome(), view.getLocal(), view.getDataInicio(), view.getDataFim(),view.getEmail());
                    view.mensagem("Deu Certo");
                    view.goEvento();
                }else {
                    view.mensagem("Deu Nao");
                    view.goMenu();
                }
            case 2:
                view.goMenu();

        }
    }
}