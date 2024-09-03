package sistema.view;

import java.util.*;
import sistema.model.*;
import java.util.Observer;

public class ViewLoginController {

    private ViewLogin view;
    private Model model;

    public boolean verificarLogin(String senha, String email){
        model.verificarLogin(senha, email);
        //Verificar se a senha ta correta,
        //e se o email esta coincidindo com o dado
        return false;//-> isso foi da IDE para ela ficar quieta
    }
}
