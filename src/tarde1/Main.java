package tarde1;

public class Main {
	
	public static void main(String[] args) {
		//Inicializando os objetos
		Motorista motorista = new Motorista("Jose", 30, "12312312");
		// Para conhecer os detalhes do carro
		Carro carro = new Carro("Marcelo", "Celta", "Preto", 2002);
		motorista.cadastrarCarroPrincipal(carro);
		
		
		System.out.println(carro.toString());
		
		System.out.println(motorista.toString());
		
		
		// Mudar a aceleração conforme o humor (SEM ENUM)
		//motorista.alterarParaEstressado();
		
		motorista.alterarStatus(TipoStatusEnum.ESTRESSADO);
		System.out.println(motorista.toString());
		
		// Acelerar o carro
		motorista.acelerar(10);
		
		System.out.println(motorista.getCarroPrincipal().toString());
		
		// Frear o carro
		motorista.frear(10);
		
		System.out.println(motorista.getCarroPrincipal().toString());
		
		// alterar para nervoso
		motorista.alterarStatus(TipoStatusEnum.NERVOSO);
		
		// Acelerar o carro
		motorista.acelerar(10);
				
		System.out.println(motorista.getCarroPrincipal().toString());
	}
	
}
