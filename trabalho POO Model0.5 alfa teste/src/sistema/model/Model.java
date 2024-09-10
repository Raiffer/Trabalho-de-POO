package sistema.model;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
public class Model {
	private Map<String, Usuario> usuarios = new HashMap<>();
	private Map<String, Evento> eventos = new HashMap<>();
	private Map<String, Atividade> atividades = new HashMap<>();

	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	public HashMap<String, String> mostrarEventos(){
		HashMap<String, String> event = new HashMap<>();
		for (Map.Entry<String, Evento> entry : eventos.entrySet()) {
			event.put(entry.getKey(), entry.getValue().getNome());
		}
		return event;
	}
public Model(){
		criarUsuario("bernardoraiffer@gmail.com","12345","23123141", "06536324366",
				11082004,"Shaolin Matador de Porco", "40028922");
		criarUsuario("daniloallvesgx44@gmail.com","54321","2020", "05157719370",
				27092004,"Flavinho do Pneu", "190");
		criarEvento("Sescomp", "UFC - Campus Russas", "11/11", "14/11", "bernardoraiffer@gmail.com");
		entrarEvento("daniloallvesgx44@gmail.com", "SESCOMP");
	}

	public boolean criarUsuario(String email, String senha, String cep, String cpf, int dataNascimento, String nome,
								String telefone) {
		if (verificarCPF(cpf)) {
			Usuario user = new Usuario(email, senha, cep, cpf, dataNascimento, nome, telefone);
			usuarios.put(user.getEmail(), user);
			return true;
		}
		return false;
	}

	public void criarEvento(String nome, String local, String dataInicio, String dataFim,String organizador) {
		Evento evento = new Evento(nome, local, dataInicio, dataFim, usuarios.get(organizador));
		eventos.put(nome.toUpperCase(), evento);
	}

	public boolean verificarAtividade(String atividade) {
		return atividades.containsKey(atividade);
	}
	public boolean verificarEvento(String evento) {
		return eventos.containsKey(evento);
	}
	public boolean verificarEvento(String evento,String local,String dataInicio, String dataFim) {//Melhorar essa verificação
		if (eventos.containsKey(evento) || (verificarLocal(evento, local))) {
			return false;
		}
		return true;
	}

	public boolean criarAtividade(String nome, int data, String horaInicio, String horaFim, String evento) {
		Atividade atividade = new Atividade(nome , data, horaInicio, horaFim, eventos.get(evento));
		atividades.put(atividade.getNomeAtv().toUpperCase(), atividade);
		return true;
	}

	public boolean verificarUsuario(String email, String senha) {
        return usuarios.containsKey(email) && usuarios.get(email).getSenha().equals(senha);
    }
	
	public boolean verificarLocal(String nome,String local ) {
		 if (eventos.get(nome).getLocal().equals(local)){
			 return true;
		}
		 return false;

    }

	public void recuperarSenha(String email, String senha) {
		for (Usuario usuario : usuarios.values()) {
			if (usuario.getEmail().equals(email)) {
				usuario.setSenha(senha);
			}
		}
	}

	public void setTelefone(String email, String telefone) {
		usuarios.get(email).setTelefone(telefone);
	}

	public void setSenha(String email, String senha) {
		usuarios.get(email).setSenha(senha);
	}

	public void setEmail(String email, String newEmail) {
		usuarios.get(email).setEmail(newEmail);
		usuarios.put(newEmail, usuarios.get(email));
		usuarios.remove(email);
	}

	// Getters usuario

	public String getUsuarioEmail(String email) {
		return usuarios.get(email).getEmail();
	}

	public String getUsuarioSenha(String email) {
		return usuarios.get(email).getSenha();
	}

	public String getUsuarioCep(String email) {
		return usuarios.get(email).getCep();
	}

	public String getUsuarioCpf(String email) {
		return usuarios.get(email).getCpf();
	}

	public int getUsuarioDataNascimento(String email) {
		return usuarios.get(email).getDataNascimento();
	}

	public String getUsuarioNome(String email) {
		return usuarios.get(email).getNome();
	}

	public String getUsuarioTelefone(String email) {
		return usuarios.get(email).getTelefone();
	}

	// Getters evento

	public String getEventoNome(String evento) {
		return eventos.get(evento.toUpperCase()).getNome();
	}

	public String getEventoLocal(String evento) {
		return eventos.get(evento.toUpperCase()).getLocal();
	}

