package manha_pre_interface;

public class Main {
    
    public static void main(String[] args) {
        
        // Gato gato = new Gato();
        // gato.emitirSom();

        // Cachorro cachorro = new Cachorro();
        // cachorro.emitirSom();



        // Na definição prefere-se colocar a super classe
        // Na inicialização prefere-se colocar a sub classe correspondente
        // NÃO É VALIDO PARA QUANDO USAR HERANÇA PURA
        Animal animal = new Gato();
        animal.emitirSom();

        animal = new Cachorro();
        animal.emitirSom();

        System.out.println(animal.PATAS);

        
        // E se vier um animal com um número de patas diferente? (HERANÇA ou CLASSE ABSTRATA)
    }

    public static void chamaOMetodoEmiteSom(Animal animal) {
        animal.emitirSom();
    }

}
