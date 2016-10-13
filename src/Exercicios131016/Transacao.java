package Exercicios131016;

public class Transacao {

	int tipo;
	Animal animal;
	Materiais material;
	Cliente cliente;
	double preco;

	public Transacao(int tipo, Animal animal, Materiais material, Cliente cliente, double preco) {
		super();
		this.tipo = tipo;
		this.animal = animal;
		this.material = material;
		this.cliente = cliente;
		this.preco = preco;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Materiais getMaterial() {
		return material;
	}

	public void setMaterial(Materiais material) {
		this.material = material;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
