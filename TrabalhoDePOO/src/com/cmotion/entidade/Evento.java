package com.cmotion.entidade;

public class Evento {
	
	private String data, nome, hora;
	private int limiteParticipantes, valor;
	
	public Evento(String data, String nome, String hora, int limiteParticipantes, int valor) {
		this.data = data;
		this.nome = nome;
		this.hora = hora;
		this.limiteParticipantes = limiteParticipantes;
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getLimiteParticipantes() {
		return limiteParticipantes;
	}

	public void setLimiteParticipantes(int limiteParticipantes) {
		this.limiteParticipantes = limiteParticipantes;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}