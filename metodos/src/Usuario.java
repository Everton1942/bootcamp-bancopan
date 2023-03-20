public class Usuario {
    public static void main(String[] args) throws Exception {
        Televisao smartTv = new Televisao();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual da TV: " + smartTv.canal);
        System.out.println("Volume atual da TV: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo volume da TV: " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Novo volume da TV: " + smartTv.volume);

        smartTv.escolherCanal(15);
        System.out.println("Canal atual da TV: " + smartTv.canal);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
    }
    
}
