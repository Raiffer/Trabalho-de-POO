package sistema.model;

public enum TipoUsuario {
		ALUNO("Aluno do evento"),
		PALESTRANTE("Palestrante do evento"),
		ORGANIZADOR("Organizador do evento");

		private final String descricao;

		// Construtor
		TipoUsuario(String descricao) {
			this.descricao = descricao;
		}

}
