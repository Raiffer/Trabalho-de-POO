package sistema.Model;
import java.util.HashMap;
//Alguns atributos nao tem setters pois nao podem ser mudados.

public class Evento {
	private String nome, local;
	private int dataInicio, dataFim, numPart;
	private boolean isPay;
	private double valorEntrada, orcamento, notaMedia;
	private HashMap<Integer, Object> listPart;
	private HashMap<Integer, Object> listAtv;
	private HashMap<Integer, Object> avaliacoes;
	private Organizador organizador;
	private TipoEvento tipo;
	
	public Evento(String nome, String local, int dataInicio, int dataFim, int numPart, boolean isPay,
			double valorEntrada, double orcamento, double notaMedia, HashMap<Integer, Object> listPart,
			HashMap<Integer, Object> listAtv, HashMap<Integer, Object> avaliacoes, Organizador organizador,
			TipoEvento tipo) {
		this.nome = nome;
		this.local = local;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.numPart = numPart;
		this.isPay = isPay;
		this.valorEntrada = valorEntrada;
		this.orcamento = orcamento;
		this.notaMedia = notaMedia;
		this.listPart = listPart;
		this.listAtv = listAtv;
		this.avaliacoes = avaliacoes;
		this.organizador = organizador;
		this.tipo = tipo;
	}
	
	public TipoEvento getTipo() {
		return tipo;
	}
	public void setTipo(TipoEvento tipo) {
		this.tipo = tipo;
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
	public int getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(int dataInicio) {
		this.dataInicio = dataInicio;
	}
	public int getDataFim() {
		return dataFim;
	}
	public void setDataFim(int dataFim) {
		this.dataFim = dataFim;
	}
	public int getNumPart() {
		return numPart;
	}
	public void setNumPart(int numPart) {
		this.numPart = numPart;
	}
	public boolean isPay() {
		return isPay;
	}
	public void setPay(boolean isPay) {
		this.isPay = isPay;
	}
	public double getValorEntrada() {
		return valorEntrada;
	}
	public void setValorEntrada(double valorEntrada) {
		this.valorEntrada = valorEntrada;
	}
	public double getOrcamento() {
		return orcamento;
	}
	public void setOrcamento(double orcamento) {
		this.orcamento = orcamento;
	}
	public double getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	public HashMap<Integer, Object> getListPart() {
		return listPart;
	}
	public void setListPart(HashMap<Integer, Object> listPart) {
		this.listPart = listPart;
	}
	public HashMap<Integer, Object> getListAtv() {
		return listAtv;
	}
	public void setListAtv(HashMap<Integer, Object> listAtv) {
		this.listAtv = listAtv;
	}
	public HashMap<Integer, Object> getAvaliacoes() {
		return avaliacoes;
	}
	public void setAvaliacoes(HashMap<Integer, Object> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
	public Organizador getOrganizador() {
		return organizador;
	}
	public void setOrganizador(Organizador organizador) {
		this.organizador = organizador;
	}
	
	public void guardarPart(int id, Object user) {
		listPart.put(id,user);
	}
	
	public void guardarAtv(int id, Object atividade) {
		listAtv.put(id,atividade);
	}
	
	public void guardarAvaliacao(int id, Object ava) {
		listAtv.put(id,ava);
		calcularMedia();
	}

	private void calcularMedia() {
		//Esse metodo deve pegar todos as avaliacoes e tirar a media das notas, e mudar diretamente no atributo notaMedia.
		//Soma das Notas / Total de Avaliações.
	}
	
}
