package sistema.model;

import java.util.HashMap;
import java.util.Map;

public class Model {
	private Map<String, Usuario> usuarios = new HashMap<>();
	private Map<String, Evento> eventos = new HashMap<>();
	private Map<String, Atividade> atividades = new HashMap<>();

	public Model(){
		criarUsuario("bernardoraiffer@gmail.com","12345","23123141", "06536324366",
				"11/08/2004","Shaolin Matador de Porco", 40028922);
		criarUsuario("rianlucas@gmail.com","54321","1231451", "06536324366",
				"27/09/2004","Flavinho do Pneu", 192520);
		criarEvento("Sescomp", "UFC - Campus Russas", "11/11", "14/11", "bernardoraiffer@gmail.com");
		entrarEvento("rianlucas@gmail.com", "Sescomp");
		System.out.println(eventos.get("Sescomp").getParticipante("rianlucas@gmail.com"));
	}

	public boolean criarUsuario(String email, String senha, String cep, String cpf, String dataNascimento, String nome,
			int telefone) {
		if (verificarCPF(cpf)) {
			Usuario user = new Usuario(email, senha, cep, cpf, dataNascimento, nome, telefone);
			usuarios.put(user.getEmail(), user);
			return true;
		}
		return false;
	}

	public void criarEvento(String nome, String local, String dataInicio, String dataFim,String organizador) {
		Evento evento = new Evento(nome, local, dataInicio, dataFim, usuarios.get(organizador));
		eventos.put(nome, evento);
	}

	public boolean verificarEvento(String evento,String local,String dataInicio, String dataFim) {//Melhorar essa verificação
		if (eventos.containsKey(evento) || (verificarLocal(local))) {
			return false;
		}
		return true;
	}

	public boolean verificarEvento(String evento) {
        return eventos.containsKey(evento);
    }

	public boolean verificarAtividade(String atividade) {
        return atividades.containsKey(atividade);
    }

	public boolean criarAtividade(String nome, String data, String horaInicio, String horaFim, String evento) {
		Atividade atividade = new Atividade(nome, data, horaInicio, horaFim, eventos.get(evento));
		atividades.put(atividade.getNomeAtv(), atividade);
		return true;
	}

	public boolean verificarUsuario(String email, String senha) {
        return usuarios.containsKey(email) && usuarios.get(email).getSenha().equals(senha);
    }
	
	public boolean verificarLocal(String local) {
		for (Map.Entry<String, Evento> entry : eventos.entrySet()) {
			if ( entry.getValue().getLocal().equalsIgnoreCase(local)) {
				return false;
			}
		}
		return true;
	}

	public boolean verificarParticipante(String participante, String evento) {
		Evento event = eventos.get(evento);
		return event.getParticipantes().containsValue(usuarios.get(participante));
    }

	public void recuperarSenha(String email, String senha) {
		for (Usuario usuario : usuarios.values()) {
			if (usuario.getEmail().equals(email)) {
				usuario.setSenha(senha);
			}
		}
	}

	public HashMap<String, String> mostrarEventos(){
		HashMap<String, String> event = new HashMap<>();
		for (Map.Entry<String, Evento> entry : eventos.entrySet()) {
			event.put(entry.getKey(), entry.getValue().getNome());
		}
		return event;
	}

	public void setTelefone(String email, int telefone) {
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

	public void setDataAtv(String atv, String data) {
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

	public String getUsuarioDataNascimento(String email) {
		return usuarios.get(email).getDataNascimento();
	}

	public String getUsuarioNome(String email) {
		return usuarios.get(email).getNome();
	}

	public int getUsuarioTelefone(String email) {
		return usuarios.get(email).getTelefone();
	}

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

	public String getDataAtv(String nome){
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

	public void deletarUsuario(String email){

		if (usuarios.get(email).getEmail().equals(email)){
			usuarios.remove(email);
		}
	}
	public void deletarEvento(String nome){
		if (eventos.get(nome).getNome().equals(nome)){
			eventos.remove(nome);
		}
	}
	public void deletarAtiviade(String nome){
		if (atividades.get(nome).getNomeAtv().equals(nome)){
			atividades.remove(nome);
		}
	}

	public boolean verificarCPF(String cpf) {
		// Verifica se o CPF tem 11 dígitos
		if (cpf == null || cpf.length() != 11 || !cpf.matches("\\d+")) {
			return false;
		}

		// Verifica se todos os dígitos são iguais (caso inválido)
		if (cpf.matches("(\\d)\\1{10}")) {
			return false;
		}

		try {
			// Cálculo do primeiro dígito verificador
			int sum = 0;
			for (int i = 0; i < 9; i++) {
				sum += (cpf.charAt(i) - '0') * (10 - i);
			}
			int firstVerifier = 11 - (sum % 11);
			if (firstVerifier == 10 || firstVerifier == 11) {
				firstVerifier = 0;
			}

			// Verifica o primeiro dígito verificador
			if (firstVerifier != (cpf.charAt(9) - '0')) {
				return false;
			}

			// Cálculo do segundo dígito verificador
			sum = 0;
			for (int i = 0; i < 10; i++) {
				sum += (cpf.charAt(i) - '0') * (11 - i);
			}
			int secondVerifier = 11 - (sum % 11);
			if (secondVerifier == 10 || secondVerifier == 11) {
				secondVerifier = 0;
			}

			// Verifica o segundo dígito verificador
			return secondVerifier == (cpf.charAt(10) - '0');

		} catch (NumberFormatException e) {
			return false;
		}
	}

}
