package br.com.db1.calculadora.calculadoraapi.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.calculadora.calculadoraapi.model.Calculadora;
import br.com.db1.calculadora.calculadoraapi.model.Operacao;

public class CalculadoraTest {
	
	@Test
	public void deveRetornarSoma() {
		Calculadora calculadora = new Calculadora(4.0, 2.0);
		
		Double operacaoSoma = calculadora.executaOperacao(Operacao.SOMA);
		
		Assert.assertEquals(6.0, operacaoSoma, 0.0);
	}
	
	@Test
	public void deveRetornaqrSubtracao() {
		Calculadora calculadora = new Calculadora(4.0, 2.0);
		
		Double operacaoSubtrai = calculadora.executaOperacao(Operacao.SUBTRACAO);
		
		Assert.assertEquals(2.0, operacaoSubtrai, 0.0);
	}
	
	@Test
	public void deveRetornarMultiplicacao() {
		Calculadora calculadora = new Calculadora(4.0, 2.0);
		
		Double operacaoMultiplica= calculadora.executaOperacao(Operacao.MULTIPLICACAO);
		
		Assert.assertEquals(8.0, operacaoMultiplica, 0.0);
	}
	
	@Test
	public void deveRetornarDivisao() {
Calculadora calculadora = new Calculadora(4.0, 2.0);
		
		Double operacaoDivisao = calculadora.executaOperacao(Operacao.DIVISAO);
		
		Assert.assertEquals(2.0, operacaoDivisao, 0.0);
	}
}
