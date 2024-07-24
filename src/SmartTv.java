public class SmartTv {

  boolean ligada = false;
  int volume = 25;
  int canal = 1;

  //exemplo de método construtor de classe (sempre colocar abaixo dos atributos//
  // public SmartTv (int volume, int canal) {
  //   this.volume = volume; usa 'this' para se referir ao nome da variável que vou usar na main, independente de qual for
  //   this.canal = canal;
  // }

  public void mudarCanal (int novoCanal) {
    canal = novoCanal;
  }

  public void aumentarCanal () { 
    canal++;
  }

  public void diminuirCanal () {
    canal--;
  }

  public void aumentarVolume () {
    volume++;
    System.out.println("Aumentando o volume para: " + volume);
  }

  public void diminuirVolume () {
    volume--;
    System.out.println("Diminuindo o volume para: " + volume);
  }

  public void ligar () {
    ligada = true;
  }

  public void desligar () {
    ligada = false;
  }
  
}
