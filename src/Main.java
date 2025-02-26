import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        int n1, n2;
        double raiz1, raiz2;

        do{
            System.out.println("ingrese el valor de n1");
            n1 = teclado.nextInt();
        } while (n1<=0);
        do{
            System.out.println("ingrese el valor de n2");
            n2 = teclado.nextInt();
        }while (n2<=0);
        raiz1 = Math.sqrt(n1);
        raiz2 = Math.sqrt(n2);

        System.out.println("la raiz de n1 es" + raiz1);
        System.out.println("la raiz de n2 es" + raiz2);

    }
}
