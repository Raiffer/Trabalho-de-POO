package sistema.model;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
//Alguns atributos nao tem setters pois nao podem ser mudados.

public class Evento {
	private String nome, local, dataInicio, dataFim;
	private int numPart;
	private double notaMedia;
	private Map<Integer, Usuario> participantes = new HashMap<>();
	private Map<Integer, Atividade> atividades = new HashMap<>();
	private Map<Integer, Avaliacao> avaliacoes = new HashMap<>();
	private Usuario organizador;
	private UUID id;

	public Evento(String nome, String local, String dataInicio, String dataFim, int numPart, Usuario organizador) {
		this.nome = nome;
		this.local = local;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.numPart = numPart;
		this.organizador = organizador;
		this.id = UUID.randomUUID();
		this.notaMedia = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	

	public int getNumPart() {
		return numPart;
	}

	public void setNumPart(int numPart) {
		this.numPart = numPart;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
		this.calcularMedia();
	}

	public UUID getId() {
		return id;
	}

	public Usuario getOrganizador() {
		return organizador;
	}

	private void calcularMedia() {
		// Esse metodo deve pegar todos as avaliacoes e tirar a media das notas, e mudar
		// diretamente no atributo notaMedia.
		// Soma das Notas / Total de Avaliações.
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	
}
