package sistema.model;

import java.util.HashMap;
//Alguns atributos nao tem setters pois nao podem ser mudados.

public class Atividade {
	private String nome;
	private String data, horaInicio, horaFim;
	private HashMap<String, Object> listPart;
	private Usuario palestrante;
	private Evento evento;

	public Atividade(String nome, String data, String horaInicio, String horaFim, Evento evento) {
		this.nome = nome;
		this.data = data;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.evento = evento;
	}

	public String getNomeAtv() {
		return nome;
	}

	public void setNomeAtv(String nome) {
		this.nome = nome;
	}

	public String getDataAtv() {
		return data;
	}

	public void setDataAtv(String data) {
		this.data = data;
	}

	public String getHoraInicioAtv() {
		return horaInicio;
	}

	public void setHoraInicioAtv(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFimAtv() {
		return horaFim;
	}

	public void setHoraFimAtv(String horaFim) {
		this.horaFim = horaFim;
	}

	public Usuario getPalestrante() {
		return palestrante;
	}

	public void setPalestrante(Usuario palestrante) {
		this.palestrante = palestrante;
	}

	public Evento getEventoAtv() {
		return evento;
	}

	public void setEventoAtv(Evento evento) {
		this.evento = evento;
	}
	
	public void guardarPart(Usuario usuario) {
		listPart.put(usuario.getNome(), usuario);
	}


}