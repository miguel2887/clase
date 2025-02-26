import java.util.Scanner;

public class Masa_coporal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso (en kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura (en metros): ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.println("Su IMC es: " + imc);

        if (imc < 18.5) {
            System.out.println("Usted tiene un peso bajo.");
        } else if (imc < 25) {
            System.out.println("Usted tiene un peso normal.");
        } else if (imc < 30) {
            System.out.println("Usted tiene sobrepeso.");
        } else {
            System.out.println("Usted tiene obesidad.");
        }
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / Math.pow(altura, 2);
    }
}
