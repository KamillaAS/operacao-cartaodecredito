//4. Crie uma classe que represente um cartão de crédito, que deve ter como atributos o
//seu limite,o saldoFatura da fatura e nome do cliente. Crie também os métodos aumentaLimite(),
//diminuiLimite(), realizaCompra() que não deve permitir uma compra caso o limite tenha sido
//atingido e o imprimeFatura() que imprime na tela o valor da fatura.

//Crie um programa principal capaz de executar as operações do cartão de crédito.

//Modelo de  entidades Cartao.java


package model;

public class Cartao {
	private String nome;
	private Integer limite;
	private Double saldoFatura;
	
//1 cria primeiro o construtor vazio	
	public Cartao() {
	
	}

//2 criar depois o construtor com atributos
	public Cartao(String nome, Integer limite, Double saldoFatura) {
		super();
		this.nome = nome;
		this.limite = limite;
		this.saldoFatura = saldoFatura;
	}

//3 criar getter e setter 
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getLimite() {
		return limite;
	}


	public void setLimite(Integer limite) {
		this.limite = limite;
	}


	public Double getsaldoFatura() {
		return saldoFatura;
	}

//
	public void setsaldoFatura(Double saldoFatura) {
		this.saldoFatura = saldoFatura;
	}
	
//criar métodos aumenta limite/ this referencia os nossos atributos da classe
	
	public void aumentaLimite(Integer aumento) {
		this.limite += aumento;	
	}
//criar metodo diminuir limite
	
	public void diminuiLimite(Integer diminui) {
		this.limite -= diminui; //produto da classe
	}

//criar metodo realiza compra/ paramentro
	
	public void realizaCompra() { //parametro produto
		if (this.saldoFatura >= this.limite) {
			System.out.println("Limite atingido ");		
		}
		else {
			System.out.println("Compra realizada com sucesso ");
		}
		
	}
	
	public void imprimeFatura() {
		System.out.println("Valor da fatura R$" + this.saldoFatura);
	}
	
	
}
