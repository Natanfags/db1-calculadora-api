package br.com.db1.calculadora.calculadoraapi.repository.test;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.db1.calculadora.calculadoraapi.model.Calculadora;
import br.com.db1.calculadora.calculadoraapi.model.Operacao;
import br.com.db1.calculadora.calculadoraapi.repository.CalculadoraRepository;

public class CalculadoraRepositoryTest {
	
	@Autowired
	private CalculadoraRepository calculadoraRepository;
	
	@After
	public void after() {
		calculadoraRepository.deleteAll();
	}
	
	@Test
	public void deveSalvarUmResultado() {
		Calculadora calculadora = new Calculadora(10.0, 10.0, Operacao.SOMA);
		calculadoraRepository.save(calculadora);
		
		List<Calculadora> calculadoras = calculadoraRepository.findAll();
		
		Calculadora resultadoSalvo = calculadoras.get(0);
		Assert.assertEquals(calculadora.getResultado(), resultadoSalvo.getResultado());
	}
}
