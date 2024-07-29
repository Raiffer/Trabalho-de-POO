package com.cmotion.entidade;

public class Participante {
	
	private int idParticipante;
    public double notaEvento;
    
	public Participante(int idParticipante, double notaEvento) {
		this.idParticipante = idParticipante;
		this.notaEvento = notaEvento;
	}

	public int getIdParticipante() {
		return idParticipante;
	}

	public void setIdParticipante(int idParticipante) {
		this.idParticipante = idParticipante;
	}

	public double getNotaEvento() {
		return notaEvento;
	}

	public void setNotaEvento(double notaEvento) {
		this.notaEvento = notaEvento;
	}
}
