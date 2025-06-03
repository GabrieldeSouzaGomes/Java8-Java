//4. Tabuada de um número Peça para o usuário digitar um número e exiba sua tabuada de 1 a 10 utilizando um laço enquanto.

package lista08;

import java.util.Scanner;

public class ExercicioUmLacoEnquatoUmADez04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }

        scanner.close();
    }
}