	public double getEventoNotaMedia(String evento) {
		return eventos.get(evento.toUpperCase()).getNotaMedia();
	}

	public Usuario getEventoOrganizador(String evento) {
		return eventos.get(evento.toUpperCase()).getOrganizador();
	}

	public String getEventoDataInicio(String evento) {
		return eventos.get(evento.toUpperCase()).getDataInicio();
	}

	public String getEventoDataFim(String evento) {
		return eventos.get(evento.toUpperCase()).getDataFim();
	}
	 //Getters atividade

	public int getDataAtv(String nome){
		return atividades.get(nome).getDataAtv();
	}
	public String getNomeAtv(String nome){
		return atividades.get(nome).getNomeAtv();
	}
	public String getHoraInicioAtv(String nome){
		return atividades.get(nome).getHoraInicioAtv();
	}
	public String getHoraFimAtv(String nome){
		return atividades.get(nome).getHoraFimAtv();
	}
	public Usuario getPalestrante(String nome){
		return atividades.get(nome).getPalestrante();
	}
	public Evento getEventoAtv(String nome ){
		return atividades.get(nome).getEventoAtv();
	}
	public void guardarPart( String atv,Usuario usuario) {
		atividades.get(atv).guardarPart(usuario);

	}



	public void setNome(String email, String nome) {
		usuarios.get(email).setNome(nome);
	}

	public void setCep(String email, String cep) {
		usuarios.get(email).setCep(cep);
	}

	public void setNomeEvento(String evento, String nome) {
		eventos.get(evento).setnomeEvento(nome);
	}

	public void setNotamedia(String evento, int nota) {
		eventos.get(evento).setNotaMedia(nota);
	}

	public void setLocal(String evento, String local) {
		eventos.get(evento).setLocal(local);
	}

	public void setDataInicio(String evento, String datainicio) {
		eventos.get(evento).setDataInicio(datainicio);
	}

	public void setDataFim(String evento, String datafim) {
		eventos.get(evento).setDataFim(datafim);
	}

	public void setNomeAtv(String atv, String nome) {
		atividades.get(atv).setNomeAtv(nome);
	}

	public void setDataAtv(String atv, int  data) {
		atividades.get(atv).setDataAtv(data);
	}

	public void setHoraIncioAtv(String atv, String hora) {
		atividades.get(atv).setHoraInicioAtv(hora);
	}

	public void setHoraFimAtv(String atv, String hora) {
		atividades.get(atv).setHoraFimAtv(hora);
	}

	public void setEventoAtv(String atv, String evento) {
		atividades.get(atv).setEventoAtv(eventos.get(evento));
	}

	public void entrarEvento(String usuario, String evento) {
		eventos.get(evento).guardarUsuario(usuarios.get(usuario));
	}

	public String getUsuario(String email) {
		return usuarios.get(email).getNome();
	}

	public String getOrganizador(String evento) {
		return eventos.get(evento).getOrganizador().getEmail();
	}

	public void removerEvento(String evento) {
		eventos.remove(evento);
	}

	public void removerAtividade(String atividade) {
		atividades.remove(atividade);
	}
	public void setPalestrante(String atv,Usuario palestrante){
		atividades.get(atv).setPalestrante(palestrante);
	}

	private boolean verificarCPF(String cpf) {
		cpf = cpf.replaceAll("[^\\d]", "");

		if (cpf.length() != 11) {
			return false;
		}

		if (cpf.matches("(\\d)\\1{10}")) {
			return false;
		}

		try {
			int[] peso1 = { 10, 9, 8, 7, 6, 5, 4, 3, 2 };
			int[] peso2 = { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2 };

			int soma1 = 0, soma2 = 0;

			for (int i = 0; i < 9; i++) {
				soma1 += (cpf.charAt(i) - '0') * peso1[i];
				soma2 += (cpf.charAt(i) - '0') * peso2[i];
			}

			int digito1 = 11 - (soma1 % 11);
			digito1 = (digito1 > 9) ? 0 : digito1;

			soma2 += digito1 * peso2[9];

			int digito2 = 11 - (soma2 % 11);
			digito2 = (digito2 > 9) ? 0 : digito2;

			return digito1 == (cpf.charAt(9) - '0') && digito2 == (cpf.charAt(10) - '0');
		} catch (NumberFormatException e) {
			return false;
		}

	}
}
