package manha_pre_interface;

public class Gato implements Animal {
    
    @Override
    public void emitirSom() {
        System.out.println("O Gato faz Miau Miau");
    }

    @Override
    public int retornaIdade() {
        return 0;
    }

    public String retorna() {
        return null;
    }

}
