import sistema.model.Model;
import sistema.view.ViewLogin;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       Model model = new Model();
        ViewLogin view = new ViewLogin();
        view.initViewLogin(model);
    }
}