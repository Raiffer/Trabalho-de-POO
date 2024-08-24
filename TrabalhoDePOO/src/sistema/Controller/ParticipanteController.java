package sistema.Controller;
import sistema.Model.*;

public class ParticipanteController extends Participante{

	public ParticipanteController(String email, String senha, String cep, String cpf, String dataNascimento,
			String nome, int telefone, int id, double banco) {
		super(email, senha, cep, cpf, dataNascimento, nome, telefone, id, banco);
	}
	
	public void avaliarEvento(int nota, String coment, Evento event) {
		Avaliacao ava = new Avaliacao(nota,this,coment, event );
		event.guardarAvaliacao(this.getId(), ava);
	}
	
	//fazer o metodo entrarEvento();
	
	//fazer o metodo sairEvento();
	
	//fazer o metodo entrarAtividade();
	
	//fazer o metodo sairAtividade();
	
}
