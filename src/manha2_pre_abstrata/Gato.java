package manha2_pre_abstrata;

public class Gato extends Animal {

    public Gato() {
        super.setPatas(4);
        super.setName("Bartolomeu");
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato faz Miau Miau");
    }

    @Override
    public String toString() {
        return "Gato []" + super.getName() + super.getPatas();
    }
}
