package Esercizi;

public class Dirigente extends Dipendente {
    public Dirigente (int matricola, double stipendio, Dipartimento dipartimento){
        super (matricola, stipendio, dipartimento);

    }

    @Override
    public double calculateSalary() {
        return stipendio * 14;
    }
}
