package tarde1;

public class Carro {
	
	///Atributos
	private String proprietario;
	private String modelo;
	private String cor;
	private double velocidade;
	private double kilometros;
	private int ano;
	
	///Construtor 1
	public Carro(String proprietario, String modelo, String cor, int ano) {
		this.proprietario = proprietario;
		this.modelo = modelo;
		this.cor = cor;
		this.velocidade = 0;
		this.kilometros = 0;
		this.ano = ano;
	}

	
	///Metodos (get, set)
	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getVelocidade() {
		return velocidade;
	}
	
	public double getKilometros() {
		return velocidade;
	}

	public void setKilometros(double kilometros) {
		this.kilometros = kilometros;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}


	@Override
	public String toString() {
		return "Carro [proprietario=" + proprietario + ", modelo=" + modelo + ", cor=" + cor + ", velocidade="
				+ velocidade + ", kilometros=" + kilometros + ", ano=" + ano + "]";
	}
	
	
	public void acelerar(double velocidade) {
		//no futuro validar a velocidade maxima
		System.out.println("Acelerando...");
		
		this.velocidade = this.velocidade + velocidade;
		this.kilometros = this.kilometros + velocidade;
	}
	
	public void frear(double velocidade) {
		
		System.out.println("Freando...");
		
		if((this.velocidade - velocidade) < 0) {
			this.kilometros = 0;
			System.out.println("Carro parado");
		} 
		
		else {
			this.velocidade = this.velocidade - velocidade;
		}
		
	}
}
