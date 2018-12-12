package br.com.db1.calculadora.calculadoraapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.db1.calculadora.calculadoraapi.model.Calculadora;

public interface CalculadoraRepository extends JpaRepository<Calculadora, Long> {
}
