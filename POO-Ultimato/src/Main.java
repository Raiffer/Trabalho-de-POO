import sistema.model.Model;
import sistema.view.ViewLogin;
import sistema.view.ViewMenu;

import java.io.IOException;

public class Main {
    /*public static void main(String[] args) throws IOException {
       Model model = new Model();
        ViewLogin view = new ViewLogin();
        view.initViewLogin(model);
    }*/
    public static void main(String[] args) throws IOException {
        Model model = new Model();
        ViewMenu view = new ViewMenu();
        view.initViewMenu("bernardoraiffer@gmail.com", model);
    }
}