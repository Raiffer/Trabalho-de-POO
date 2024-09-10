package sistema.view;

import sistema.model.Model;

import java.io.IOException;

public class ViewPerfilController {
    private Model model;
    private ViewPerfil view;

    public void initViewPerfilController(Model model, ViewPerfil view) {
        this.model = model;
        this.view = view;
    }

    public void interacao(int caso) throws IOException {
        switch (caso){
            case 1: view.menu(); break;
            case 2: view.goEditarPerfil(); break;
            case 3: model.deletarUsuario(view.getEmail());
                view.goLogin();
                break;
            case 4: view.goMenu(); break;
            case 5:
                view.mensagem("Opcao Invalida! - Pressione Enter para continuar.");
                System.in.read();
                view.menu();
                break;
        }
    }



}