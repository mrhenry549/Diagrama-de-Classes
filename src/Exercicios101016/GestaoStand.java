package Exercicios101016;

import java.util.ArrayList;

public class GestaoStand {

	private ArrayList _transaccoes;
	private ArrayList _automoveis;
	private ArrayList _clientes;
	
	public GestaoStand(){
		
		_transaccoes = new ArrayList<>();
		_automoveis = new ArrayList<>();
		_clientes = new ArrayList<>();
		
		Automovel newAuto = criarCarro();
		
		Cliente c1 = new Cliente("Henrique Prego", "Palmela", "936 264 114", 859652487);
		Cliente c2 = new Cliente("Carla Simião", "Lisboa", "916 325 221", 425365240);
		
		_automoveis.add(newAuto);
		
		_clientes.add(c1);
		_clientes.add(c2);
		
		Transacao crenault = new Transacao(Transacao.COMPRA, newAuto, c1, 2300);
		
		_transaccoes.add(crenault);
		
		Transacao vrenault = new Transacao(Transacao.VENDA, newAuto, c2, 2700);
		
		_transaccoes.add(vrenault);
	}
	
	public Automovel criarCarro(){
		
		Automovel a = new Automovel (2500, 1600, "Renault", "Megane", 120000, 2002);
		// Automovel b = new Automovel (4250, 1242, "Fiat", "Punto", 50000, 2014);
		
		return a;
		
	}
	
	public Cliente criarCliente(){
		Cliente c1 = new Cliente("Henrique Prego", "Palmela", "936 264 114", 859652487);
		// Cliente c2 = new Cliente("Carla Simião", "Lisboa", "916 325 221", 425365240);
		
		return c1;
	}
	
	public Transacao comprarCarro(Automovel car, Cliente cli){
		return null;
	}
	
	public Transacao venderCarro(Automovel car, Cliente cli){
		return null;
	}

	public ArrayList get_transaccoes() {
		return _transaccoes;
	}
	
}
