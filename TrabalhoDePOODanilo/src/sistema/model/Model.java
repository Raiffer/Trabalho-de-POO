package sistema.model;
import java.util.HashMap;
import java.util.Map;
import sistema.view.*;


public class Model {
	private Map<String, Usuario> usuarios = new HashMap<>();
	private Map<String , Evento> eventos = new HashMap<>();
	private Map<String, Atividade> atividades = new HashMap<>();
	
	private boolean verificarCPF(String cpf) {
		//Fazer essa parada funcionar
		return true;
	}	
	
	public boolean criarUsuario(String email, String senha, String cep, String cpf, String dataNascimento, String nome, int telefone) {
		if (verificarCPF(cpf)) {
			Usuario user = new Usuario( email,  senha,  cep,  cpf,  dataNascimento,  nome, telefone);
			usuarios.put(user.getId() , user);
			return true;
		}
		return false;
	}

	public boolean criarEvento(String nome, String local, String dataInicio, String dataFim,  Usuario organizador) {
		Evento evento = new Evento( nome,  local,  dataInicio,  dataFim,  organizador);
		eventos.put(evento.getNome(), evento);
			return true;
	}
	
	public boolean criarAtividade(String nome, String data, String horaInicio, String horaFim, Evento evento) {
		Atividade atividade = new Atividade( nome,  data,  horaInicio,  horaFim,  evento);
		atividades.put(atividade.getNome(), atividade);
			return true;
	}

	public boolean verificarLogin(String email, String senha) {
		if(usuarios.containsKey(email) && usuarios.get(email).getSenha().equals(senha)){
				return true;
			}

		return false;
	}
public void recuperarSenha(String email) {
	for (Usuario usuario : usuarios.values()) {
		if (usuario.getEmail().equals(email)) {
			usuario.setSenha(view.senha);
		}
	}
}
	public void setTelefone(String email, int telefone) {
		usuarios.get(email).setTelefone(telefone);
	}
	public void setSenha(String email, String senha) {
		usuarios.get(email).setSenha(senha);
	}
	public void setEmail(String email) {
		usuarios.get(email).setEmail(email);
	}
	public void setNome(String email, String nome) {
		usuarios.get(email).setNome(nome);
	}
	public void setCep(String email, String cep) {
		usuarios.get(email).setCep(cep);
	}
	public void setNomeEvento(String evento,String nome){
		eventos.get(evento).setnomeEvento(nome);
	}
	public void setNotamedia(String evento, int nota){
		eventos.get(evento).setNotaMedia(nota);
	}
	public void setLocal(String evento , String local){
		eventos.get(evento).setLocal(local);
	}
	public void setDataInicio(String evento,String datainicio){
		eventos.get(evento).setDataInicio(datainicio);
	}
	public void setDataFim(String evento, String datafim){
		eventos.get(evento).setDataFim(datafim);
	}
	public void setNomeAtv(String atv, String nome){
		atividades.get(atv).setNomeAtv(nome);
	}
	public void setDataAtv(String atv, String data){
		atividades.get(atv).setDataAtv(data);
	}
	public void setHoraIncioAtv(String atv, String hora){
		atividades.get(atv).setHoraInicioAtv(hora);
	}
	public void setHoraFimAtv(String atv, String hora){
		atividades.get(atv).setHoraFimAtv(hora);
	}
	public void setEventoAtv(String atv, String evento){
		atividades.get(atv).setEventoAtv(eventos.get(evento));
	}
	public void entrarEvento(Usuario usuario, String evento){
		eventos.get(evento).guardarUsuario(usuario);
	}

}


