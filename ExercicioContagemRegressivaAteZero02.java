//2. Contagem regressiva Peça para o usuário digitar um número e exiba uma contagem regressiva até 0.

package lista08;

import java.util.Scanner;

public class ExercicioContagemRegressivaAteZero02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para a contagem regressiva: ");
        int numero = scanner.nextInt();

        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }

        scanner.close();
    }
}

