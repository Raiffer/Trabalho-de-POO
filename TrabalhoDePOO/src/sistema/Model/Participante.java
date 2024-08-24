package sistema.Model;
//Alguns atributos nao tem setters pois nao podem ser mudados.

public class Participante extends Usuario{
	private int id; //Sera utilizado com Chave de HashMap
	private double banco; //Atributo para simular transferencia bancária.
	
	public Participante(String email, String senha, String cep, String cpf, String dataNascimento, String nome, int telefone, int id, double banco) {
		super(email, senha, cep, cpf, dataNascimento, nome, telefone);
		this.id = id;
		this.banco = banco;
	}

	public int getId() {
		return id;
	}

	public double getBanco() {
		return banco;
	}

	public void setBanco(double banco) {
		this.banco = banco;
	}

	
}
