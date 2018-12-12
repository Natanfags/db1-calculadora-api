package br.com.db1.calculadora.calculadoraapi.model;


public class Calculadora {
	
	private Double numeroUm;
	private Double numeroDois;
	
	public Calculadora(Double primeiroNumero, Double segundoNumero) {
		this.numeroUm = primeiroNumero;
		this.numeroDois = segundoNumero;
	}
	
	public Double executaOperacao(Operacoes operacoes) {
		return operacoes.executaOperacao(this.numeroUm, this.numeroDois);
	}

	
}
