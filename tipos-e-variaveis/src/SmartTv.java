public class SmartTv {
    boolean ligada = false;
    int canal;
    int volume;

    public SmartTv() {
    };
    public SmartTv(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public boolean isLigada() {
        return ligada;
    }
    public void setLigada(boolean ligada) {
        this.ligada = ligada;

    }

    public void ligarDesligarTv(){
        this.ligada = !this.ligada;
    }
    public void aumentarVolume(){
        this.volume = this.volume + 1;
    }
    public void diminuirVolume(){
        this.volume = this.volume - 1;
    }
    public void mudarCanal(int canal) {
        this.canal = canal;
    }
    public void aumentarCanal(){
        this.canal = this.canal + 1;
    }
    public void diminuirCanal(){
        this.canal = this.canal - 1;
    }
}
