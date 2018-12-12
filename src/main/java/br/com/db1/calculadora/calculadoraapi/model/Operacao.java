package br.com.db1.calculadora.calculadoraapi.model;

public enum Operacao {
	
	SOMA {
		@Override
		public Double executaOperacao(Double primeiroNumero, Double segundoNumero) {
			return primeiroNumero + segundoNumero;
		}
	},
	SUBTRACAO {
		@Override
		public Double executaOperacao(Double primeiroNumero, Double segundoNumero) {
			return primeiroNumero - segundoNumero;
		}
	}, 
	DIVISAO {
		@Override
		public Double executaOperacao(Double primeiroNumero, Double segundoNumero) {
			return primeiroNumero / segundoNumero;
		}
	},
	MULTIPLICACAO {
		@Override
		public Double executaOperacao(Double primeiroNumero, Double segundoNumero) {
			return primeiroNumero * segundoNumero;
		}
	};
	
	public abstract Double executaOperacao(Double primeiroNumero, Double segundoNumero);
}
