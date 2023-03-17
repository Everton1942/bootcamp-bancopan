public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        short numeroCurto1 = 1;
        int numeroNormal1 = numeroCurto1; // Atribuindo um valor short dentro de um tipo int - É compatível.
        // short numeroCurto2 = numeroNormal1; // Já não é possível atribuir um valor do tipo int dentro de um tipo short, pois o tipo int é maior. Para isso, é preciso fazer uso do método "casting".
        short numeroCurto2 = (short) numeroNormal1;

        final double VALOR_DE_PI = 3.14; //Exemplo de constante.

    }
}