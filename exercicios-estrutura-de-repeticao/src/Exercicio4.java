/*
 * Faça um programa que paça N números inteiros, calcule e mostre a quantia de números...
 * ...pares e a quantia de números impares.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner escaneador = new Scanner(System.in).useLocale(Locale.US);

        int quantiaNumeros;
        int numero;
        int quantiaPares = 0, quantiaImpares = 0;
        int contador = 0;

        System.out.print("Quantia de número a serem inseridos: ");
        quantiaNumeros = escaneador.nextInt();

        do {
            System.out.print("\nNúmero: ");
            numero = escaneador.nextInt();

            if (numero % 2 == 0) quantiaPares++; // Se o resultado do resto da divisão do número por 2 for igual a 0, esse número é par. Com isso, é incrementado 1 número na variável da quantia de números pares.
            else quantiaImpares++; // Caso não se enquadre na opção acima, o número é impar.

            contador++;
            System.out.println("Quantos números foram inseridos: " + contador);
        } while (contador < quantiaNumeros);

        System.out.println("Quantidade de números pares: " + quantiaPares);
        System.out.println("Quantidade de números impares: " + quantiaImpares);
    }
}
