/**
 * @author Roberto Gallotta
 */

public class Banca {
    private String nome;
    private int numContiAttivi;
    private final int CONTIMAX;
    private Conto[] conti;
    private String radIban = "IT00000";

    // Costruttore con nome e contimax
    public Banca(String nome, int contMax) {
        this.nome = nome;
        this.CONTIMAX = contMax;
        this.conti = new Conto[this.CONTIMAX];
    }

    public Conto aggiungiConto(String cf) {
        String iban = this.radIban + this.nome + "000" + (numContiAttivi + 1);
        this.conti[numContiAttivi] = new Conto(iban, cf);
        System.out.println("Conto creato");
        return conti[++this.numContiAttivi];
    }

    // Metodo ritorna saldo totale
    double totSaldo(){
        double totSaldo = 0;
        for (int i = 0; i < this.conti.length; i++) {
            totSaldo += conti[i].getSaldo();
        }
        return totSaldo;
    }

    // Metodo gestisce prelievo o deposito
    public void operazione(double importo, String iban) {
        for (int i = 0; i < conti.length; i++) {
            if(conti[i].getIban().equals(iban)) {
                if(importo < 0) {
                    conti[i].prelievo(importo);
                    System.out.println("Eseguito prelievo di " + Math.abs(importo));
                }
                else {
                    conti[i].deposito(importo);
                    System.out.println("Esegioto deposito di " + importo);
                }
            }
            else System.out.println("IBAN inserito non esistente.");
        }
    }

    // Metodo getConto
    public Conto getConto(String iban) {
        for (int i = 0; i < conti.length; i++) {
            if (conti[i].getIban().equals(iban)) {
                return conti[i];
            }
        }
        System.out.println("CONTO NON TROVATO");
        return null;
    }
}