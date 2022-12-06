package com.keyla.apicharadas.model;


public class Charadas {
	
	private String titulo;
	private String pergunta;
	private String resposta;
	
	
	
	public Charadas(String titulo, String pergunta, String resposta) {
		super();
		this.titulo = titulo;
		this.pergunta = pergunta;
		this.resposta = resposta;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	

}
