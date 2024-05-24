package Esercizi;

public class DipendenteFullTime extends Dipendente implements CheckIn {
    public DipendenteFullTime (int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return stipendio * 12;
    }

    @Override
    public void WorkCheckIn() {
        System.out.println("I dipendenti full time lavorano dalle 8 alle 18");
    }
}
