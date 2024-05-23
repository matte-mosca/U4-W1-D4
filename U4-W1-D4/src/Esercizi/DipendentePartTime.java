package Esercizi;

public class DipendentePartTime extends Dipendente {
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
}
