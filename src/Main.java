import java.util.Random;

public class numeros_aleatorios {
    public static void main(String[] args) {
        Random ale = new Random();
        int minT = 2;
        int maxT = 100;
        int minN = 1;
        int maxN = 6;
        int sumaD1 = 0;
        int sumaD2 = 0;


        for (int i = 0; i < ale.nextInt(maxT - minT + 1) + minT; i++) {
            int dado1 = ale.nextInt(maxN - minN + 1) + minN;
            int dado2 = ale.nextInt(maxN - minN + 1) + minN;
            sumaD1 += dado1;
            sumaD2 += dado2;
            System.out.println("Tiro " + (i + 1) + ": Dado 1 = " + dado1 + ", Dado 2 = " + dado2);
        }
        System.out.println("Suma total del Dado 1: " + sumaD1);
        System.out.println("Suma total del Dado 2: " + sumaD2);

    }
}
