//8. Contagem de vogais Peça para o usuário digitar uma palavra e conte quantas vogais (a, e, i, o, u) ela possui.

package lista08;

import java.util.Scanner;

public class ExercicioContagemDeVogais08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine().toLowerCase(); // converte para minúsculas

        int contadorVogais = 0;

        int i = 0;
        while (i < palavra.length()) {
            char letra = palavra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVogais++;
            }
            i++;
        }

        System.out.println("A palavra contém " + contadorVogais + " vogais.");

        scanner.close();
    }
}
