//Meu programa principal

package application;

import model.Cartao;

public class Program {

	public static void main(String[] args) {
//só conseguiu criar um metodo construtor vazio porque estanciou no programa cartao	
//cartao recebe  o construtor new Cartao
		Cartao cartao = new Cartao("Kamilla" , 500, 800.00);
		
		cartao.setsaldoFatura(300.00);
		cartao.diminuiLimite(200);
		System.out.println(cartao.getLimite());
		cartao.realizaCompra();
		cartao.imprimeFatura();
		
	}

}
