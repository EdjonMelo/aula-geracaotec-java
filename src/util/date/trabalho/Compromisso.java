package util.date.trabalho;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Compromisso {
	private Date data;
	private String titulo;
	private String descricao;
	
	public Compromisso(Date data, String titulo, String descricao) {
		setData(data);
		setDescricao(descricao);
		setTitulo(titulo);
	}
	
	public String toString() {
		return data.toLocaleString() + " " + titulo + " " + descricao;
	}
	
	
	public Date getData() {
		return data;
	}
	
	public String getDataString()  {
		DateFormat dt = new SimpleDateFormat("ddMMyyyy");
		return dt.format(data);
	}
	
	public String getMesCompromisso() {
		DateFormat dt = new SimpleDateFormat("M");
		return dt.format(data);
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
}
