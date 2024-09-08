import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número a ser verificado:");
        int numero = leitor.nextInt();
        if (numero < 0) {
            System.out.println("Números negativos não estão presentes na sequência de Fibonacci");
        } else if(verificarFibonacci(numero)){
            System.out.println("O número " + numero + " está presente na sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não está presente na sequência de Fibonacci.");
        }
        leitor.close();
    }

    public static boolean verificarFibonacci(int numero) {
        System.out.println("Iniciando verificação");
        int a = 0;
        int b = 1;
        System.out.println(a);
        while (a < numero) {
            int atual = a;
            a = b;
            b = atual + b;
            System.out.println(a);
        }
        return a == numero;
    }
}