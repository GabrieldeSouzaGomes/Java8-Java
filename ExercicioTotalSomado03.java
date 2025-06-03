//. Soma de números positivos Peça ao usuário para digitar números positivos e some-os. 
//O programa deve parar quando o usuário inserir um número negativo e exibir o total somado.

package lista08;

import java.util.Scanner;

public class ExercicioTotalSomado03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número positivo (ou negativo para sair): ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                soma += numero;
            }

        } while (numero >= 0);

        System.out.println("Soma total dos números positivos: " + soma);

        scanner.close();
    }
}
