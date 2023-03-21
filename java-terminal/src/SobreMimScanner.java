import java.util.Locale;
import java.util.Scanner;

public class SobreMimScanner {
    public static void main(String[] args) {
        Scanner escaneador = new Scanner(System.in).useLocale(Locale.US); //Criando um objeto scanner.


        System.out.println("Digite seu nome: ");
        String nome = escaneador.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = escaneador.next();

        System.out.println("Digite sua idade: ");
        int idade = escaneador.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = escaneador.nextDouble(); //Aguarda que o usuário informe um parâmetro, com este parâmetro sendo configurado como o tipo double.
        
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + "cm");
    }
}
