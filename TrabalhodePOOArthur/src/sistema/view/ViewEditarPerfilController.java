package sistema.view;

import sistema.model.Model;

public class ViewEditarPerfilController {
    private Model model;
    private ViewEditarPerfilController view;

    public ViewEditarPerfilController(Model model, ViewEditarPerfilController view) {
        this.model = model;
        this.view = view;
    }
    public void interacao(int caso){
        switch(caso){
            case 1: model.setEmail(view.getEmail());
            case 2: model.setSenha(view.getEmail(),view.getSenha());
            case 3: model.setNome(view.getEmail(), view.getNome());
            case 4: model.setTelefone(view.getEmail(),view.getTelefone());
            case 5: model.setCep(view.getEmail(), view.getCep());
            }
        }
    }
}
