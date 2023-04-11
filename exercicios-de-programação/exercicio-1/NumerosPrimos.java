import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int limite = sc.nextInt();
        sc.close();

        System.out.println("Números primos até " + limite + ":");
        for (int i = 2; i <= limite; i++) {
            if (ehPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
