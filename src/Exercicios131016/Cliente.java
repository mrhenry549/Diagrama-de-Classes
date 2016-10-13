package Exercicios131016;

public class Cliente {

	String nome, morada, contacto, formaPagamento;
	double nif;

	public Cliente(String nome, String morada, String contacto, String formaPagamento, double nif) {
		super();
		this.nome = nome;
		this.morada = morada;
		this.contacto = contacto;
		this.formaPagamento = formaPagamento;
		this.nif = nif;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public double getNif() {
		return nif;
	}

	public void setNif(double nif) {
		this.nif = nif;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
}
