package manha2_pre_abstrata;

public class Aranha extends Animal {

    public Aranha() {
        super.setPatas(8);
        super.setName("Fifi");
    }

    @Override
    public void emitirSom() {
        System.out.println("A aranha faz ...");
    }

    @Override
    public String toString() {
        return "Aranha []" + super.getName() + super.getPatas();
    }

}