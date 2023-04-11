import java.util.Scanner;

public class SegundoMaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int tamanho = sc.nextInt();
        int[] numeros = new int[tamanho];

        System.out.println("Digite os números do array:");
        for (int i = 0; i < tamanho; i++) {
            numeros[i] = sc.nextInt();
        }
        sc.close();

        int segundoMaior = encontrarSegundoMaiorNumero(numeros);
        System.out.println("O segundo maior número é: " + segundoMaior);
    }

    public static int encontrarSegundoMaiorNumero(int[] numeros) {
        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                segundoMaior = maior;
                maior = numeros[i];
            } else if (numeros[i] > segundoMaior && numeros[i] < maior) {
                segundoMaior = numeros[i];
            }
        }

        return segundoMaior;
    }
}
