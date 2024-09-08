import java.util.Scanner;

public class PossuiLetraA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine().toLowerCase();
        scanner.close();

        contarA(texto);
    }

    public static void contarA(String texto) {

        int quantidadeA = 0;
        quantidadeA = texto.length() - texto.replace("a", "").length();

        if (quantidadeA > 0) {
            System.out.println("A letra 'a' aparece " + quantidadeA + " vezes");
        } else {
            System.out.println("A letra 'a' não está presente.");
        }
    }
}