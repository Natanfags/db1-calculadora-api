package br.com.db1.calculadora.calculadoraapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.db1.calculadora.calculadoraapi.model.Calculadora;
import br.com.db1.calculadora.calculadoraapi.repository.CalculadoraRepository;

@Service
public class CalculadoraService {
	
	@Autowired
	private CalculadoraRepository calculadoraRepository;
	
	public Calculadora salvaResultado(Double numeroUm, Double numeroDois) {
		Calculadora calculadora = new Calculadora(numeroUm, numeroDois);
		calculadoraRepository.save(calculadora);
		return calculadora;
	}

}
