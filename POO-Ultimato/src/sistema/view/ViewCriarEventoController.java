package sistema.view;

import sistema.model.*;

import java.io.IOException;

public class ViewCriarEventoController {
    private ViewCriarEvent view;
    private Model model;

    public void initViewCriarEventoController(Model model, ViewCriarEvent view) {
        this.model = model;
        this.view = view;
    }

    public void interacao(int caso) throws IOException {
        switch (caso) {
            case 1:
                view.menu();
                break;
            case 2:
                view.criarEvento();
                break;
            case 3:
                view.goMenu();
                break;
            case 4:
                view.mensagem("Opcao Invalida! - Pressione Enter para continuar.");
                System.in.read();
                view.menu();
                break;
            case 5:
                if (model.criarEvento(view.getNome(),view.getLocal(),view.getDataInicio(), view;getDataFim(), view.getEmail() ));

        }
    }
}