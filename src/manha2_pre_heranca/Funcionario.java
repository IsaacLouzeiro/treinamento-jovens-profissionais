package manha2_pre_heranca;

import java.math.BigDecimal;

public class Funcionario extends Pessoa {

    private BigDecimal salario;
    private String matriculaFuncional;

    // Atualizar para apontar para o construtor da classe pai
    public Funcionario(String nome, String cpf, int idade, BigDecimal salario, String matriculaFuncional) {
        // Chamando o construtor da super  classe (Pessoa)
        // Super classe também chamada de classe pai
        super(nome, cpf, idade);

        // Iniciando os atributos da sub classe (Funcionario)
        // Sub classe tambem chamada de classe filho
        this.salario = salario;
        this.matriculaFuncional = matriculaFuncional;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getMatriculaFuncional() {
        return matriculaFuncional;
    }

    public void setMatriculaFuncional(String matriculaFuncional) {
        this.matriculaFuncional = matriculaFuncional;
    }

    
    // >>>> Sobre o método CompareTo
	// Valor de retorno: este método pode retornar os seguintes valores:

	// 0 : se o valor deste BigDecimal (this.salario) for igual ao do objeto
	// BigDecimal passado como parâmetro (valorBase).
	
	// 1 : se o valor deste BigDecimal (this.salario for maior que o do objeto
	// BigDecimal passado como parâmetro (valorBase).
	
	// -1 : se o valor deste BigDecimal (this.salario) for menor que o do objeto
	// BigDecimal passado como parâmetro (valorBase).
    public boolean declaraImpostoDeRenda() {
        
        BigDecimal valorBase = new BigDecimal("2640");

        int resultadoCompareTo = this.salario.compareTo(valorBase);

        if(resultadoCompareTo == -1) {
            return false;
        }

        return true;

    }

    // Exemplo que usa um atributo da super classe na sub classe
    public BigDecimal bonusDeAcordoComAIdade() {

        // Se tiver mais de 50 anos, recebe 100 reais de bonus
        if(super.getIdade() > 50) {
            return new BigDecimal("100");
        }

        // Se não tiver mais de 50 anos, recebe 0 reais de bonus
        return new BigDecimal(0);

    }

    // SOBRESCRITA DE METODOS DA CLASSE PAI
    // Por não ter sobrescrito o metodo toString, ao chamar o metodo na classe filha será chamado o da super classe (classe pai) -> Pessoa

    @Override
    public String toString() {
        return "Funcionario [nome= " + super.getNome() + ", cpf= " + super.getCpf() + ", idade" + super.getIdade() + ", salario=" + salario + ", matriculaFuncional=" + matriculaFuncional + "]";
    }

}
