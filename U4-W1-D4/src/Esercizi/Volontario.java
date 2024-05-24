package Esercizi;

public class Volontario implements CheckIn {
    protected String nome;
    protected int anni;
    protected String[] CV;

    public Volontario(String nome, int anni, String[] cv){
        this.nome = nome;
        this.anni = anni;
        this.CV = cv;
    }
    @Override
   public void WorkCheckIn(){
        System.out.println("I volontari hanno check-in libero");
    }


}

