package Exercicios131016;

public class Peixe extends Animal{
	public static final int AGUA_DOCE=0, AGUA_SALGADA=1;
	public static final int FRIA=10, QUENTE=11;
	
	int tipoAgua, tempAgua;

	public Peixe(char sexo, int id, int porte, String especie, String dataNascimento, String cor, boolean vacinasDia, int tipoAgua, int tempAgua) {
		super(sexo, id, null, especie, dataNascimento, cor, vacinasDia, tipoAgua, tempAgua);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
