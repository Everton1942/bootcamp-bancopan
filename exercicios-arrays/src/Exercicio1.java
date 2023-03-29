/*
 * Crie um vetorde 6 números inteiros e mostre-os na ordem inversa. 
 */

public class Exercicio1 {
    public static void main(String[] args) {

        int contador = 0;

        int[] vetorNumeros = {1, 2, 3, 4, 5, 6}; //Array unidimensional (uma linha e uma/várias colunas).

        //System.out.println(vetorNumeros.length);

        // while(contador < (vetorNumeros.length)) { //Utilizando o array e verificando o tamanho dele com o método ".length", também colocando o tamanho dele como condição do loop.
        //     System.out.println("Posição do índice do vetor: " + contador + " e o valor atribuío àquela posição: " + vetorNumeros[contador] + ""); //Iniciando o loop determinando a posição do array com o mesmo valor do contador, que é 0.
        //     contador++; //A cada vez que o loop for executado, haverá um incremento no contador, mudando a posição do array também até que a condição do laço passe a ser falsa.
        // }

        for(int contador1 = (vetorNumeros.length -1); contador1 >= 0; contador1--) {
            System.out.println("Posição do índice do vetor: " + contador1 + " e o valor atribuído àquela posição: " + vetorNumeros[contador1]);
        }
    }

}
