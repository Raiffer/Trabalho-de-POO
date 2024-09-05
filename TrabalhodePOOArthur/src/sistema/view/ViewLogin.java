package sistema.view;

import sistema.model.Model;

public class ViewLogin {
    private Model model;
    private ViewLoginController controller;

    public void initViewLogin(Model model){
        this.model = model;
        this.controller = new ViewLoginController();
        controller.initViewLoginController(model, this);
        verificarUsuario();

    }

}
