/*
 * Faça um programa que leia 5 número, informe o maior número e imprima a média...
 * ...dos 5 números informados.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner escaneador = new Scanner(System.in).useLocale(Locale.US);

        double numero;
        double maiorNumero = 0;
        double soma = 0;
        int contador = 0;

        System.out.println("Informe 5 números: ");

        do {
            numero = escaneador.nextDouble();
            
            soma += numero;

            if (numero > maiorNumero) maiorNumero = numero;

            contador++;
            System.out.println("Quantia de números informados: " + contador);

        } while (contador < 5);

        System.out.println("\nO maior número é: " + maiorNumero);

        System.out.println("\nA média dos números números informados é: " + soma / 5);
    }
}