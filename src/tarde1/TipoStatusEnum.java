package tarde1;

public enum TipoStatusEnum {
	
	TRANQUILO {
		@Override
		double velocidadeAtualizada(double velocidade) {
			return velocidade * 1;
		}
	}, 
	
	TRISTE {
		@Override
		double velocidadeAtualizada(double velocidade) {
			return velocidade * 0.8;
		}
	}, 
	
	NERVOSO {
		@Override
		double velocidadeAtualizada(double velocidade) {
			return velocidade * 1.2;
		}
	}, 
	
	ESTRESSADO {
		@Override
		double velocidadeAtualizada(double velocidade) {
			return velocidade * 1.5;
		}
	};
	
	// metodo abstrato
	abstract double velocidadeAtualizada(double velocidade);
	
}
