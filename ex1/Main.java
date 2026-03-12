import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TrianguloRetangulo t = new TrianguloRetangulo();

        System.out.print("Digite o valor do cateto 1: ");
        t.c1 = sc.nextDouble();

        System.out.print("Digite o valor do cateto 2: ");
        t.c2 = sc.nextDouble();

        System.out.println("Hipotenusa: " + t.calculaHipotenusa());
        System.out.println("Área do triângulo: " + t.calculaArea());

        sc.close();
    }
}