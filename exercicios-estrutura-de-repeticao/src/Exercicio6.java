/*
 *  Faça um programa que calcule o valor fatorial de um número inteiro fornecido...
 *  ...pelo usuário. Ex: 5 != 120 (5 * 4 * 3 * 2 * 1)
 */

 import java.util.Locale;
 import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner escaneador = new Scanner(System.in).useLocale(Locale.US);

        int multiplicacao = 1;

        System.out.print("Informe um número que você queira ver o fatorial: ");
        int numero = escaneador.nextInt();

        System.out.print("\nO fatorial de "+ numero + " é: ");

        for (int contador = numero; contador >= 1; contador--) {
            multiplicacao *= contador;

        }

        System.out.print(multiplicacao);

    }
}
