package manha2_pre_abstrata;

public class Cachorro extends Animal {
    
    public Cachorro() {
        super.setPatas(4);
        super.setName("Spike");
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro faz Au Au");
    }

    @Override
    public String toString() {
        return "Cachorro []" + super.getName() + super.getPatas();
    }
}
