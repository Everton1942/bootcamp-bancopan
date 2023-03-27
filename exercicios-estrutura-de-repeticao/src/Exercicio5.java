/*
 * Faça um gerador de tabuada que seja capaz de gerar a tabuada de qualquer número...
 * ...inteiro entre 1 a 10. O usuário deve informar qual número ele deseja ver a tabuada.
 * A saída deve ser do numero x 1 até numero x 10.
 */

 import java.util.Locale;
 import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner escaneador = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe um número ao qual você queira ver a tabuda de 1 até 10.");

        System.out.print("\nInforme o número: ");
        int numero = escaneador.nextInt();
        

        if (numero > 10 || numero < 1) {
            System.out.println("\nO número informado diferente do exigido, tente novamente.");
        } else {
            System.out.println("Tabuada do número: " + numero);

            for (int contador = 1; contador <= 10; contador++) { // Três condições, primeiro o contador e sua inicialização, depois até onde o contador vai e qual incremento o contador receberá a cada laço.
                int resultado = numero * contador;
    
                System.out.println("O resultado de " + numero + " x " + contador + " é: " + resultado);
            }
        }

    }
}
