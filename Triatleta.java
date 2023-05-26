package ATV11;

public class Triatleta extends Pessoa implements Nadador, Corredor, Ciclista{
    
    public Triatleta(String nome){
        super(nome);
    }

    public void correrDeBicicleta(){
        System.out.println("pedalando o mais rapido possivel...");
    }

    public void aquecer(){
        System.out.println("aquecendo...");
    }
    
    public void correr(){
        System.out.println("correndo...");
    }

    public void nadar(){
        System.out.println("nadando...");
    }
}
