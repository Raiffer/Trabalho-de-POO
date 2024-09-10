package sistema.view;

import sistema.model.*;

import java.io.IOException;

public class ViewLoginController {

    private ViewLogin view; // Referência para a view de login
    private Model model;    // Referência para o modelo que contém a lógica de dados
    
    public void initViewLoginController(Model model, ViewLogin view){
        this.model = model;
        this.view = view;
    }
    
    public void interacao(int caso) throws IOException {
        switch (caso){
            case 1: // Caso para login do usuário
                // Verifica se o usuário e a senha estão corretos
                if(model.verificarUsuario(view.getEmail(), view.getSenha())){
                    view.mensagem("Usuário verificado"); // Mensagem de sucesso
                    view.goMenu(view.getEmail()); // Navega para o menu principal
                } else {
                    // Mensagem de erro e retorno ao menu de login após pressionar Enter
                    view.mensagem("Login ou Senha inválido, pressione Enter para continuar.");
                    System.in.read(); // Aguarda o usuário pressionar Enter
                    view.menu(); // Retorna ao menu de login
                }
                break;
            case 2: // Caso para navegação para a tela de cadastro
                view.goCadastro(); // Navega para a tela de cadastro
                break;
            case 3: // Caso para navegação para a tela de redefinição de senha
                view.goRedefinirSenha(); // Navega para a tela de redefinição de senha
                break;
            // Caso para ações futuras pode ser adicionado aqui
            default:
                view.mensagem("Opção inválida"); // Mensagem para opções não reconhecidas
                view.menu(); // Retorna ao menu de login
                break;
        }
    }
}
