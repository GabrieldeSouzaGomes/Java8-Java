//9. Fatorial de um número Peça ao usuário para digitar um número e calcule seu fatorial usando um laço enquanto.

package lista08;

import java.util.Scanner;

public class ExercicioFatoralDeUmNumero09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo para calcular o fatorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Fatorial não é definido para números negativos.");
        } else {
            int resultado = 1;
            int i = 1;
            while (i <= numero) {
                resultado *= i;
                i++;
            }
            System.out.println("O fatorial de " + numero + " é " + resultado);
        }

        scanner.close();
    }
}
