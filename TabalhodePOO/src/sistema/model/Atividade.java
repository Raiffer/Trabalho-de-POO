package sistema.model;
import java.util.HashMap;
//Alguns atributos nao tem setters pois nao podem ser mudados.

public class Atividade {
	private String nome, local;
	private int data, horaInicio, horaFim;
	private HashMap<Integer, Object> listPart;
	private Palestrante palestrante;
	private Evento evento;
	private int id;
	
	public Atividade(String nome, String local, int data, int horaInicio, int horaFim,
			HashMap<Integer, Object> listPart, Palestrante palestrante, Evento evento, int id) {
		this.nome = nome;
		this.local = local;
		this.data = data;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.listPart = listPart;
		this.palestrante = palestrante;
		this.evento = evento;
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}
	public int getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(int horaFim) {
		this.horaFim = horaFim;
	}
	public HashMap<Integer, Object> getListPart() {
		return listPart;
	}
	public void setListPart(HashMap<Integer, Object> listPart) {
		this.listPart = listPart;
	}
	public Palestrante getPalestrante() {
		return palestrante;
	}
	public void setPalestrante(Palestrante palestrante) {
		this.palestrante = palestrante;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public int getId() {
		return id;
	}

		
}
