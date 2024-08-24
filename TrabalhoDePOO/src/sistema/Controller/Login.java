package sistema.Controller;
import sistema.Model.*;

public class Login {
	
	public Object criarUsario (String email, String senha, String cep, String cpf, String dataNascimento, String nome, 
					int telefone, TipoUsuario u, int id, double banco) {
		if (verificarCPF(cpf)) {
			//Os Ids estão sendo escolhidos manualmente, encontrar um jeito melhor de se escolher um Id.
			switch(u) {
				case PARTICIPANTE:
					Participante part = new Participante(email, senha, cep, cpf, dataNascimento, nome, telefone, id, banco);
					return part;
				case PALESTRANTE:
					Palestrante pals = new Palestrante(email, senha, cep, cpf, dataNascimento, nome, telefone, id);
					return pals;
				case ORGANIZADOR:
					Organizador org = new Organizador(email, senha, cep, cpf, dataNascimento, nome, telefone, id);
					return org;
			}
		} return null;
	}

	private boolean verificarCPF(String cpf) { 
		// Classe incompleta, ela deve receber uma string de 11 digitos, e retornar um booleano
		// Algoritno a ser implementado --> https://dicasdeprogramacao.com.br/algoritmo-para-validar-cpf/
		return true;
	}
	
	public String recuperarSenha(Usuario u) { //Muito rudimentar, implementar metodos de verificação, pedindo outros dados por exemplo.
		return u.getSenha();
	}
}