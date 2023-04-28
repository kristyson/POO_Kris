package Exercicio;

public class Usuario {
    
    public static void main(String []args) throws Exception{

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Está ligada ? "+ smartTv.ligada);
        System.out.println("Canaal Atual: "+ smartTv.canal);
        System.out.println("Volume Atual ? "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv ligada ? "+ smartTv.ligada);

    }
}