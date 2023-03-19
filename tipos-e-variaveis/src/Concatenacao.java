public class Concatenacao {
    public static void main(String[] args) {
        
        String testeConcatencao = "?";

        testeConcatencao = 1 + 1 + 1 + "1"; //Enquanto o Java detecta que os valores são numéricos e estão realizando a soma, isso ocorrerá até que a string seja identificada, aí sim realizando a concatenação.
        System.out.println(testeConcatencao);

        testeConcatencao = 1 + "1" + 1 + 1; //Identificou que logo após um número veio um tipo string, então realizou apenas a concatenação e não soma.
        System.out.println(testeConcatencao);

        testeConcatencao = 1 + "1" + 1 + "1";
        System.out.println(testeConcatencao);

        testeConcatencao = "1" + 1 + 1 + 1; //Nos casos onde ele detecta uma string sem nada em evidência, é realizada apenas a concatenação.
        System.out.println(testeConcatencao);

        testeConcatencao = "1" + (1 + 1 + 1); //Como há um valor em evidência, primeiro foi realizado a operação e depois a concatenação.
        System.out.println(testeConcatencao);

    }
    
}
