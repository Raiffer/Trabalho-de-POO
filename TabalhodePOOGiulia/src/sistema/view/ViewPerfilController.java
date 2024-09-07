package sistema.view;

import sistema.model.Model;

public class ViewPerfilController {
    //private Model model;
    private ViewPerfil view;

    public void initViewPerfilController(Model model, ViewPerfil view) {
        //this.model = model;
        this.view = view;
    }

    public void interacao(int caso){
        switch (caso){
            case 1: view.goLogin();
            case 2: view.goEditarPerfil();
            case 3: view.goMenu();
            

        }
    }



}