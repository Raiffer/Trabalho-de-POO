package sistema.view;

import sistema.model.Model;

import java.io.IOException;

public class ViewCadastroController {
    private ViewCadastro view;
    private Model model;

    public void initViewCadastroController(Model model, ViewCadastro view) {
        this.view = view;
        this.model = model;
    }

    public void interacao(int caso) throws IOException {
        switch(caso){
            case 1:
                if(model.criarUsuario(view.getEmail(), view.getSenha(), view.getCep(), view.getCpf(),view.getDataNascimento(), view.getNome(), view.getTelefone())){
                    view.mensagem("Usuario Cadastrado com sucesso!");
                    view.goLogin();
                }else{
                    view.mensagem("Credenciais invalidas - Tente novamente!");
                    view.cadastrar();
                }
                break;
            case 2:
                view.goLogin();
                break;
            case 3: view.cadastrar(); break;
            case 4: view.menu(); break;
            case 5:
                view.mensagem("Opcao Invalida! - Pressione Enter para continuar.");
                System.in.read();
                view.menu();
                break;
        }
    }

}