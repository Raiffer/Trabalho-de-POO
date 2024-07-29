package com.cmotion.entidade;

public class Organizador extends Usuario {

	private int idOrganizador, orcamento, gastos;

	public Organizador(String nome, String dataNascimento, String email, String senha, String cpf, int telefone,
			int cep) {
		super(nome, dataNascimento, email, senha, cpf, telefone, cep);
	}

	public int getIdOrganizador() {
		return idOrganizador;
	}

	public void setIdOrganizador(int idOrganizador) {
		this.idOrganizador = idOrganizador;
	}

	public int getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(int orcamento) {
		this.orcamento = orcamento;
	}

	public int getGastos() {
		return gastos;
	}

	public void setGastos(int gastos) {
		this.gastos = gastos;
	}
}