package Esercizi;

public class DipendentePartTime extends Dipendente implements CheckIn {
    private int oreMensili;
    private double pagaOraria;

    @Override
    public double calculateSalary() {
        return oreMensili * pagaOraria * 12;
    }

    public DipendentePartTime (int matricola, int oreMensili,double pagaOraria, double stipendio, Dipartimento dipartimento){
        super(matricola,stipendio, dipartimento);
        this.oreMensili = oreMensili;
        this.pagaOraria = pagaOraria;

    }

    @Override
    public void WorkCheckIn() {
        System.out.println("I dipendenti Part-time lavorano solo la mattina dalle 8 alle 13");
    }
}
