package sistema.controller;
import java.util.HashMap;

import sistema.model.*;

public class OrganizadorController extends Organizador{

	public OrganizadorController(String email, String senha, String cep, String cpf, String dataNascimento, String nome,
			int telefone, int id) {
		super(email, senha, cep, cpf, dataNascimento, nome, telefone, id);
	}
	
	public Evento criarEvento(String nome, String local, int dataInicio, int dataFim, int numPart, boolean isPay,
			double valorEntrada, double orcamento, double notaMedia, HashMap<Integer, Object> listPart,
			HashMap<Integer, Object> listAtv, HashMap<Integer, Object> avaliacoes, Organizador organizador,
			TipoEvento tipo) { 
		Evento event = new Evento( nome,  local,  dataInicio,  dataFim,  numPart,  isPay,
				 valorEntrada,  orcamento,  notaMedia, listPart,listAtv,  avaliacoes,  organizador, tipo);
		return event;
		//Metodo rudimentar, é preciso criar verificacoes para nomes datas e locais
		//Dois eventos nunca podem ter o mesmo nome.
		//Dois eventos não podem ter mesma data caso tenham mesmo local e vise-versa.
	}

	//fazer o metodo deletarEvento();
	
	//fazer o metodo criarAtividade();
	
	//fazer o metodo deletarAtividade();
}
