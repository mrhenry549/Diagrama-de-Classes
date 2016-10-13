package Exercicios131016;

public class Animal {

	public static final int INDIFERENTE=0, PEQUENO=1, MEDIO=2, GRANDE=3;
	
	char sexo;
	int id, porte;
	String raca, dataNascimento, cor;
	boolean vacinasDia;
	
	public Animal(char sexo, int id, int porte, String raca, String dataNascimento, String cor,
			boolean vacinasDia) {
		super();
		this.sexo = sexo;
		this.id = id;
		this.porte = porte;
		this.raca = raca;
		this.dataNascimento = dataNascimento;
		this.cor = cor;
		this.vacinasDia = vacinasDia;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPorte() {
		return porte;
	}

	public void setPorte(int porte) {
		this.porte = porte;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isVacinasDia() {
		return vacinasDia;
	}

	public void setVacinasDia(boolean vacinasDia) {
		this.vacinasDia = vacinasDia;
	}
	
}
