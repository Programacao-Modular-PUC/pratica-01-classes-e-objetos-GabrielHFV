
public class Pessoa {
	private String nome;
	private String sobrenome;
	private int idade;
	private double altura;
	private double peso;
	private double imc;

	public Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.imc = CalcularIMC();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
		this.imc = CalcularIMC();
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.imc = CalcularIMC();
	}

	public double getIMC() {
		return imc;
	}

	public void setIMC(double imc) {
		this.imc = imc;
	}

	public double CalcularIMC() {
		if (altura <= 0) {
			return 0.0;
		}
		return peso / (altura * altura);
	}

	public String InformaObesidade() {
		imc = CalcularIMC();

		if (imc < 18.5) {
			return "Abaixo do peso";
		}
		if (imc <= 24.9) {
			return "Peso normal";
		}
		if (imc <= 29.9) {
			return "Sobrepeso";
		}
		if (imc <= 34.9) {
			return "Obesidade grau 1";
		}
		if (imc <= 39.9) {
			return "Obesidade grau 2";
		}
		return "Obesidade grau 3";
	}
}
