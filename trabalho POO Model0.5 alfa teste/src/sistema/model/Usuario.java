package sistema.model;

public class Usuario {
	private String email, senha, cep, cpf,nome, telefone;
	private int dataNascimento;
	
	public Usuario(String email, String senha, String cep, String cpf, int dataNascimento, String nome, String telefone) {
		this.email = email;
		this.senha = senha;
		this.cep = cep;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public Usuario() {
		
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public int getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}