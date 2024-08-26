package sistema.model;

public class Avaliacao {
	private int nota;
	private Participante participante;
	private String coment;
	private Evento event;
	private int id;
	
	public Avaliacao(int nota, Participante participante, String coment, Evento event) {
		this.nota = nota;
		this.participante = participante;
		this.coment = coment;
		this.event = event;
		this.id = participante.getId();
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public Participante getParticipante() {
		return participante;
	}

	public void setParticipante(Participante participante) {
		this.participante = participante;
	}

	public String getComent() {
		return coment;
	}

	public void setComent(String coment) {
		this.coment = coment;
	}

	public Evento getEvent() {
		return event;
	}

	public int getId() {
		return id;
	}
	
}
