import javax.sound.sampled.SourceDataLine;

public class OperadoresLogicos {
    public static void main(String[] args) {
        
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2) {
            System.out.println("Ambas as condições são verdadeiras.");
        }
        else {
            System.out.println("A condição da estrutura é falsa.");
        }

        if(condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira.");
        }
        else {
            System.out.println("Nenhuma condição é verdadeira.");
        }

    }
}
