package Esercizi;

public abstract class Dipendente {
    protected int matricola;
    protected double stipendio;
    protected Dipartimento dipartimento;

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public Dipendente(int matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public int getMatricola() {
        return matricola;
    }

    //public double getStipendio() {
    //    return stipendio;}


    public abstract double calculateSalary();

    public Dipartimento getDipartimento() {
        return dipartimento;
    }
}

