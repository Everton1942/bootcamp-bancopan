/*
 * Faça um programa que peça uma nota, entre 0 e 10.
 * Caso o valor seja inválido, o programa deve seguir em execução até que seja...
 * ...informado um valor válido.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner escaneador = new Scanner(System.in).useLocale(Locale.US);

        int nota;

        System.out.println("Informe uma nota entre 0 e 10.");

        System.out.print("\nDigite a nota: ");
        nota = escaneador.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.print("\nNota inválida, digite novamente uma nota: ");
            nota = escaneador.nextInt();
        }

        System.out.println("Nota válida, finalizando...");

    }

}
