package sistema.view;

import sistema.model.Model;

public class ViewNovaSenha {
    public Model model;

    public void goLogin(){
        ViewLogin view = new ViewLogin();
        view.initViewLogin(model);
    }
}
