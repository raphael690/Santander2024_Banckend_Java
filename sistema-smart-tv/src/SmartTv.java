public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    //metodos que manipulam o status da tv
    public void mudarCanal(int novoCanal)
    {
        canal = novoCanal;
    }
    public void aumentarCanal()
    {
        canal++;
    }
    public void diminuirCanal()
    {
        canal--;
    }
    public void ligar()
    {
        ligada = true;
    }
    public void desligar()
    {
        ligada = false;
    }
    //Nossa Tv poderá ligar e desligar e assim mudar o estado ligada;
    public void aumentarVolume()
    {
        //volume  = volume + 1;
        volume++;
        System.out.println("Aumentando o Volume para: " + volume);
    }

    public void diminuirVolume()
    {
        volume--;
        System.out.println("Diminuindo o Volume para: " + volume);
    }
}
