/*
 * Faça um programa que leia conjuntos de dois valores, o primeiro representando...
 * ...o nome do aluno e o segundo a sua idade.
 * Pare a execução do programa inserindo 0 no campo nome.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner escaneador = new Scanner(System.in).useLocale(Locale.US);

        String nome;
        int idade;

        System.out.println("Olá aluno, insira o seu nome e idade. Caso deseje parar a execução, digite: 0.");

        while (true) {
            System.out.print("\nDigite seu nome: ");
            nome = escaneador.next();
            if (nome.equals("0")) {
                System.out.println("\nNúmero 0 informado pelo usuário, finalizando...");
                break;
            }
    
            System.out.print("\nDigite a sua idade: ");
            idade = escaneador.nextInt();
        }

    }
}
