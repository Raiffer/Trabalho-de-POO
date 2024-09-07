package sistema.view;

import sistema.model.Model;

public class ViewNovaSenhaController {
    ViewNovaSenha view;
    Model model;

    public void initViewNovaSenhaController(Model model, ViewNovaSenha view) {
        this.view = view;
        this.model = model;
    }

    public void interacao(int caso){
        switch(caso){
            case 1:
                if (view.getSenha1().equals(view.getSenha2())){
                    model.setSenha(view.getEmail(), view.getSenha1());
                    //Fazer um metodo setSenha em model --> Danilo
                    //setSenha recebe o email e a nova senha --> Danilo
                    view.goLogin();
                } else {
                    view.mensagem("Nao deu");
                    view.novaSenha();
                }
            case 2:
                view.goLogin();

        }
    }



}