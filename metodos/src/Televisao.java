public class Televisao {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void avancarCanal() {
        canal++;
        System.out.println("Avançando para o canal: " + canal);
    }

    public void retrocederCanal() {
        canal--;
        System.out.println("Retrocedendo para o canal: " + canal);
    }

    public void escolherCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("O novo canal escolhido foi o: " + canal);
    }
}
