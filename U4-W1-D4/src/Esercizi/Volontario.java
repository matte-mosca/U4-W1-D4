package Esercizi;

public class Volontario implements WorkCheckIn {
    protected String nome;
    protected int anni;
    protected String[] CV;

    public Volontario(String nome, int anni, String[] cv){
        this.nome = nome;
        this.anni = anni;
        this.CV = cv;
    }
    @Override
   public void CheckIn(){
        System.out.println("I volontari hanno check-in libero");
    }


}

