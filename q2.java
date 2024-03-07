
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Por favor, informe um número inteiro positivo.");
            return;
        }

        boolean pertence = verificaSePertenceFibonacci(numero);

        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    static boolean verificaSePertenceFibonacci(int numero) {
        int a = 0;
        int b = 1;

        while (b <= numero) {
            if (b == numero) {
                return true;
            }

            int proximo = a + b;
            a = b;
            b = proximo;
        }

        return false;
    }
}


