package manha_pre_interface;

public interface Animal {
    // Todos os campos de uma interface são public static e FINAL, por isso normalmente nas interfaces temos apenas a assinatura dos metodos
    public static final int PATAS = 4;

    // Todas as classes que implementarem a interface Animal DEVEM obrigatoriamente implementar o metodo emitirSom()
    void emitirSom();

    // Todas as classes que implementarem a interface Animal DEVEM obrigatoriamente implementar o metodo retornaIdade()
    int retornaIdade();

    String retorna();
}
