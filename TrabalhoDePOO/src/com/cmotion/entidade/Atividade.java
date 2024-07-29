package com.cmotion.entidade;

public class Atividade {
	
	private String nome, horario, data, local, descricao;
	private int idEvento;
	
	public Atividade(String nome, String horario, String data, String local, String descricao, int idEvento) {
		this.nome = nome;
		this.horario = horario;
		this.data = data;
		this.local = local;
		this.descricao = descricao;
		this.idEvento = idEvento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
}
