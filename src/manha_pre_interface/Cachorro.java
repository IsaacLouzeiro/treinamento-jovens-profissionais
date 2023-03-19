package manha_pre_interface;

public class Cachorro implements Animal {
    
    @Override
    public void emitirSom() {
        System.out.println("O Cachorro faz Au Au");
    }

    @Override
    public int retornaIdade() {
        return 1;
    }

    @Override
    public String retorna() {
        return null;
    }

}
