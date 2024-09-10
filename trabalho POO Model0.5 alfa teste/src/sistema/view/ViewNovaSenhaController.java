package sistema.view;

import sistema.model.Model;

import java.io.IOException;

public class ViewNovaSenhaController {
    ViewNovaSenha view;
    Model model;

    public void initViewNovaSenhaController(Model model, ViewNovaSenha view) {
        this.view = view;
        this.model = model;

    }

    public void interacao(int caso) throws IOException {
        switch(caso){
            case 1:
                if (view.getSenha1().equals(view.getSenha2())){
                    model.setSenha(view.getEmail(), view.getSenha1());
                    view.mensagem("Senha Alterada com sucesso!");
                    view.goLogin();
                } else {
                    view.mensagem("Senhas Imcompativeis");
                    view.novaSenha();
                }
                break;
            case 2: view.goLogin();break;
            case 3:
                System.out.println("Opcao Invalida! - Pressione Enter para continuar.");
                System.in.read();
                view.menu();
                break;
            case 4: view.menu(); break;
            case 5: view.novaSenha(); break;
        }
    }



}