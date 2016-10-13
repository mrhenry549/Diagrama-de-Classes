package Exercicios101016;

import java.util.ArrayList;

public class BigBoss {
	
	ArrayList<GestaoStand> _stands;
	
	public BigBoss(){
		_stands = new ArrayList<GestaoStand>();
		
		GestaoStand raminhos = new GestaoStand();
		
		_stands.add(raminhos);
		
		LucrosStand(raminhos);
		
		RelatorioStand(raminhos);
	}
	
	private void RelatorioStand(GestaoStand stand){
		ArrayList tr = stand.get_transaccoes();
		
		int totalTransacoes = tr.size();
		
		System.out.println("O stand teve: "+totalTransacoes+" transações.");
		
		double lucro = LucrosStand(stand);
	}
	
	private double LucrosStand(GestaoStand stand){
		
		ArrayList tr = stand.get_transaccoes();
		
		double lucro=0, vendas=0, compras=0;
		
		for(int i=0; i<tr.size(); i++){
			Transacao t = (Transacao) tr.get(i);
			
			if(t.getTipo() == Transacao.COMPRA)
				compras = compras + t.getPreco();
			else if (t.getTipo() == Transacao.VENDA)
				vendas = vendas + t.preco;
			
		}
		
		lucro = vendas - compras;
		
		System.out.println("O stand lucrou: "+lucro+" euros.");
		
		return lucro;
		
	}
}
