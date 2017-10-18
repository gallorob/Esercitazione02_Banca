/**
 * @author Roberto Gallotta
 */

public class BancaTester {
    public static void main(String[] args) {
        Banca b1 = new Banca("NomeBanca", 5);

        b1.aggiungiConto("CodiceFiscale1");
        b1.aggiungiConto("CodiceFiscale2");
        b1.aggiungiConto("CodiceFiscale3");

    }
}
