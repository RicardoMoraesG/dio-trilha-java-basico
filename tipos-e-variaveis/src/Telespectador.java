public class Telespectador {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada: " + smartTv.isLigada());
        System.out.println("Canal atual: " + smartTv.getCanal());
        System.out.println("Volume atual: " + smartTv.getVolume());

        smartTv.ligarDesligarTv();
        System.out.println("Ligada: " + smartTv.isLigada());
        smartTv.ligarDesligarTv();
        System.out.println("Ligada: " + smartTv.isLigada());
        smartTv.aumentarVolume();
        smartTv.mudarCanal(10);
        System.out.println("Canal: " + smartTv.getCanal());
    }
}
