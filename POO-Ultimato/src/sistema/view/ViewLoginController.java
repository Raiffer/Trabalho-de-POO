package sistema.view;

import sistema.model.*;

import java.io.IOException;
//import java.util.Observer;

public class ViewLoginController {

    private ViewLogin view;
    private Model model;

    public void initViewLoginController(Model model, ViewLogin view){
        this.model = model;
        this.view = view;
    }

    public void interacao(int caso) throws IOException {
        switch (caso){
            case 1:
                if(model.verificarUsuario(view.getEmail(), view.getSenha())){
                    view.mensagem("Usuario verificado");
                    view.goMenu(view.getEmail());
                }else{
                    view.mensagem("Login ou Senha invalido, pressione Enter para continuar.");
                    System.in.read();
                    view.menu();
                }
                break;
            case 2:
                view.goCadastro();
                break;
            case 3:
                view.goRedefinirSenha();
                break;
            case 4:
                view.menu();
                break;
            case 5:
                view.mensagem("Opcao Invalida! - Pressione Enter para continuar.");
                System.in.read();
                view.menu();
                break;
        }
    }
}
