package sistema.model;

public class Palestrante extends Usuario{
	private int id; //Sera utilizado com Chave de HashMap
	
	public Palestrante(String email, String senha, String cep, String cpf, String dataNascimento, String nome, int telefone, int id) {
		super(email, senha, cep, cpf, dataNascimento, nome, telefone);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
