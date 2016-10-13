package Exercicios131016;

public class Materiais {

	String tipo, classe, cor, marca;
	double peso;
	
	public Materiais(String tipo, String classe, String cor, String marca, double peso) {
		super();
		this.tipo = tipo;
		this.classe = classe;
		this.cor = cor;
		this.marca = marca;
		this.peso = peso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
