package Esercizi;

public class Dirigente extends Dipendente implements CheckIn {
    public Dirigente (int matricola, double stipendio, Dipartimento dipartimento){
        super (matricola, stipendio, dipartimento);

    }

    @Override
    public double calculateSalary() {
        return stipendio * 14;
    }

    @Override
    public void WorkCheckIn() {
        System.out.println("I dirigenti possono entrare tra le 8 e le 10, e stacccare tra le 18 e le 20");
    }
}
