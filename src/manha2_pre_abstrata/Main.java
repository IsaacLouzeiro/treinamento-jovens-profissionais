package manha2_pre_abstrata;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        // Animal gato = new Gato();
        // gato.setName("Moises");
        // gato.emitirSom();
        // gato.imprimeNumeroPatas();

        // Animal cachorro = new Cachorro();
        // cachorro.setName("Thor");
        // cachorro.emitirSom();
        // cachorro.imprimeNumeroPatas();


        // Animal aranha = new Aranha();
        // aranha.setName("Edna");
        // aranha.emitirSom();
        // aranha.imprimeNumeroPatas();


        // System.out.println(gato.toString());
        // System.out.println(cachorro.toString());
        // System.out.println(aranha.toString());


        // Criando uma coleção de animais
        List<Animal> listaDeAnimais = new ArrayList<Animal>();
        // System.out.println(listaDeAnimais.size());

        Animal animal1 = new Gato();
        Animal animal2 = new Cachorro();
        Animal animal3 = new Aranha();

        listaDeAnimais.add(animal1);
        System.out.println(listaDeAnimais.size());

        listaDeAnimais.add(animal2);
        System.out.println(listaDeAnimais.size());

        listaDeAnimais.add(animal3);
        System.out.println(listaDeAnimais.size());

        for(Animal animal : listaDeAnimais) {
            System.out.println(animal.toString());
        }

        // Para acessar os objetos da colecao, pode-se iterar (for) ou via get(index)
		System.out.println(listaDeAnimais.get(0));
		System.out.println(listaDeAnimais.get(listaDeAnimais.size() - 1));

    }

}
