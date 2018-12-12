package br.com.db1.calculadora.calculadoraapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.db1.calculadora.calculadoraapi.model.Calculadora;
import br.com.db1.calculadora.calculadoraapi.model.Operacao;
import br.com.db1.calculadora.calculadoraapi.service.CalculadoraService;

@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {
	
	@Autowired
	private CalculadoraService calculadoraService;
	
	@GetMapping()
	public Calculadora salvaResultado(@RequestParam("numeroUm")Double numeroUm,
			@RequestParam("numeroDois")Double numeroDois,
			@RequestParam("operacao")Operacao operacao ) {
		Calculadora calculadora = calculadoraService.salvaResultado(numeroUm, numeroDois, operacao);
		return calculadora;
	}
}
