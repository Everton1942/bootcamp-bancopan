public class OperadoresUnarios {
    public static void main(String[] args) {
        
        // ---------------------------------------------------------
        
        // Terceiro teste com operadores unário. Invertendo o valor de uma variável boolena.

        boolean variavel = true;

        System.out.println(!variavel); // Fazendo com que o valor da variável seja atribuido como falso de forma temporária.

        System.out.println(variavel);
        
        variavel = !variavel; // Fixando que a variável agora assumirá o valor false de definitivamente.

        System.out.println(variavel);



        
        // ---------------------------------------------------------
        
        /* - Segundo teste com operadores unários.
        
        int numero = 5;

        numero++; // Forma de abreviar códigos a serem digitados. A forma menos prática seria "numero = numero + 1;
        // E a mesma regra vale para o operador de decremento.
        
        System.out.println(numero); */

        // ---------------------------------------------------------
        
        /* - Primeiro teste com operadores unários.
        
        int numero = 5;

        System.out.println(- numero); // Imprimindo a variável com operador de negação.

        System.out.println(numero); // Verificando se após a impressão anterior, se o valor da variável passaria a ser negativo.

        numero = -numero;

        System.out.println(numero); // Na forma anterior, a lógica não funciona. Esta é a forma mais adequada.

        // numero = +numero; -> Forma incorreta de tentar converter o valor da variável "numero" para positivo.

        numero = +numero * -1; // Forma correta de converter para o valor positivo.

        System.out.println(numero); */
    }
}
