package manha2_pre_abstrata;

public abstract class Animal {
    
    // Pode ter atributos
    // A decisao entre private e protected depende da importancia em encapsular o atributo/informação
    protected String name;
    private int patas = 3;

    // Pode ter metodos abstratos
    public abstract void emitirSom();

    // Pode ter metodos com corpo
    public void imprimeNumeroPatas() {
        System.out.println(this.patas);
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
