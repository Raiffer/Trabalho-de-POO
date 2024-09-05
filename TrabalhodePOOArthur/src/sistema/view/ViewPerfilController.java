package sistema.view;

import sistema.model.Model;

public class ViewPerfilController {
    Model model;
    ViewPerfil view;

    public ViewPerfilController(Model model, ViewPerfil view) {
        this.model = model;
        this.view = view;
    }

    public void interacao(int caso){
        switch (caso){
            case 1: view.goLogin();
            case 2: view.goMenu(view.getEmail());
            case 3: view.goEditarPerfil(view.getEmail());
        }
    }



}
