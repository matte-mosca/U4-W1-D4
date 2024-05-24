import Esercizi.*;

public class Main {
    public static void main(String[] args) {

        // Dipendente dipendente1 = new Dipendente(1001, 1500, Dipartimento.Produzione );
        // Dipendente dipendente2 = new Dipendente(1002, 1800, Dipartimento.Vendite);
        // Dipendente dipendente3 = new Dipendente(1003, 2200, Dipartimento.Amministrazione);
        // Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3};

        //for (int i = 0; i < dipendenti.length ; i++) {
          //  System.out.println("Matricola: " + dipendenti[i].getMatricola());

        Dipendente dipendente4 = new DipendenteFullTime (1004, 1500, Dipartimento.Produzione );
        Dipendente dipendente5 = new DipendentePartTime(1005, 80, 8.5, 680, Dipartimento.Vendite);
        Dipendente dipendente6 = new Dirigente(1006, 2200, Dipartimento.Amministrazione);

        Dipendente[] dipendenti = {dipendente4,dipendente5,dipendente6};

        Volontario volontario1 = new Volontario("Valerio", 20, new String[]{"Cuoco", "Cameriere", "Allevatore di insetti"});

        for (int i = 0; i < dipendenti.length ; i++) {
            System.out.println("Matricola: " +dipendenti[i].getMatricola()+ ", stipendio: " +dipendenti[i].calculateSalary() );

        }

        volontario1.WorkCheckIn();


    }
}


