package br.com.db1.calculadora.calculadoraapi.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="calculadora")
public class Calculadora {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="numeroUm", nullable = false, length = 14)
	private Double numeroUm;
	
	@Column(name="numeroDois", nullable = false, length = 14)
	private Double numeroDois;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "operacao", nullable = false, length = 50)
	private Operacoes operacoes;
	
	@Column(name = "data", nullable = false, length = 20)
	private LocalDateTime data;
	
	@Column(name = "resultado", nullable = false, length = 14)
	private Double resultado;
	
	protected Calculadora() {
	}
	
	public Calculadora(Double primeiroNumero, Double segundoNumero) {
		this.numeroUm = primeiroNumero;
		this.numeroDois = segundoNumero;
	}
	
	public Long getId() {
		return id;
	}
	
	public Double getNumeroUm() {
		return numeroUm;
	}
	
	public Double getNumeroDois() {
		return numeroDois;
	}
	
	public Double getResultado() {
		return resultado;
	}
	
	public Operacoes getOperacoes() {
		return operacoes;
	}
	
	public LocalDateTime getData() {
		return data;
	}
	
	public Double executaOperacao(Operacoes operacoes) {
		return operacoes.executaOperacao(this.numeroUm, this.numeroDois);
	}
}
