import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o nome: ");
		String nome = scanner.nextLine();

		System.out.print("Digite o sobrenome: ");
		String sobrenome = scanner.nextLine();

		System.out.print("Digite a idade: ");
		int idade = Integer.parseInt(scanner.nextLine().trim());

		System.out.print("Digite a altura (ex: 1.75): ");
		double altura = Double.parseDouble(scanner.nextLine().trim().replace(',', '.'));

		System.out.print("Digite o peso (kg): ");
		double peso = Double.parseDouble(scanner.nextLine().trim().replace(',', '.'));

		Pessoa pessoa = new Pessoa(nome, sobrenome, idade, altura, peso);
		double imc = pessoa.CalcularIMC();

		System.out.println();
		System.out.println("Pessoa: " + pessoa.getNome() + " " + pessoa.getSobrenome());
		System.out.println("IMC: " + imc);
		System.out.println("Faixa: " + pessoa.InformaObesidade());

		scanner.close();
	}
}
