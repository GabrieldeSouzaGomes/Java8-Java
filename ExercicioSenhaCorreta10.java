//10. Senha correta Peça para o usuário digitar uma senha e continue pedindo até que ele insira a senha correta.

package lista08;

import java.util.Scanner;

public class ExercicioSenhaCorreta10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "12345";  // Defina aqui a senha correta
        String senhaDigitada = "";

        while (!senhaDigitada.equals(senhaCorreta)) {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();

            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }

        System.out.println("Senha correta! Acesso permitido.");
        scanner.close();
    }
}
