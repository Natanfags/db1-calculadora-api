package br.com.db1.calculadora.calculadoraapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.db1.calculadora.calculadoraapi.dto.CalculadoraDTO;
import br.com.db1.calculadora.calculadoraapi.model.Calculadora;
import br.com.db1.calculadora.calculadoraapi.service.CalculadoraService;

@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {
	
	@Autowired
	private CalculadoraService calculadoraService;
	
	@PostMapping()
	public Calculadora salvaResultado(@RequestBody CalculadoraDTO calculadora){
		return calculadoraService.salvaResultado(
				calculadora.getNumeroDois(), 
				calculadora.getNumeroUm(), 
				calculadora.getOperacao());
	}
}
