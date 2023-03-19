package manha2_strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        
		// Motorista motorista = new Motorista("Jose", TipoStatusMotoristaEnum.TRANQUILO);
		// System.out.println(motorista.acelerar(10));
		  
		// motorista.setTipoStatusMotoristaEnum(TipoStatusMotoristaEnum.NERVOSO);
		// System.out.println(motorista.acelerar(10));
		  
		// motorista.setTipoStatusMotoristaEnum(TipoStatusMotoristaEnum.TRISTE);
		// System.out.println(motorista.acelerar(10));
		
		// motorista.setTipoStatusMotoristaEnum(TipoStatusMotoristaEnum.ESTRESSADO);
		// System.out.println(motorista.acelerar(10));
		
		// System.out.println(motorista.podeDirigir());
		  
		// motorista.setTipoStatusMotoristaEnum(TipoStatusMotoristaEnum.TRISTE);
		// System.out.println(motorista.podeDirigir());


        Motorista motorista = new Motorista("Jose", TipoStatusMotoristaEnum.TRANQUILO);
		Motorista motorista1 = new Motorista("Maria", TipoStatusMotoristaEnum.ESTRESSADO);
		Motorista motorista2 = new Motorista("Mendes", TipoStatusMotoristaEnum.TRISTE);
		Motorista motorista3 = new Motorista("Ana", TipoStatusMotoristaEnum.NERVOSO);

        List<Motorista> listaMotorista = new ArrayList<Motorista>();

        listaMotorista.add(motorista);
        listaMotorista.add(motorista1);
        listaMotorista.add(motorista2);
        listaMotorista.add(motorista3);

        for(Motorista motorista0 : listaMotorista) {
            System.out.println(motorista0.toString());
            System.out.println(motorista0.acelerar(10));
            System.out.println("Pode dirigir: " + motorista0.podeDirigir());
        }
		 
        System.out.println(listaMotorista.toString());
    }

}
