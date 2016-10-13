package Exercicios131016;

public class Animal {

	String tipo, raca, cor;
	int idadeAno, idadeMes;
	double peso;

	public Animal(String tipo, String raca, String cor, int idadeAno, int idadeMes, double peso) {
		super();
		this.tipo = tipo;
		this.raca = raca;
		this.cor = cor;
		this.idadeAno = idadeAno;
		this.idadeMes = idadeMes;
		this.peso = peso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdadeAno() {
		return idadeAno;
	}

	public void setIdadeAno(int idadeAno) {
		this.idadeAno = idadeAno;
	}

	public int getIdadeMes() {
		return idadeMes;
	}

	public void setIdadeMes(int idadeMes) {
		this.idadeMes = idadeMes;
	}

}
